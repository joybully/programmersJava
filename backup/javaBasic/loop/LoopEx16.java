public class LoopEx16{
    public static void main(String[] args){
        System.out.println("시작");
        int i = 0;
        while(i<=5){
            i++;
            int j = 0;
            while(j<=5){
                j++;
                // break는 가장 가까운 반복문을 탈출한다
                if(j==4) break;
                // continue는 가장 가까운 반복문으로 간다
                if(j==2) continue;
                System.out.println(i + " / " + j);
            }
        }
        System.out.println("끝");
    }
}