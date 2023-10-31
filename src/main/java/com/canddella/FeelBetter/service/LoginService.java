package com.canddella.FeelBetter.service;

import com.canddella.FeelBetter.entity.User;

public interface LoginService {

    Boolean login(String username,String password);
    public long getCustomerId(String username);

    public User findUserByName(String username);


}
