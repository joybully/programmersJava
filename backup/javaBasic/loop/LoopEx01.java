public class LoopEx01{
    public static void main(String[] args){
        // Hello World 5번 출력
        System.out.println("시작");
        // 노가다
        System.out.println("Hello World1");
        System.out.println("Hello World2");
        System.out.println("Hello World3");
        System.out.println("Hello World4");
        System.out.println("Hello World5");
        // for문 이용
        // 반복횟수 중요
        // 수열같은 효과
        for(int i=1; i<=5; i++){
            System.out.println("Hello World: " + i);
        }
        // 1부터 10까지 출력
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        // 1부터 10까지 홀수만 출력
        // 홀수를 걸러낸다
        // for문을 10번 돈다
        for(int i=1; i<=10; i++){
            if(i % 2==1){
                System.out.println(i);
            }
        }
        // i를 2씩 증가
        // for문을 5번 돈다
        for(int i=1; i<=10; i+=2){
            System.out.println(i);
        }
        System.out.println("끝");
    }
}