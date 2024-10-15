public class ConditionEx04{
    public static void main(String[] args){
        // data란 변수의 값이 10이면 "10이다" 라는 문장을 출력하고 아니면 "10이 아니다" 출력
        System.out.println("시작");
        int data = 11;
        if(data == 10){
            System.out.println("10이다");
        }
        else{
            System.out.println("10이 아니다");
        }
        System.out.println("끝");
    }
}