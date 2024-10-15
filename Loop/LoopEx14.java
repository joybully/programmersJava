public class LoopEx14{
    public static void main(String[] args){
        // A~Z출력
        // do-while을 이용
        System.out.println("시작");
        int i = 65;
        do{
            System.out.print((char)i);
            i++;
        }while(i<=90);
        System.out.println("끝");
        // 중첩 do~while
        i = 1;
        do{
            int j = 1;
            do{
                System.out.println(i + " / " + j);
                j++;
            }while(j<=5);
            i++;
        }while(i<=5);
    }
}