class Person{
    String name;
    int age;
    String jumin;
    double height;
    double weight;
    void smile(){
        System.out.println("웃다 : " + this);
        // this.name이 아니라 name을 써도 똑같다
        // 그래도 this.name을 쓰는 이유는 멤버필드 접근을 확실하게 하기위해서
        System.out.println("웃다 : " + this.name);
        // 맴버매소드 접근
        this.eat();
    }
    void eat(){
        System.out.println("먹다");
    }
    void sleep(){
        System.out.println("자다");
    }
}

public class PersonMainEx04{
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "이순신";
        p2.name = "강감찬";
        System.out.println(p1);
        System.out.println(p2);
        p1.smile();
        p2.smile();
    }
}