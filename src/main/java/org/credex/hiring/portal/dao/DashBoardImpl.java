package org.credex.hiring.portal.dao;

import org.credex.hiring.portal.model.Colleges;
import org.credex.hiring.portal.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


@Repository
public class DashBoardImpl implements DashBoard{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    @Transactional
    public Long TotalCollegeCount() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Long> cqCollegeCount = cb.createQuery(Long.class);
        Root<Colleges> rootCollegeCount = cqCollegeCount.from(Colleges.class);
        cqCollegeCount.select(cb.count(rootCollegeCount.get("collegeId")));
        Long TotalCollegeCount = session.createQuery(cqCollegeCount).getSingleResult();
        return TotalCollegeCount;
    }

    @Override
    @Transactional
    public Long Students_Enrolled() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Long> cqStudentsEnrolled = cb.createQuery(Long.class);
        Root<Users> rootStudentsEnrolled = cqStudentsEnrolled.from(Users.class);
        cqStudentsEnrolled.select(cb.count(rootStudentsEnrolled.get("userId")))
                .where(cb.equal(rootStudentsEnrolled.get("roleId"), 3));
        Long StudentsEnrolled = session.createQuery(cqStudentsEnrolled).getSingleResult();
        return StudentsEnrolled;
    }

    @Override
    @Transactional
    public Long Selected_Students() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Long> cqSelectedStudents = cb.createQuery(Long.class);
        Root<Users> rootSelectedStudents = cqSelectedStudents.from(Users.class);
        cqSelectedStudents.select(cb.count(rootSelectedStudents.get("userId")))
                .where(cb.equal(rootSelectedStudents.get("status"), true));
        Long selectedStudentsCount = session.createQuery(cqSelectedStudents).getSingleResult();
        return selectedStudentsCount;
    }
}
