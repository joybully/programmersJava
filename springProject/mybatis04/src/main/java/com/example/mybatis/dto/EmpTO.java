package com.example.mybatis.dto;

import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Setter
@ToString
@Alias(value="to")
public class EmpTO {
    private String empno;
    private String ename;
    private String job;
    private String mgr;
    private String hiredate;
    private String sal;
    private String comm;
    private String deptno;
}
