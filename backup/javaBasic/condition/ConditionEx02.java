public class ConditionEx02{
    public static void main(String[] args){
        // data란 변수의 값이 10이면 "10이다" 라는 문장을 출력하고 아니면 출력하지 말 것
        // 비교연산자 필요
        System.out.println("시작");
        // data라 11이면 "10이다"가 출력이 안됨
        int data = 10;
        if(data == 10){
            System.out.println("10이다");
        }
        System.out.println("끝"); 
    }
}