package com.hx.jpa.services;

import com.hx.jpa.daos.PersonDao;
import com.hx.jpa.entitys.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yxqiang
 * @create 2018-11-25 18:14
 */

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public Person findById(Integer id){
        Person person = personDao.getOne(id);
        return  person;
    }



}
