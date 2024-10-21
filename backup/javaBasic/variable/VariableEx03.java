public class VariableEx03{
    public static void main(String[] args){

        // 상수
        // 상수명 선언할 때: 대문자와 _ (이름 표기법)
        final int num1;
        num1 = 10;
        System.out.println(num1);

        // 값의 재할당
        // 에러코드
        /*num1 = 20;
        System.out.println(num1);*/

        final int NUM;
        NUM = 20;
        System.out.println(NUM);
    }
}