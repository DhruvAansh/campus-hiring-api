package org.credex.hiring.portal.service;

import org.credex.hiring.portal.model.Users;

import java.util.List;

public interface UserService {
    Users createUser(Users user);
    Users updateUser(Users user);
    String deleteUser(int userId);
    Users getUserById(int userId);
    List<Users> getAllUsers();
}