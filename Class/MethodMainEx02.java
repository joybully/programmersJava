class Method{
    void gugudan(int dansu){
        for(int i=1; i<10; i++){
            System.out.println(dansu + " X " + i + " = " + (dansu*i));
        }
    }
}

public class MethodMainEx02{
    public static void main(String[] args){
        // 구구단 단수를 입력받아서 구구단을 출력 gugudan 메서드 작성
        Method m = new Method();
        m.gugudan(3);
    }
}