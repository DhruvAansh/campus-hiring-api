package org.credex.hiring.portal.controller;

import org.credex.hiring.portal.dao.RoleDao;
import org.credex.hiring.portal.model.Role;
import org.credex.hiring.portal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class MasterController {

    @Autowired
    private RoleDao roleDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/add")
    public Role createRole(@RequestBody Role role) {

        return roleDao.createRole(role);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/get")
    public List<Role> getAllRole() {

        return roleDao.getAllRole();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update")
    public Role updateUser( @RequestBody Role role) {

        return roleDao.updateRole(role);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getById/{roleId}")
    public Role getRoleById(@PathVariable int roleId) {

        return roleDao.getRoleById(roleId);
    }


}
