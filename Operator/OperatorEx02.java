public class OperatorEx02{
    public static void main(String[] args){
        int i1 = 1_000_000;
        int i2 = 2_000_000;

        // Overflow!!!!
        int product1 = i1 * i2;
        System.out.println(product1);

        // 결과의 자료형도 바꾸고 연산되는 자료형도 바꿔야 한다!
        long product2 = (long)i1 * i2;
        System.out.println(product2);
    }
}