package com.spring.web.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface BaseDAO<T> extends Mapper<T> , MySqlMapper<T> {
}
