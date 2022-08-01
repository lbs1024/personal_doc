package com.jdbc.dao.impl;

import com.jdbc.dao.Dao;
import com.jdbc.pojo.Relation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author lbs
 * @description 数据库查询接口实现
 */
public class DaoImpl implements Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Relation> get() {
        List<Relation> relations = jdbcTemplate.query("select * from mysql where id=?", new Object[]{691},
                (resultSet, i) -> {
                    Relation relation = new Relation();
                    relation.setId(resultSet.getString("id"));
                    relation.setName(resultSet.getString("name"));
                    return relation;
                });
        return relations;
    }
}
