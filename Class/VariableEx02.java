class Variable{
    String instanceVariable;
    static String classVariable;
    // 인스턴스 메서드
    void doFunc1(){
        System.out.println("doFunc1() 호출" + this.instanceVariable);
    }
    // 클래스 메서드
    // 앞에 static을 붙인다
    static void doFunc2(){
        // 에러코드
        // System.out.println("doFunc1() 호출" + this.classVariable);
        System.out.println("doFunc1() 호출");
    }
}

public class VariableEx02{
    public static void main(String[] args){
        Variable v1 = new Variable();
        Variable v2 = new Variable();
        v1.instanceVariable = "홍길동";
        v2.instanceVariable = "박문수";
        v1.doFunc1();
        v2.doFunc1();
        Variable.doFunc2();
    }
}