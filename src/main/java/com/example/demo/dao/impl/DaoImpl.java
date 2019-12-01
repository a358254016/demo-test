package com.example.demo.dao.impl;

import com.example.demo.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("------方法执行了---------------");
    }
}
