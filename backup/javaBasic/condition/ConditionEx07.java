public class ConditionEx07{
    public static void main(String[] args){
        // 변수 값이 5와 10사이에 있으면 "영역내" 출력하고 그렇지 않으면 "영역외" 출력
        // 5 < 변수, 변수 < 10 모두 true여야 한다
        // 따라서 5 < 변수(true) && 변수 < 10(true)
        System.out.println("시작");
        int data = 8;
        if((data > 5) && (data < 10)){
            System.out.println("영역내");
        }
        else{
            System.out.println("영역외");
        }
        System.out.println("끝");
    }
}