interface InterA{
    void method1();
    static void staticMethod(){
        System.out.println("staticMethod 호출");
    }
}

public class InterfaceMainEx07{
    public static void main(String[] args){
        InterA.staticMethod();
    }
}