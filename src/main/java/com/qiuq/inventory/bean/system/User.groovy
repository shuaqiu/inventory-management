/**
 * @author qiushaohua 2012-7-7
 */
package com.qiuq.inventory.bean.system

import java.sql.Timestamp

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.NamedQueries
import javax.persistence.NamedQuery
import javax.persistence.Table
import javax.persistence.Transient

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

import com.qiuq.inventory.bean.CommonBean


/**
 * 用戶信息
 * The persistent class for the YHXX database table.
 *
 */
@Entity
@Table(name="YHXX")
@NamedQueries([
    @NamedQuery(name="User.findAllByUsername", query="select t from User t where t.username = :username")
])
class User extends CommonBean implements UserDetails, Serializable {
    static final long serialVersionUID = 1L;

    /**
     * 用戶名
     */
    @Column(name="UserName", length=50)
    String username;

    /**
     * 用戶密碼
     * ?應該是經過MD5 處理過的?
     */
    @Column(name="UserPsw", length=50)
    String password;

    /**
     * 這個用戶對應的員工ID --> Employer
     */
    @Column(name="YGID")
    int employerId;

    /**
     * 這個用戶對應的員工名稱
     */
    @Column(name="YGName",length=30)
    String employerName;

    /**
     * 是否可以登錄
     * <li>1: 表示可以登錄
     * <li>0(或者為null): 表示不能登錄
     */
    @Column(name="canLogin")
    int loginable;

    /**
     * 用戶所在的權限組ID --> UserGroup
     */
    @Column(name="GroupID")
    int userGroupId;

    /**
     * ?可能是創建這個用戶的時間?
     */
    @Column(name="iDate")
    Timestamp createDate;

    /**
     * 用戶的權限列表
     */
    @Transient
    Collection<? extends GrantedAuthority> authorities = Collections.emptyList();

    /** @author qiushaohua 2012-09-02 */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /** @author qiushaohua 2012-09-02 */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /** @author qiushaohua 2012-09-02 */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /** @author qiushaohua 2012-09-02 */
    @Override
    public boolean isEnabled() {
        return loginable;
    }

    /**
     * Returns {@code true} if the supplied object is a {@code User} instance with the
     * same {@code username} value.
     * <p>
     * In other words, the objects are equal if they have the same username, representing the
     * same principal.
     */
    @Override
    boolean equals(Object rhs) {
        if (rhs instanceof User) {
            return username == ((User) rhs).username;
        }
        return false;
    }

    /**
     * Returns the hashcode of the {@code username}.
     */
    @Override
    int hashCode() {
        return username.hashCode();
    }

    // 以下的字段沒有使用
    // @Column(name="LoginIP", length=30)
    // String loginIP;
    //
    // @Column(name="LoginMac", length=50)
    // String loginMac;
    //
    // @Column(name="LoginTime")
    // Timestamp loginTime;
    //
    // int sortid;
}
