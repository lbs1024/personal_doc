package com.jdbc;

import com.jdbc.dao.Dao;
import com.jdbc.pojo.Relation;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MySqlDaoTest {

    @Autowired
    private Dao dao;

    @Test
    public void get() {
        List<Relation> relations = dao.get();
        if (relations != null) {
            for (Relation relation : relations) {
                System.out.println(relation.getId() + " " + relation.getName());
            }
        }
    }
}
