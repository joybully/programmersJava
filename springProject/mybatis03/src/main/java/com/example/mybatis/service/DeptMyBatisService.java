package com.example.mybatis.service;

import com.example.mybatis.dto.DeptTO;
import com.example.mybatis.mapper.DeptMyBatisMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptMyBatisService {
    private DeptMyBatisMapper deptMyBatisMapper;

    public DeptMyBatisService(DeptMyBatisMapper deptMyBatisMapper) {
        this.deptMyBatisMapper = deptMyBatisMapper;
    }

    public void select() {
        System.out.println(deptMyBatisMapper.select());
    }

    public void findAll() {
        List<DeptTO> lists = deptMyBatisMapper.findAll();
        for (DeptTO to : lists) {
            System.out.println(to);
        }
    }

    public void insert() {
        DeptTO to = new DeptTO();
        to.setDeptno("71");
        to.setDname("연구부");
        to.setLoc("부산");
        int result = deptMyBatisMapper.insert(to);
        System.out.println("결과 : " + result);
    }

    public void update() {
        DeptTO to = new DeptTO();
        to.setDeptno("71");
        to.setDname("생산부");
        to.setLoc("강릉");

        int result = deptMyBatisMapper.update(to);
        System.out.println("결과 : " + result);
    }

    public void delete() {
        DeptTO to = new DeptTO();
        to.setDeptno("71");

        int result = deptMyBatisMapper.delete(to);
        System.out.println("결과 : " + result);
    }
}
