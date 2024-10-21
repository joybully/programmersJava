public class DataTypeEx04{
    public static void main(String[] args){
        // 문자열 - 기본데어터타입은 아니다
        char c1 = 'A';
        System.out.println(c1);

        // 에러코드
        // char c2 = 'AA';
        //System.out.println(c2);
        
        // 데이터에서 가장 많은 형태
        // 정상코드
        // 쌍따옴표 조심
        String s1 = "AA";
        String s2 = "AA\nBB";
        
        System.out.println(s1);
        System.out.println(s2);
    }
}