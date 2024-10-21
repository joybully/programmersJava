class Parent{
    Parent(){
        System.out.println("Parent 생성자 호출");
    }
    void viewData1(){
        System.out.println("Parent viewData1() 호출");
    }
}

class Child1 extends Parent{
    Child1(){
        System.out.println("Child1 생성자 호출");
    }
    // 오버라이딩
    void viewData1(){
        System.out.println("Child1 viewData1() 호출");
    }
}

class Child2 extends Parent{
    Child2(){
        System.out.println("Child2 생성자 호출");
    }
    // 오버라이딩
    void viewData1(){
        System.out.println("Child2 viewData1() 호출");
    }
}

class Child3 extends Parent{
    Child3(){
        System.out.println("Child3 생성자 호출");
    }
    // 오버라이딩
    void viewData1(){
        System.out.println("Child3 viewData1() 호출");
    }
}

public class PolyMainEx05{
    public static void main(String[] args){
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
        c1.viewData1();
        c2.viewData1();
        c3.viewData1();
        //
        // 다형성을 이용해서 추출
        System.out.println();
        Parent p = new Child1();
        p.viewData1();
        p = new Child2();
        p.viewData1();
        p = new Child3();
        p.viewData1();
        System.out.println();
        // 배열
        Parent[] arr = new Parent[3];
        arr[0] = new Child1();
        arr[1] = new Child2();
        arr[2] = new Child3();
        arr[0].viewData1();
        arr[1].viewData1();
        arr[2].viewData1();
        }
}