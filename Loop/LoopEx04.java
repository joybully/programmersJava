public class LoopEx04{
    public static void main(String[] args){
        /*
            문자열 : 반복문을 통해서 출력
                3 X 1 = 3
                3 X 2 = 6
                3 X 3 = 9
                3 X 4 = 12
                3 X 5 = 15
                3 X 6 = 18
                3 X 7 = 21
                3 X 8 = 24
                3 X 9 = 27
        */
       System.out.println("시작");
       int dansu = 3;
       for(int i=1; i<=9; i++){
        // 문자열 연결 연산자
        System.out.println(dansu + " X " + i + " = " + (dansu*i));
       }
       System.out.println("끝");
    }
}