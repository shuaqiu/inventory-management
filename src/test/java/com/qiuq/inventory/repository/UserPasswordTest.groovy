/**
 *
 */
package com.qiuq.inventory.repository;

import static org.junit.Assert.*

import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.security.authentication.encoding.PasswordEncoder

/**
 * @author qiushaohua 2012-9-2
 * @version 0.0.1
 *
 */
class UserPasswordTest {

    void testMd5(){
        def context =  new ClassPathXmlApplicationContext("testContext.xml");
        PasswordEncoder passwordEncoder = context.getBean("passwordEncoder");

        def encodedPassword = passwordEncoder.encodePassword("admin", null);
        println(encodedPassword);
        assertEquals("31e191330106e9234692752efd7e8174", encodedPassword);
    }
}
