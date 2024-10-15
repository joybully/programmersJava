public class LoopEx08{
    public static void main(String[] args){
        // 처음과 끝이 존재 : 유한루프
        // for(int i=1; i<=5; i++){
        // }
        // 무한루프 => 시스템이 정지
        // 프로그램 필요에 따라 무한루프 사용가능
        // 조건의 성립이 잘못된 경우 무한루프 발생가능
        // for(;;){
        // }
        // i를 미리 선언하는 경우
        int i=1;
        for(;i<=5;i++){
            System.out.println("Hello");
        }
        // 초기식 / 조건식 / 증감식 => 1개 이상도 가능
        for(int j=1, k=5; j<=5 || k<=10; j++, k++){
            System.out.println(j + " / " + k);
        }
    }
}