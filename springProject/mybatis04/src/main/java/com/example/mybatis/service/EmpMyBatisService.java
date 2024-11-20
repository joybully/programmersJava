package com.example.mybatis.service;

import com.example.mybatis.dto.EmpTO;
import com.example.mybatis.mapper.EmpMyBatisMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpMyBatisService {

    private EmpMyBatisMapper empMyBatisMapper;

    public EmpMyBatisService(EmpMyBatisMapper empMyBatisMapper) {
        this.empMyBatisMapper = empMyBatisMapper;
    }

    public void findAll(){
        List<EmpTO> lists = empMyBatisMapper.findAll();
        for(EmpTO to : lists){
            System.out.println(to);
        }
    }
}
