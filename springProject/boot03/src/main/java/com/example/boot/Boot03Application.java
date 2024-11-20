package com.example.boot;

import com.example2.config.BeanConfig;
import com.example3.model.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.List;

@SpringBootApplication
@Import(BeanConfig.class)
public class Boot03Application implements CommandLineRunner {

    @Autowired
    private ApplicationContext ctx;
    public static void main(String[] args) {
        SpringApplication.run(Boot03Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DatabaseService service = ctx.getBean("service", DatabaseService.class);
        List<String> lists = service.getList();
        System.out.println(lists);
    }
}
