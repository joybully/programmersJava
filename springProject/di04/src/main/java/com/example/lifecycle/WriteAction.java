package com.example.lifecycle;

// 빈의 생성, 소멸 과정
// InitializingBean, DisposableBean
// 중간 설정 과정
// ApplicationContextAware, BeanNameAware, BeanClassLoaderAware, BeanFactoryAware

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// 인터페이스(메서드)를 통해서 라이프사이클을 볼 수 있다 <= Spring이 해준다
public class WriteAction implements Action, InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware, BeanClassLoaderAware, BeanFactoryAware {
    private String writer;

    public WriteAction() {
        System.out.println("1. 생성자 호출");
    }

    public void setWriter(String writer) {
        System.out.println("2. setWriter(String writer) 호출");
        this.writer = writer;
    }

    @Override
    public void execute() {
        System.out.println("*. execute() 호출");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("4. setBeanClassLoader(ClassLoader classLoader) 호출");
        }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("5. setBeanFactory(BeanFactory beanFactory) 호출");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("3. setBeanName(String name) 호출");
        // 빈 이름의 세팅
        System.out.println("bean name : " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("11. destroy() 호출");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("8. afterPropertiesSet() 호출");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("6. setApplicationContext(ApplicationContext applicationContext) 호출");
    }

    // 빈의 생성과 소멸에 추가 작동
    public void init_method(){
        System.out.println("9. init_method() 호출");
        System.out.println("빈의 커스텀 초기화 추가");
    }

    public void destroy_method(){
        System.out.println("12. destroy_method() 호출");
        System.out.println("빈의 커스텀 소멸화 추가");
    }
}
