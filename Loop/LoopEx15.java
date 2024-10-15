public class LoopEx15{
    public static void main(String[] args){
        // break는 탈출
        // continue는 skip
        System.out.println("시작");
        int i = 0;
        while(i<=5){
            i++;
            if(i==3) break;
            System.out.println(i);
        }
        System.out.println();
        i = 0;
        while(i<=5){
            i++;
            if(i==3) continue;
            System.out.println(i);
        }
        System.out.println("끝");
    }
}