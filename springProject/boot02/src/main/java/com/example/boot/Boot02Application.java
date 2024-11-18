package com.example.boot;

import com.example.boot.model.User;
import com.example.boot.model.User2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Boot02Application implements CommandLineRunner {

    // @Value("${my.name}")
    // private String name;
    // @Value("${my.fullname}")
    // private String fullName;
    // @Value("${my.secret}")
    // private String secret;

    // @Autowired
    // private ApplicationContext ctx;

    // Logging
    private Logger logger = LoggerFactory.getLogger(Boot02Application.class);
    // private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Boot02Application.class);
        // app.addListeners(new CustomListener1(), new CustomListener2());
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        // System.out.println("name : " + name);
        // System.out.println("fullName : " + fullName);
        // System.out.println("secret : " + secret);
        //

        // User user = ctx.getBean("user", User.class);
        // System.out.println(user.getFullname());
        // System.out.println(user.getAge());

        // User2 user2 = ctx.getBean("user2", User2.class);
        // System.out.println(user2);

        logger.trace("logger:{}", "trace message");
        logger.debug("logger:{}", "debug message");
        logger.info("logger:{}", "info message");
        logger.warn("logger:{}", "warn message");
        logger.error("logger:{}", "error message");
    }
}
