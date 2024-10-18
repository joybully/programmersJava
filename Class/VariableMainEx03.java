class Variable{
    // 인스턴스 맴버 필드 - 값을 안넣으면 자동초기화
    // 객체 초기화 : null
    String instanceVariable1;
    // 0
    int instanceVariable2;
    // ''
    char instanceVariable3;
    void doFunc(){
        // 에러난다
        // 지역변수는 값을 안넣으면 자동초기화 안된다
        // 반드시 초기화 해줘야한다
        String localVariable;
        // System.out.println("localVariable = " + localVariable);
    }
}

public class VariableMainEx03{
    public static void main(String[] args){
        Variable v = new Variable();
        // 초기화 없이 맴버 필드의 내용 확인
        System.out.println("instanceVariable = " + v.instanceVariable1);
        System.out.println("instanceVariable = " + v.instanceVariable2);
        System.out.println("instanceVariable = " + v.instanceVariable3);
        v.doFunc();
    }
}