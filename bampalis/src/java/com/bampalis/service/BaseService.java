/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bampalis.service;

import com.bampalis.pojo.User;

public interface BaseService {
 public boolean login(String username, String password);

 public String registration(User user);
}
