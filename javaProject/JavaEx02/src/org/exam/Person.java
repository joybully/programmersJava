package org.exam;
public class Person {

    String name;
    int age;
    String jumin;
    double height;
    double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJumin() {
        return jumin;
    }

    public void setJumin(String jumin) {
        this.jumin = jumin;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Person(){
        System.out.println("parent Constructor");
    }
    public Person(String name, int age, String jumin, double height, double weight) {
        this.name = name;
        this.age = age;
        this.jumin = jumin;
        this.height = height;
        this.weight = weight;
    }
}
