package com.yatkat.quadratic.dao;

import com.yatkat.quadratic.model.QuadraticEquationModel;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EquationDaoImpl implements EquationDao {

    private SessionFactory sessionFactory;

    @Autowired
    public EquationDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveToDB(QuadraticEquationModel model) {
         this.sessionFactory.getCurrentSession().save(model);
    }
}
