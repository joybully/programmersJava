public class OperatorEx07{
    public static void main(String[] args){
        // 비교연산자
        // 비교연산자의 결과는 무조건 논리값이다(true / false)
        // >, <, >=, <=, ==, !=
        // 제어문에서 많이 쓰임

        System.out.println(10 == 5);
        System.out.println(10 != 5);

        System.out.println(10 < 5);
        System.out.println(10 > 5);

        // 비교의 연결
        // 논리연산자 => 조건문이나 제어문에 많이 쓰인다

        // 논리합(|| : pipe) => 또는, ~이거나
        // 둘 중에 하나라도 참이면 참
        
        // 논리곱(&&) => 그리고
        // 둘 모두 참이어야 참

        boolean bool1 = (10 > 3);   //true
        boolean bool2 = (3 > 10);   //false

        System.out.println(bool1 || bool2);
        System.out.println(bool1 && bool2);
    }
}