interface InterA{
    void method1();
    default void method2(){
        System.out.println("method2 호출");
    }
}

class ClassA implements InterA{
    public void method1(){
        System.out.println("ClassA method1 호출");
    }
    // method2 재정의
    public void method2(){
        System.out.println("method2 오버라이드 호출");
    }
}

class ClassB implements InterA{
    public void method1(){
        System.out.println("ClassB method1 호출");
    }
}

class ClassC implements InterA{
    public void method1(){
        System.out.println("ClassC method1 호출");
    }
}

public class InterfaceMainEx06{
    public static void main(String[] args){
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        a.method1();
        b.method1();
        c.method1();
        a.method2();
        b.method2();
        c.method2();
    }
}