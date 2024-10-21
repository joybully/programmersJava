interface InterA{
    void method1();
    // 오버라이딩 가능
    default void method2(){
        System.out.println("method2 호출");
        method3();
    }
    // 오버라이딩 불가능
    // 내부적 사용을 위해서 정의
    private void method3(){
        System.out.println("method3 호출");
    }
}

class ClassA implements InterA{
    public void method1(){
        System.out.println("method1 호출");
    }
}

public class InterfaceMainEx08{
    public static void main(String[] args){
        ClassA a = new ClassA();
        a.method1();
        a.method2();
        // 에러난다
        // a.method3();
    }
}