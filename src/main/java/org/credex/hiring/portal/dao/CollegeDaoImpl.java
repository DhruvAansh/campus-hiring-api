package org.credex.hiring.portal.dao;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.credex.hiring.portal.model.Colleges;
import org.credex.hiring.portal.model.Users;
import org.credex.hiring.portal.service.BeanUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
public class CollegeDaoImpl implements CollegeDao {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public Colleges createCollege(Colleges colleges) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.save(colleges);
        } finally {
            session.flush();
        }
        return colleges;

    }

    @Override
    @Transactional
    public Colleges updateCollege(Colleges colleges) {
        try {
            Session session = sessionFactory.getCurrentSession();
            Colleges oldCollegesRRec = session.get(Colleges.class, colleges.getCollegeId());
            BeanUtility.copyNonNullProperties(colleges, oldCollegesRRec);
            session.save(oldCollegesRRec);
            return oldCollegesRRec;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @Transactional
    public String deleteCollege(int collegeId) {
        Session session = sessionFactory.getCurrentSession();
        Object ob = (Object) session.load(Colleges.class, collegeId);
        session.delete(ob);
        session.flush();
        return "{ \"message\": \"College with id " + collegeId + " is deleted\" }";
    }


    @Override
    @Transactional
    public List<Colleges> getAllCollege() {
        Session session = sessionFactory.getCurrentSession();
        Query<Colleges> query = session.createQuery("FROM Colleges", Colleges.class);
        List<Colleges> colleges = query.getResultList();
        return colleges;
    }

}
