public class DataTypeEx05{
    public static void main(String[] args){
        // 정수
        // byte, short, int(표준이자 기준), long
        // 위의 타입을 정하는 기준은 메모리 최적화
        int i = 10;
        System.out.println(i);

        byte b = 10;
        short s = 10;
        System.out.println(b);
        System.out.println(s);

        // 진법 -> 정수
        // 2진법 표기
        int i2 = 0b1010;
        // 10진법 출력
        System.out.println(i2);

        // 8진법 표기
        int i8 = 030;
        // 10진법 출력
        System.out.println(i8);
        
        //16진법 표기
        int i16 = 0xA4;
        // 10진법 출력
        System.out.println(i16);

        // 8진법으로 출력
        System.out.printf("%o%n", 10);

        // 16진법으로 출력
        System.out.printf("%x%n", 16);

        // 큰 수 표기법
        int i3 = 1_000_000_000;
        System.out.println(i3);
    }
}