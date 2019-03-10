package com.spring;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoImpl implements UserDao {
    private  static final Logger logger= LoggerFactory.getLogger(UserDaoImpl.class);

    @Override
    public void insert() {
        logger.info("开始进行插入操作。。。");
    }
}
