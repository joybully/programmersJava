abstract class Parent{
    Parent(){
        System.out.println("Parent 생성자 호출");
    }
    abstract void method1();
}

abstract class Child extends Parent{
    Child(){
        System.out.println("Child 생성자 호출");
    }
    // 오버라이딩x
}

class GrandChild extends Child{
    GrandChild(){
        System.out.println("GrandChild 생성자 호출");
    }
    void method1(){
        System.out.println("GrandChild method1 호출");
    }
}

public class AbstractMainEx02{
    public static void main(String[] args){
        // 에러난다
        // Child가 추상메서드를 오버라이딩 하지 않음
        // Child = new Child();
        GrandChild gc = new GrandChild();
        gc.method1();
    }
}