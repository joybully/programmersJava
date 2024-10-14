public class DataTypeEx06{
    public static void main(String[] args){
        // 실수
        // float, double(표준)

        // 에러코드
        /*int i = 2.5;
        System.out.println(i);
        */
        
        // 에러코드
        /*float f1 = 2.5;
        System.out.println(f1);
        */
        // 정상코드
        float f2 = 2.5f;
        System.out.println(f2);

       double d = 2.5;
       System.out.println(d);

       // 정수 -> 실수 -> 지수
       // 1000 -> 1.0e3
       double d2 = 1.0e3;
       System.out.println(d2);
    }
}