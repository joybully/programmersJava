public class LoopEx06{
    public static void main(String[] args){
        // 1~10까지의 합
        System.out.println("시작");
        // 누적을 위한 변수선언
        int sum = 0;
        for(int i=1; i<=10; i++){
            // System.out.println(i);
            // 누적 프로그램
            // sum = sum + i;
            sum += i;
            /*
                i=1     0 + 1;
                i=2     (0 + 1) +2;
                i=3     ((0 + 1) + 2) + 3;
                ...
            */
        }
        System.out.println("합계 : " + sum);
        System.out.println("끝");
    }
}