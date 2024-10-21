public class LoopEx09{
    public static void main(String[] args){
        // 중첩반복문
        // 반복문 1개 : 1차뭔
        // 반복문 2개 : 2차원
        // 반복문 3개 : 3차원
        System.out.println("시작");
        for(int i=1; i<=5; i++){
            // 5번
            System.out.println( "?");
            for(int j=1; j<=5; j++){
                // 25번
                System.out.println(i + " / " + j);
            }
        }
        System.out.println("끝");
    }
}