/**
 *
 */
package com.qiuq.inventory;

import static org.junit.Assert.*

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * @author qiushaohua 2012-9-9
 * @version 0.0.1
 *
 */
class InjectTest {

    @Test
    void testInjectEnum(){
        def context = new ClassPathXmlApplicationContext("injectTestContext.xml");
        SimpleBean bean = context.getBean(SimpleBean.class);
        println(bean.simpleEnum);
        assertEquals(SimpleEnum.C, bean.simpleEnum);
    }
}
