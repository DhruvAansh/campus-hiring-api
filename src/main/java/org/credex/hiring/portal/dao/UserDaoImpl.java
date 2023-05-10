package org.credex.hiring.portal.dao;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.credex.hiring.portal.model.Login;
import org.credex.hiring.portal.model.Users;
import org.credex.hiring.portal.service.BeanUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;



    @Override
    @Transactional
    public Users createUser(Users user) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.save(user);
        }finally {
            session.flush();
        }
        return user;
    }

    @Override
    @Transactional
    public Users updateUser(Users user) {
        try {
            Session session = sessionFactory.getCurrentSession();
            Users oldUserRec = session.get(Users.class, user.getUserId());
            BeanUtility.copyNonNullProperties(user,oldUserRec );
            session.save(oldUserRec);
            return oldUserRec;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    @Transactional
    public String  deleteUser(int userId) {

        Boolean aBoolean = deleteById(Users.class, userId);
        return "This {userId} has been deleted";
    }

    public <T> boolean deleteById (Class<T> clazz, int id) {
        Session session = sessionFactory.getCurrentSession();
        Object ob = session.load(clazz, id);
        session.delete(ob);
        session.flush();
        return true;
    }

    @Override
    @Transactional
    public Users getUserById(int userId) {
        Session session = sessionFactory.getCurrentSession();
        Users user = session.get(Users.class, userId);
        return user;
    }

    @Override
    @Transactional
    public Users getUserByEmailId(String emailId) {
        Session session = sessionFactory.getCurrentSession();
        Users user = session.get(Users.class, emailId);
        return user;
    }
    @Override
    @Transactional
    public List<Users> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        Query<Users> query = session.createQuery("FROM Users", Users.class);
        List<Users> users = query.getResultList();
        return users;
    }
    @Override
    @Transactional
    public Login authenticateUser(String emailId, String password) {
        try (Session session = sessionFactory.openSession()) {
            Query<Users> query = session.createQuery(
                            "FROM Users u WHERE u.emailId = :emailId AND u.password = :password", Users.class)
                    .setParameter("emailId", emailId)
                    .setParameter("password", password);
            Users user = query.uniqueResult();
            if (user != null) {
                String roles = session.createQuery(
                                "SELECT u.roleId FROM Users u WHERE u.userId = :userId", String.class)
                        .setParameter("userId", user.getUserId())
                        .uniqueResult();
                String token = Jwts.builder()
                        .setSubject(user.getEmailId())
                        .claim("claims", roles)
                        .setExpiration(new Date(System.currentTimeMillis() + 864_000_000)) // 10 days
                        .signWith(SignatureAlgorithm.HS256, "secret-key")
                        .compact();
                return new Login(token,user.getRoleId(),user.getEmailId(), user.getUserId());
            } else {
                throw new RuntimeException("error");
            }
        }
    }
}
