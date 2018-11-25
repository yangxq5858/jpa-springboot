package com.hx.jpa;

import com.hx.jpa.entitys.Person;
import com.hx.jpa.services.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

    @Autowired
    private PersonService personService;

    @Test
    public void contextLoads() {


        Person person = personService.findById(1);
        System.out.println("查询结果： name=" + person.getName() + ",id=" + person.getId());
    }

}
