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
}

public class PolyMainEx04{
    public static void main(String[] args){
        // 런타임에러
        // Child1 c1 = (Child1)new Parent();
        Parent p1 = new Child1();
        Child1 c1 = (Child1)p1;
        System.out.println(c1.data);
        c1.viewData1();
        c1.viewData3();
    }
}