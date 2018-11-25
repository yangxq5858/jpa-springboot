package com.hx.jpa.repository;

import com.hx.jpa.daos.BaseDao;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * @author yxqiang
 * @create 2018-11-25 18:37
 */

@NoRepositoryBean
public class BaseDaoImpl<T ,TD extends Serializable> extends SimpleJpaRepository<T,TD> implements BaseDao<T,TD> {


    @PersistenceContext
    private EntityManager entityManager;

    private Class<T> entityClass;


    public BaseDaoImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.entityClass = domainClass;
        this.entityManager = entityManager;
    }


}
