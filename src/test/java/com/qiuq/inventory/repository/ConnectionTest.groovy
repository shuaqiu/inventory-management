/**
 * @author qiushaohua 2012-7-7
 */
package com.qiuq.inventory.repository

import org.junit.Assert
import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate

/**
 * @author qiushaohua 2012-7-7
 * @version 0.0.1
 */
class ConnectionTest {

    @Test
    void testConn(){
        def context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        NamedParameterJdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate");

        int cnt = jdbcTemplate.queryForInt("select count(*) from yhxx", [:]);
        Assert.assertEquals(1, cnt);
    }
}
