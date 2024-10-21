public class LoopEx11{
    public static void main(String[] args){
        // A~Z 출력
        // while을 이용
        System.out.println("시작");
        char ch = 'A';
        while(ch<='Z'){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
        int i=65;
        while(i<=90){
            System.out.print((char)i);
            i++;
        }
        System.out.println("끝");
    }
}