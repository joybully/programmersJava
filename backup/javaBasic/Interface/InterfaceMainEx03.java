interface InterA{
    String STR1 = "박문수";
    void methodA();
}

// interface - implement(클래스가 interface상속할 경우)
// extends(인터페이스가 인터페이스를 또는 클래스가 클래스를 상속할 경우)
interface InterB extends InterA{
    String STR2 = "홍길동";
    void methodB();
}

class ClassA implements InterB{
    public void methodA(){
        System.out.println("methodA 호출");
    }
    public void methodB(){
        System.out.println("methodB 호출");
    }
}

public class InterfaceMainEx03{
    public static void main(String[] args){
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();
    }
}