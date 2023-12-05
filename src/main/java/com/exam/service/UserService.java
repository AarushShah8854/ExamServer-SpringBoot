package com.exam.service;

import com.exam.model.User;
import com.exam.model.UserRole;

import java.util.Set;

public interface UserService {

    //Creating a new User
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
}
