package com.hx.jpa.controller;

import com.hx.jpa.entitys.Person;
import com.hx.jpa.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yxqiang
 * @create 2018-11-25 22:20
 */

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/getperon")
    public String getPerson(){
        Person person = personService.findById(1);
        return person.toString();
    }


}
