package com.jdbc.dao;

import com.jdbc.pojo.Relation;

import java.util.List;

/**
 * @author lbs
 * @description mysql查询接口定义
 */
public interface Dao {
    List<Relation> get();
}
