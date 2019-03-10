package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeforeAdvice {
    private static final Logger logger = LoggerFactory.getLogger(BeforeAdvice.class);

    /*定义前置方法*/
    public void connectDB() {logger.info("连接数据库。。。"); }
}