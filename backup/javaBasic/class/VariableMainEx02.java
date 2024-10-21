class Variable{
    // 인스턴스 맴버 필드
    String instanceVariable;
    void doFunc(){
        // 지역변수
        // 변수 이름이 같은데 에러가 안난다
        String instanceVariable = "20";
        System.out.println("doFunc() 호출 : " + instanceVariable); // 20이 출력된다 => 가까운걸 찾아간다
        System.out.println("doFunc() 호출 : " + this.instanceVariable);
    }
    // 메서드의 argument도 지역변수이다
    void doFunc2(String instanceVariable){
        System.out.println("doFunc() 호출 : " + instanceVariable); // 20이 출력된다 => 가까운걸 찾아간다
        System.out.println("doFunc() 호출 : " + this.instanceVariable); // 10이 출력된다
    }
}

public class VariableMainEx02{
    public static void main(String[] args){
        Variable v = new Variable();
        v.instanceVariable = "10";
        v.doFunc();
        v.doFunc2("20");
    }
}