public class CastingEx01{
    public static void main(String[] args){

        // 자동 형변화
        // 작은 자료형 -> 큰 자료형
        short s1 = 10;
        int i1 = s1;
        System.out.println(s1);
        System.out.println(i1);

        float f1 = 10.0f;
        double d1 = f1;
        System.out.println(f1);
        System.out.println(d1);

        char c1 = 'A';
        // ascii code 저장
        int i2 = c1;
        System.out.println(c1);
        System.out.println(i2);
    }
}