package com.example.mybatis.dao;

import com.example.mybatis.dto.DeptTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MybatisRepository {
    private SqlSessionTemplate sqlSessionTemplate;

    // 생성자 주입
    public MybatisRepository(SqlSessionTemplate sqlSessionTemplate) {
        System.out.println("MybatisRepository(SqlSessionTemplate sqlSessionTemplate) Constructor call");
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public String select() {
        return sqlSessionTemplate.selectOne("com.example.mybatis2.select");
    }

    public List<DeptTO> selectlist() {
        return sqlSessionTemplate.selectList("com.example.mybatis1.selectlist");
    }
}
