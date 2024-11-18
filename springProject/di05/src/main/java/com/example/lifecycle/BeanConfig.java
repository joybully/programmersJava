package com.example.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

// @ComponentScan(basePackageClasses = {CustonBeanPostProcessor.class})
public class BeanConfig {
    @Bean(initMethod = "init_method", destroyMethod = "destroy_method")
    public Action action(){
        WriteAction writeAction = new WriteAction();
        return writeAction;
    }
}
