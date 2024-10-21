class Variable{
    // 인스턴스 멤버필드
    String instanceVariable;
    // 클래스 멤버필드 => static이 필요하다
    static String classVariable;
}

public class VariableEx01{
    public static void main(String[] args){
        Variable v1 = new Variable();
        Variable v2 = new Variable();
        // 인스턴스 각각사용
        v1.instanceVariable = "홍길동";
        v2.instanceVariable = "박문수";
        System.out.println(v1.instanceVariable);
        System.out.println(v2.instanceVariable);
        v1.instanceVariable = "임꺽정";
        System.out.println(v1.instanceVariable);
        System.out.println(v2.instanceVariable);
        // 클래스 공유사용
        v1.classVariable = "홍길동";
        System.out.println(v1.classVariable);
        System.out.println(v2.classVariable);
        v1.classVariable = "강감찬";
        System.out.println(v1.classVariable);
        System.out.println(v2.classVariable);
        // 클래스변수는 클래스명.변수로 사용가능하다
        // 어차피 공유니까
        System.out.println(Variable.classVariable);
    }
}