//package org.credex.hiring.portal.dao;
//
//import org.credex.hiring.portal.model.QuestionPaper;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//@Repository
//public class QuestionPaperDaoImpl implements QuestionPaperDao {
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Override
//    @Transactional
//    public  void saveQuestionPaper(QuestionPaper questionPaper) {
//        Session currentSession = sessionFactory.getCurrentSession();
//        currentSession.saveOrUpdate(questionPaper);
//    }
//}
