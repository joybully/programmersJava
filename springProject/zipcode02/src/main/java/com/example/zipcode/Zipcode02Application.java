package com.example.zipcode;

import com.example.zipcode.model.ZipcodeTO;
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
public class Zipcode02Application implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(Zipcode02Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(ctx.getResource("classpath:mapper/mapper.xml"));

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        List<ZipcodeTO> lists = sqlSession.selectList("select", args[0] + "%");
        for (ZipcodeTO to : lists) {
            System.out.printf("[%s] %s %s %s %s %s %n",
                    to.getZipcode(), to.getSido(),to.getGugun(), to.getDong(), to.getRi(), to.getBunji());
        }
    }
}
