class Parent{
    String data = "박문수";
    Parent(){
        System.out.println("Parent 생성자 호출");
    }
    void viewData1(){
        System.out.println("Parent viewData1() 호출");
    }
    void viewData2(){
        System.out.println("Parent viewData2() 호출");
    }
}

class Child1 extends Parent{
    String data = "홍길동";
    Child1(){
        System.out.println("Child1 생성자 호출");
    }
    // 오버라이딩
    void viewData1(){
        System.out.println("Child1 viewData1() 호출");
    }
    void viewData3(){
        System.out.println("Child1 viewData3() 호출");
    }
}

class Child2 extends Parent{
    Child2(){
        System.out.println("Child2 생성자 호출");
    }
    void viewData1(){
        System.out.println("Child2 viewData1() 호출");
    }
}

public class PolyMainEx03{
    public static void main(String[] args){
        Parent p1 = new Parent();
        System.out.println(p1.data);
        p1.viewData1();
        p1.viewData2();
        // 자동형변환(업캐스팅)
        Parent p2 = new Child1();
        // 부모
        System.out.println(p2.data);
        // 자식의 메서드가 호출됨
        p2.viewData1();
        // 부모의 메서드가 호출됨
        p2.viewData2();
        // 다른 자식
        p2 = new Child2();
        p2.viewData1();
    }
}