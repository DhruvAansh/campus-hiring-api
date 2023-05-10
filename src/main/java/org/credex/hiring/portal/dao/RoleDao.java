package org.credex.hiring.portal.dao;

import org.credex.hiring.portal.model.Role;
import org.credex.hiring.portal.model.Users;

import java.util.List;

public interface RoleDao {
    Role createRole(Role role);
    List<Role> getAllRole();
    Role updateRole(Role role);
    Role getRoleById(int roleId);
}
