class Parent{
    void viewParent(){
        System.out.println("Parent viewParent() 호출");
    }
}

class Child extends Parent{
    void viewChild(){
        System.out.println("viewChild() 호출");
    }

    // Overriding(재정의) - 메서드 이름의 통일화
    void viewParent(){
       System.out.println("Child viewParent() 호출");
    }
    // 애러난다
    // 부모클래스와 리턴타입이 달라서
    // int viewParent(){
    //     System.out.println("Child viewParent() 호출");
    //     return 0;
    // }
}

class Child2{
    void viewChild(){
        System.out.println("viewChild() 호출");
    }

    void viewParent(){
        System.out.println("Child2 viewParent() 호출");
    }
}

public class InheritanceEx02{
    public static void main(String[] args){
        Child c = new Child();
        c.viewParent();
        Child2 c2 = new Child2();
        c.viewParent();
    }
}