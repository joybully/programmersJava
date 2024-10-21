class Parent1{
    Parent1(){
        System.out.println("Parent1 생성자 호출");
    }
}

abstract class Parent2{
    Parent2(){
        System.out.println("Parent2 생성자 호출");
    }
    // 일반 메서드
    void viewData1(){
        System.out.println("Parent2 viewData1() 호출");
    }
    // 추상 메서드
    abstract void viewData2();
    // void viewData2(){}; -> 이렇게 쓰면 내용있는 메서드됨 -> 추상메서드 아님!
}

class Child2 extends Parent2{
    Child2(){
        System.out.println("Child2 생성시 호출");
    }
    // 오버라이딩을 통해서 부모의 추상메서드를 가져와 구현한다
    void viewData2(){
        System.out.println("Child2 viewData2() 호출");
    }
}

public class AbstractMainEx01{
    public static void main(String[] args){
        Parent1 p1 = new Parent1();
        // 추상클래스는 직접적인 인스턴스화 안 됨
        // 상속에 의해서 처리
        // Parent p2 = new Parent2();
        // 추상클래스는 자식을 통해서 인스턴스화 된다
        Child2 c2 =new Child2();
        c2.viewData1();
        c2.viewData2();
    }
}