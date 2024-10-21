interface InterA{
    // 상수선언
    public static final String STR1 = "홍길동";
    // 상수선언
    // interface이기 때문에 이렇게 줄여서 쓸 수 있다
    String STR2 = "박문수";
    // 추상메서드 선언
    public abstract void methodA();
    // 추상메서드 선언
    // interface이기 때문에 이렇게 줄여서 쓸 수 있다
    void methodB();
}

abstract class ClassA implements InterA{
    public void methodA(){
        System.out.println("methodA 호출");
    }
    // public void methodB(){
    //     System.out.println("methodB 호출");
    // }
}

class ClassAA extends ClassA{
    public void methodB(){
        System.out.println("methodB 호출");
    }
}

public class InterfaceMainEx01{
    public static void main(String[] args){
        ClassAA a = new ClassAA();
        a.methodA();
        a.methodB();
    }
}

