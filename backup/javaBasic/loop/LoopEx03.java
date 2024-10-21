public class LoopEx03{
    public static void main(String[] args){
        // ABCD ~ Z출력
        // ascii이용
        // A의 ascii코드는 65
        System.out.println("시작");
        for(int i=65; i<=90; i++){
            System.out.print((char)i);
        }
        System.out.println();
        // char는 ascii 코드이기 때문에 1씩 더해준다
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print(ch);
        }
        System.out.println("끝");
    }
}