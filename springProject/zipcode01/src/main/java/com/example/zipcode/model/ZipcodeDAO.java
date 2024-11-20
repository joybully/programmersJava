package com.example.zipcode.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class ZipcodeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ArrayList<ZipcodeTO> searchZipcode(String strDong){
        String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";

        // 1. Using ArrayList
        ArrayList<ZipcodeTO> lists = (ArrayList<ZipcodeTO>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ZipcodeTO.class), strDong + "%");
        /*
        for(ZipcodeTO to:lists){
            System.out.printf("[%s] %s %s %s %s %s%n", to.getZipcode(),to.getSido(), to.getGugun(),to.getDong(),to.getRi(),to.getBunji());
        }
        */
        return lists;

        // 2. Using Map
        // List<Map<String,Object>> results = jdbcTemplate.queryForList(sql, strDong + "%");
        // for(Map<String, Object> result : results){
        //     System.out.println(result.get("zipcode"));
        // }

        // 3. Using List
        // List<ZipcodeTO> results = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ZipcodeTO.class), strDong + "%");
        // for(ZipcodeTO to:results){
        //     System.out.println(to);
        // }
    }
}
