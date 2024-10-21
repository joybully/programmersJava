public class LoopEx18{
    public static void main(String[] args){
        // while / continue를 이용해
        // 1부터 100까지 짝수의 합
        System.out.println("시작");
        int i = 0;
        int sum = 0;
        while(i<=99){
            i++;
            if((i%2)==1) continue;
            sum += i;
        }
        System.out.println(sum);
        System.out.println("끝");
    }
}