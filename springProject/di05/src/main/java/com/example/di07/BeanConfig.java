package com.example.di07;

import org.springframework.context.annotation.Import;

@Import({BeanConfig1.class, BeanConfig2.class})
//@Import({BeanConfig1.class})
public class BeanConfig {
}
