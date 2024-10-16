public class ArrayEx13{
    // main => 메인 메서드
    // args => argument
    public static void main(String[] args){
        // 프로그램 시작하면 args에 생성자가 만들어진다 
        // 만약 java ArrayEx13 뒤에 다른 명령어를 붙이면 
        // 그 명령어가 args에 저장된다
        System.out.println("입력 개수 : " + args.length);
        for(String arg:args){
            System.out.print(arg + ", ");
        }
        System.out.println();
    }
}