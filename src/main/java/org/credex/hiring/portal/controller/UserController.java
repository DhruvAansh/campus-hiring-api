package org.credex.hiring.portal.controller;

import org.credex.hiring.portal.dao.UserDao;
import org.credex.hiring.portal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

   @Autowired
   private UserDao userDao;
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public Users createUser(@Validated @RequestBody Users user) {
        return userDao.createUser(user);

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/get")
    public List<Users> getAllUsers() {
        return userDao.getAllUsers();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getById/{userId}")
    public Users getUserById(@PathVariable int userId) {
        return userDao.getUserById(userId);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update")
    public Users updateUser( @RequestBody Users user) {

        return userDao.updateUser(user);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/{userId}")
    public String deleteUser(@PathVariable("userId") int userId) {
       return userDao.deleteUser(userId);
    }
}
