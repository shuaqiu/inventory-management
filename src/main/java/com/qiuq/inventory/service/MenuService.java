/**
 * @author qiushaohua 2012-6-23
 */
package com.qiuq.inventory.service;

import org.springframework.stereotype.Service;

/**
 * @author qiushaohua 2012-6-23
 * @version 0.0.1
 */
@Service
public class MenuService {

    public String save(String string) {
        return "menu saved " + string;
    }
}
