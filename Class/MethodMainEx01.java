class Method{
    // 메서드 선언
    // 메서드명 = 식별자 규칙을 따른다
    // naming convention - 소문자 시작 - 동사(do, is)
    void method1(){
        // 실행문
        System.out.println("method1() 실행");
    }
    // a는 argument 또는 parameter
    void method2(int a){
        System.out.println("method2() 호출 : " + a);
    }
    // parameter가 여러개
    void method3(int a, int b, int c){
        System.out.println("method3() 호출 : " + a);
        System.out.println("method3() 호출 : " + b);
        System.out.println("method3() 호출 : " + c);
    }
    // return은 반드시 1개
    // void는 리턴이 없다
    // 메소드 앞에 return값의 type을 적는다
    int method4(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }
    int method5(int a, int b){
        int sum = a + b;
        return sum;
    }
}

public class MethodMainEx01{
    public static void main(String[] args){
        Method m = new Method();
        // 메서드의 호출
        m.method1();
        m.method2(10);
        m.method3(20, 30, 40);
        int result = m.method4();
        System.out.println(result);
        result = m.method5(10, 20);
        System.out.println(result);
    }
}