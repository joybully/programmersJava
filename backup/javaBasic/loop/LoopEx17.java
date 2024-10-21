public class LoopEx17{
    public static void main(String[] args){
        System.out.println("시작");
        int i = 0;
        // 바깥의 루프를 깨고 싶으면
        // 라벨 : label
        outer : 
        while(i<=5){
            i++;
            int j = 0;
            while(j<=5){
                j++;
                if(j==3) {
                    continue outer;
                }
                if(i==5){
                    break outer;
                }
                System.out.println(i + " / " + j);
            }
        }
        System.out.println("끝");
    }
}