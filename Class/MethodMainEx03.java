class Method{
    // Method Overloading
    // 원래 메소드는 같은 이름 2개 정의 안됨
    // 하지만 parameter개수나 순서가 다르면 같은 이름이 정의된다
    void doFunc(){
        System.out.println("doFunc() 호출");
    }
    void doFunc(int a){
        System.out.println("doFunc(int a) 호출");
    }
    // parameter type이 다르다
    void doFunc(String s){
        System.out.println("doFunc(String s) 호출");
    }
    // parameter 개수가 다르다
    void doFunc(int a, String s){
        System.out.println("doFunc(int a, String s) 호출");
    }
    // parameter 순서가 다르다
    void doFunc(String s, int a){
        System.out.println("doFunc(String s, int a) 호출");
    }
}

public class MethodMainEx03{
    public static void main(String[] args){
        Method m = new Method();
        m.doFunc();
        m.doFunc(10);
        m.doFunc("10");
        m.doFunc(10, "10");
        m.doFunc("10", 10);
    }
}