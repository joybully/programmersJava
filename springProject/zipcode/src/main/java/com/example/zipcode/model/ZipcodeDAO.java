package com.example.zipcode.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class ZipcodeDAO {
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ZipcodeTO> zipcode_ok(String dong){
        String sql = "select zipcode, sido, gugun, dong, ri, bunji, seq from zipcode where dong like ?";
        List<ZipcodeTO> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<ZipcodeTO>(ZipcodeTO.class), dong+"%");
        return list;
    }
}
