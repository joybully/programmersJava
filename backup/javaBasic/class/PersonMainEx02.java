class Person{
    // 맴버속성(member field)선언
    String name;
    int age;
}

public class PersonMainEx02{
    public static void main(String[] args){
        // 이순신
        // 객체변수 생성(인스턴스화)
        // p1 : 인스턴스
        Person p1 = new Person();
        p1.name = "이순신";
        p1.age = 44;
        // 강감찬
        // new로 메모리 생성
        Person p2 = new Person();
        // .으로 메모리 참조
        p2.name = "강감찬";
        p2.age = 34; 
        // 박문수
        Person p3 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}