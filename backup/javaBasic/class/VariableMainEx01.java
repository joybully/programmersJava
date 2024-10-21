class Variable{
    // 맴버 필드
    String instanceVariable;
    static String classVariable;

    // 메서드 필드
    void doFunc(){
        // 지역변수
        // 지역은 중괄호 사이
        String localVariable1 = "10";
        System.out.println(localVariable1);
        // {}을 통해서 지역을 구분할 수 있다
        // {} : 코드블럭 (주로 제어문)
        // 지역의 지역도 가능
        int num1 = 10;
        System.out.println("시작");
        {
            // 에러난다
            // 밖의 변수는 안에서 재정의 안된다
            // int num1 = 10;
            System.out.println("중간");
            int num2 = 20;
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }
        System.out.println("끝");
        // 에러난다
        // 코드블록 안쪽의 변수를 밖에서 불러서(지역의 지역에 있는 변수를 지역에서 부름)
        // error : cannot find symbol
        // System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);
    }
}

public class VariableMainEx01{
    public static void main(String[] args){
        // 가장 넓은 영역의 변수
        Variable.classVariable = "10";
        System.out.println(Variable.classVariable);
        // 인스턴스의 맴버변수
        Variable v = new Variable();
        v.instanceVariable = "10";
        System.out.println(v.instanceVariable);
        v.doFunc();
        // 에러난다
        // 지역변수이기 때문에
        // 가장 좁은 영역의 변수
        // v.localVariable1 = "10"
    }
}