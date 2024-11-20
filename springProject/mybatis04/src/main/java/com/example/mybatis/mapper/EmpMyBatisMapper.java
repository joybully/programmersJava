package com.example.mybatis.mapper;

import com.example.mybatis.dto.EmpTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMyBatisMapper {
    List<EmpTO> findAll();
}
