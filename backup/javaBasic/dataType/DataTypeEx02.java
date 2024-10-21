public class DataTypeEx02{

    public static void main(String[] args){

        // 문자(Character) - 한글자 : '문자'
        // 문자열(String)  - 문자열 : "문자열"

        char c1 = 'A';
        char c2 = '1';
        // ascii code
        // 문자를 숫자 코드로 저장하는 방법
        char c3 = 1;
        char c4 = 97;
        char c5 = 67;
        
        // 유니코드
        // 다국어
        char c6 = '\uC790';

        System.out.println(c1);
        System.out.println(c2);
        // 아무것도 안나온다
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }

}