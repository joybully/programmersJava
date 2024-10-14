public class CastingEx02{
    public static void main(String[] args){

        // 자동 형변화
        // 작은 자료형 -> 큰 자료형
        int i1 = 10;
        // 형변환 불가
        //short s1 = i1;
        short s1 = (short)i1;

        System.out.println(i1);
        System.out.println(s1);

        //float / double 도 마찬가지
        char c1 = 'A';
        int i2 = c1 + 3;
        System.out.println(c1);
        System.out.println(i2);
        // char로 보고싶으면
        System.out.println((char)i2);

        char c2 = (char)i2;
        System.out.println(c2);
    }
}