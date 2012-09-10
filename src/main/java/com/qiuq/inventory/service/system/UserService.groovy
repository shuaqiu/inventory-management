/**
 *
 */
package com.qiuq.inventory.service.system


import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

import com.qiuq.inventory.repository.system.UserRepo

/**
 * @author qiushaohua 2012-9-1
 * @version 0.0.1
 *
 */
@Service
class UserService implements UserDetailsService{

    final Log log = LogFactory.getLog(UserService.class);

    @Autowired
    UserRepo userRepo;

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<? extends UserDetails> users = userRepo.findAllByUsername(username);

        if (users.size() == 0) {
            log.debug("Query returned no results for user '" + username + "'");

            throw new UsernameNotFoundException("找不到用户${username}");
        }

        UserDetails user = users.get(0); // contains no GrantedAuthority[]

        Set<GrantedAuthority> dbAuthsSet = new HashSet<GrantedAuthority>();
        dbAuthsSet.addAll(loadGroupAuthorities(user.getUsername()));

        if (dbAuthsSet.size() == 0) {
            log.debug("User '${username}' has no authorities and will be treated as 'not found'");

            throw new UsernameNotFoundException("用户${username}没有任何权限设置");
        }

        List<GrantedAuthority> dbAuths = new ArrayList<GrantedAuthority>(dbAuthsSet);
        user.authorities = dbAuths;
        return user;
    }

    /**
     * Loads authorities by executing the SQL from <tt>groupAuthoritiesByUsernameQuery</tt>.
     *
     * @return a list of GrantedAuthority objects for the user
     */
    protected List<GrantedAuthority> loadGroupAuthorities(String username) {
//        return getJdbcTemplate().query(groupAuthoritiesByUsernameQuery, [username], new RowMapper<GrantedAuthority>() {
//            public GrantedAuthority mapRow(ResultSet rs, int rowNum) throws SQLException {
//                String roleName = getRolePrefix() + rs.getString(3);
//
//                return new SimpleGrantedAuthority(roleName);
//            }
//        });
        return [new SimpleGrantedAuthority("admin")];
    }

}
