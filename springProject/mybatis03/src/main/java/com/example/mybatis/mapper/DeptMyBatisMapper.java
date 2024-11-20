package com.example.mybatis.mapper;

import com.example.mybatis.dto.DeptTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMyBatisMapper {
    String select();
    List<DeptTO> findAll();

    int insert(DeptTO to);
    int update(DeptTO to);
    int delete(DeptTO to);
}
