package com.hx.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * @author yxqiang
 * @create 2018-11-25 20:29
 */

public class BaseDaoFactoryBean<R extends JpaRepository<T, I>, T, I extends Serializable> extends JpaRepositoryFactoryBean<R, T, I> {
    public BaseDaoFactoryBean(Class<? extends R> repositoryInterface) {
        super(repositoryInterface);
    }
    @Override
    protected RepositoryFactorySupport createRepositoryFactory(final EntityManager entityManager) {
        return new JpaRepositoryFactory(entityManager) {
            @Override
            protected SimpleJpaRepository<T, Serializable> getTargetRepository(
                    RepositoryInformation information, EntityManager entityManager) {
                Class<T> domainClass = (Class<T>) information.getDomainType();
                return new BaseDaoImpl(domainClass, entityManager);
            }

            @Override
            protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
                Class clazz = metadata.getDomainType();
                return BaseDaoImpl.class;
            }
        };
    }
}
