package org.credex.hiring.portal.serviceImpl;

import org.credex.hiring.portal.dao.UserDao;
import org.credex.hiring.portal.model.Users;
import org.credex.hiring.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Users updateUser(Users user) {
        return userDao.updateUser(user);
    }

    @Override
    public String deleteUser(int userId) {
        userDao.deleteUser(userId);
        return "This is deleted";
    }

    @Override
    public Users getUserById(int userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public List<Users> getAllUsers() {
        return userDao.getAllUsers();
    }
    public Users createUser(Users user) {

        return userDao.createUser(user);
    }
}
