/**
 *
 */
package com.qiuq.inventory.repository

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * @author qiushaohua 2012-9-7
 * @version 0.0.1
 *
 */
class CommonRepository {

    @PersistenceContext
    protected EntityManager entityManager;
}
