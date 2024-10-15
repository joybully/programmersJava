public class LoopEx07{
    public static void main(String[] args){
        // 1~100까지 짝수의 합
        System.out.println("시작");
        // 수열
        int sum = 0;
        for(int i=2; i<=100; i+=2){
            sum += i;
        }
        System.out.println("짝수의 합 : " + sum);
        System.out.println("끝");
    }
}