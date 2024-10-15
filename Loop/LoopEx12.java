public class LoopEx12{
    public static void main(String[] args){
        System.out.println("시작");
        // while의 이중중첩
        int i = 1;
        while(i<=5){
            int j = 1;
            while(j<=5){
                System.out.println(i + " / "+ j);
                j++;
            }
            i++;
        }
        System.out.println("끝");
    }
}