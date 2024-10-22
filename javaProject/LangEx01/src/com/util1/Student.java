package com.util1;

// capsulation
public class Student {
    private String hakbun;
    private String name;

    public Student(String hakbun, String name) {
        this.hakbun = hakbun;
        this.name = name;
    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hakbun='" + hakbun + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
