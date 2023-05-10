package org.credex.hiring.portal.dao;

import org.credex.hiring.portal.model.Login;
import org.credex.hiring.portal.model.Users;

import java.util.List;
import java.util.Optional;


public interface UserDao {
    Users createUser(Users user);
    Users updateUser(Users user);
    Users getUserById(int userId);
    String deleteUser(int userId);
    List<Users> getAllUsers();
    Login authenticateUser(String email, String password);

    Users getUserByEmailId(String emailId);
}
