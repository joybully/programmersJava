public class LoopEx19{
    public static void main(String[] args){
        // *
        // **
        // ***
        // ****
        // *****
        // ******
        // *******
        // ********
        // *********
        // **********
        // 중첩 for문을 이용해서 출력
        // 규칙: 행번호가 asterisk의 개수
        System.out.println("시작");
        for(int i=1; i<=10; i++){
            // 행
            for(int j=1; j<=i; j++){
                // 열
                System.out.print('*');
            }
            System.out.println();
        }        
        System.out.println("끝");
    }
}