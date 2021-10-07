/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

import com.company.bean.User;
import com.company.dao.inter.UserDaoInter;

/**
 *
 * @author Elvin
 */
//loosely coupling
//thightly coupling
public class Main {//Java Database Connectivity = JDBC API Specification

    public static void main(String[] args) throws Exception {
        
        UserDaoInter userDao = Context.instanceUserDao();
        
       User u= userDao.getById(2);
        u.setName("Eldar");
        userDao.updateUser(u);
        System.out.println(userDao.getAll());
    }

}
