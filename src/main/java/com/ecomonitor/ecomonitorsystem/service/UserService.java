package com.ecomonitor.ecomonitorsystem.service;

import com.ecomonitor.ecomonitorsystem.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    public void saveUser(User user);

}