package org.credex.hiring.portal.dao;

import org.credex.hiring.portal.model.Role;
import org.credex.hiring.portal.model.Users;
import org.credex.hiring.portal.service.BeanUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public Role createRole(Role role) {
        Session session = sessionFactory.getCurrentSession();
        session.save(role);
        return role;
    }
    @Override
    @Transactional
    public List<Role> getAllRole() {
        Session session = sessionFactory.getCurrentSession();
        Query<Role> query = session.createQuery("FROM Role", Role.class);
        List<Role> roles = query.getResultList();
        return roles;
    }
    public Role updateRole(Role role) {
        try {
            Session session = sessionFactory.getCurrentSession();
            Role oldRoleRec = session.get(Role.class, role.getRoleId());
            BeanUtility.copyNonNullProperties(role,oldRoleRec );
            session.save(oldRoleRec);
            return oldRoleRec ;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    @Transactional
    public Role getRoleById(int roleId) {
        Session session = sessionFactory.getCurrentSession();
        Role role = session.get(Role.class, roleId);
        return role;
    }
}
