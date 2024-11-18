package com.example.boot.model;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class User {
    @Value("${user.fullname}")
    private String fullname;
    @Value("${user.age}")
    private int age;
}
