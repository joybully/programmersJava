class Person{
    String name;
    int age;
    String jumin;
    double height;
    double weight;
    // 메서드
    void smile(){
        System.out.println("웃다");
    }
    void eat(){
        System.out.println("먹다");
    }
    void sleep(){
        System.out.println("자다");
    }
}

public class PersonMainEx03{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "이순신";
        p1.age = 44;
        p1.jumin = "111";
        p1.height = 182.0;
        p1.weight = 85;
        p1.smile();
        p1.eat();
        Person p2 = new Person();
        p2.name = "강감찬";
        p2.age = 34;
        p2.jumin = "222";
        p2.height = 180.5;
        p2.weight = 80;        
        Person p3 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}