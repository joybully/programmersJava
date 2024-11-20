package com.example.mybatis;

import com.example.mybatis.model.DeptTO;
import com.example.mybatis.model.EmpTO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication
public class Mybatis01Application implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(Mybatis01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Mybatis Framework 접근
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(ctx.getResource("classpath:/mapper/mapper2.xml"));

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        System.out.println(sqlSession);

        // String result = sqlSession.selectOne("select");
        // System.out.println("Current Time : " + result);

        /*
        Map map = sqlSession.selectOne("selectone1");
        System.out.println(map.size());

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
        */

        /*
        List<Map<String, Object>> lists = sqlSession.selectList("selectlist1");
        System.out.println(lists.size());

        for(Map<String, Object> map:lists){
            // System.out.println(map.size());
            System.out.println(map.get("deptno") + "/" + map.get("dname") + "/" + map.get("loc"));
        }
        */

        // DeptTO to = sqlSession.selectOne("selectone");
        // System.out.println(to.getDeptno() + "/" + to.getDname() + "/" + to.getLoc());

        /*
        List<DeptTO> lists = sqlSession.selectList("selectlist1");
        for(DeptTO to:lists){
            System.out.println(to.getDeptno() + "/" + to.getDname() + "/" + to.getLoc());
        }
        */

        // List<EmpTO> lists = sqlSession.selectList("selectlist2", "10");
        /*
        List<EmpTO> lists = sqlSession.selectList("selectlist3", "s%");
        for(EmpTO to : lists){
            System.out.println(to.getEmpno() + "/" + to.getEname() + "/" + to.getDeptno());
        }
        */

        EmpTO paramTO = new EmpTO();
        paramTO.setJob("SALESMAN");
        paramTO.setDeptno("30");
        List<EmpTO> lists = sqlSession.selectList("selectlist4",paramTO);
        for(EmpTO to:lists){
            System.out.println(to.getEmpno() + "/" + to.getEname() + "/" + to.getDeptno());
        }

        sqlSession.close();
    }
}
