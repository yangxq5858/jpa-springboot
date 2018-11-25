package com.hx.jpa.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * @author yxqiang
 * @create 2018-11-25 19:13
 */

@NoRepositoryBean
public interface BaseDao<T,TD extends Serializable> extends JpaRepository<T,TD>, JpaSpecificationExecutor<T> {
}

