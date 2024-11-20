package com.example.jdbc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcDAO() {
        System.out.println("JdbcDAO Constructor call");
        System.out.println("JdbcDAO Constructor : " + jdbcTemplate);
    }

    public void selectTime(){
        // System.out.println("selectTime() : " + jdbcTemplate);
        String result = jdbcTemplate.queryForObject("select now() as now", String.class);
        System.out.println(result);
    }
}
