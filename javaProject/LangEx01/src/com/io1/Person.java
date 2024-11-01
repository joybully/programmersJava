package com.io1;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String phone;
    private int age;
    // transient 쓰면 중요한 정보라서 파일에 넘어가지 않는다
    transient private String address;

    public Person(String name, String phone, int age, String address) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}