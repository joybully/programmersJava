public class ConditionEx12{
    public static void main(String[] args){
        // 삼항연산자(분기)
        // 조건 ? 값1 : 값2;
        // 조건이 참이면 값1, 조건이 거짓이면 값2
        // if~else 문을 한 줄로 축약한다
        char c1 = (10 > 3) ? 'a' : 'b';
        System.out.println(c1);
        int a = 12;
        int b = 10;
        int c = 4;
        // c보다 b가 크고 b보다 a가 크면 c2는 'a'
        // 그렇지 못하면 c2는 'b'
        char c2 = (c < b && b < a) ? 'a' : 'b';
        System.out.println(c2);
    }
}