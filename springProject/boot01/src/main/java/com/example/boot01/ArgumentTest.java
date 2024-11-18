package com.example.boot01;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArgumentTest {
    public ArgumentTest(ApplicationArguments args) {
        System.out.println("foo : " + args.containsOption("foo")); // false
        System.out.println("bar : " + args.containsOption("bar")); // true
        boolean bar = args.containsOption("bar");
        List<String> files = args.getNonOptionArgs();
        if (bar) {
            System.out.println(files);
        }
    }
}
