public class OperatorEx03{
    public static void main(String[] args){
        int i1 = 10;
        int i2 = 20;
        int sum1 = i1 + i2;
        System.out.println(sum1);

        short s1 = 10;
        short s2 = 20;
        // 산술 연산을 위한 기본자료형
        // int 이상
        // 따라서 에러발생
        // short sum2 = s1 + s2;
        // 더하기 연산 자체가 int로 바꿔버림
        int sum2 = s1 + s2;
        System.out.println(sum2);
        
        // 죽어도 short로 써야한다면?
        short sum3 = (short)(s1 + s2);
        System.out.println(sum3);
    }
}