package com.hx.jpa.entitys;

/**
 * @author yxqiang
 * @create 2018-11-25 16:47
 */


import javax.persistence.*;

@Entity
@Table(name = "JPA_CUSTOMERS")

public class Customer {
    private Integer id;
    private String lastName;
    private String email;
    private int age;
    private String addr;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //设置主键自增长的类型
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}