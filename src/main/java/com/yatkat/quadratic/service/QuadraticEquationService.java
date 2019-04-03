package com.yatkat.quadratic.service;

import com.yatkat.quadratic.dao.EquationDao;
import com.yatkat.quadratic.model.QuadraticEquationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("quadraticEquationService")
@Transactional
public class QuadraticEquationService implements IQuadraticEquationService {

    private EquationDao equationDao;

    @Autowired
    public QuadraticEquationService(EquationDao equationDao) {
        this.equationDao = equationDao;
    }

    public void saveToDB(QuadraticEquationModel model) {
        equationDao.saveToDB(model);
    }
}
