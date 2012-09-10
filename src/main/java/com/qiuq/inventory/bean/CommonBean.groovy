/**
 *
 */
package com.qiuq.inventory.bean

import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

/**
 * @author qiushaohua 2012-9-10
 * @version 0.0.1
 *
 */
@MappedSuperclass
class CommonBean {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    Integer id;

    @Override
    boolean equals(Object obj) {
        return getClass().isInstance(obj) && id == obj.getAt("id");
    }

    @Override
    int hashCode() {
        return id;
    }
}
