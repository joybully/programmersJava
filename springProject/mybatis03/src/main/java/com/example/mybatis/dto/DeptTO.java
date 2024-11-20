package com.example.mybatis.dto;

import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Setter
@ToString
@Alias(value="to")
public class DeptTO {
    private String deptno;
    private String dname;
    private String loc;
}
