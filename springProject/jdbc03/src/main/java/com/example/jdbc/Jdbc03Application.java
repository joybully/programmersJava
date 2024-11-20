package com.example.jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;

@SpringBootApplication
public class Jdbc03Application implements CommandLineRunner {

    // 데이터베이스 접속
    @Bean
    @ConfigurationProperties("spring.datasource1")
    public DataSource dataSource1(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource2")
    public DataSource dataSource2(){
        return DataSourceBuilder.create().build();
    }

    public static void main(String[] args) {
        SpringApplication.run(Jdbc03Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // System.out.println("dataSource1 : " + dataSource1().getConnection());
        // System.out.println("dataSource2 : " + dataSource2().getConnection());

        JdbcTemplate jdbcTemplate1 = new JdbcTemplate(dataSource1());
        JdbcTemplate jdbcTemplate2 = new JdbcTemplate(dataSource2());

        // System.out.println(jdbcTemplate1);
        // System.out.println(jdbcTemplate2);

        System.out.println(jdbcTemplate1.queryForObject("select database()",String.class));
        System.out.println(jdbcTemplate2.queryForObject("select database()", String.class));

        // Sample - dept => Project - dept 복사!
        // select -> insert
        // jdbcTemplate2 - DML 메서드

        // 데이터 가져오기
        String selectSql = "select * from dept";
        String insertSql = "insert into dept values(?,?,?)";

        ArrayList<DeptTO> results = (ArrayList<DeptTO>) jdbcTemplate1.query(
                selectSql,
                new BeanPropertyRowMapper<>(DeptTO.class));

        for(DeptTO to : results){
            jdbcTemplate2.update(insertSql, to.getDeptno(), to.getDname(), to.getLoc());
        }

        System.out.println("Back-up Completed");
    }
}
