interface InterA{
    void methodA();
    // 에러난다
    // interface는 기본적으로 내용있는 함수를 가질 수 없다
    // void methodB(){};
    // 하지만 default를 붙이면 된다
    // 기본적으로 존재해야하는 메소드 정의할 때 쓰인다
    default void methodB(){
        System.out.println("methodB 호출");
    };
}

class ClassA implements InterA{
    public void methodA(){
        System.out.println("methodA 호출");
    }
}

public class InterfaceMainEx05{
    public static void main(String[] args){
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();
    }
}