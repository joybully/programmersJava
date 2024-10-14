public class OperatorEx06{
    public static void main(String[] args){
        // 증감연산자 => 단항연산자
        // ++ / -- => 1씩 증가 / 1씩 감소
        int a = 10;
        // 산술연산자
        a = a + 1;
        System.out.println(a);
        // 복합대입연산자
        a += 1;
        System.out.println(a);
        // 증감연산자
        a++;
        System.out.println(a);
        // 증감연산자
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        // 증감연산자
        --a;
        System.out.println(a);

        int a1 = 10;
        int a2 = 10;

        // 증감연산자 먼저, 대입연산자는 나중에
        int b1 = ++a1;
        // 대입연산자 먼저, 증감연산자는 나중에
        int b2 = a2++;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
    
    }
}