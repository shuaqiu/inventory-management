/**
 * @author qiushaohua 2012-7-7
 */
package com.qiuq.inventory.bean.env

/**
 * @author qiushaohua 2012-7-7
 * @version 0.0.1
 */
class Theme {
    String name;

    String image;

    /**
     * @param name
     * @param image
     */
    public Theme(String name, String image) {
        super();
        this.name = name;
        this.image = image;
    }

    @Override
    public String toString() {
        return name + image ? "(${image})" : "";
    }
}
