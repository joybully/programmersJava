public class ConditionEx06{
    public static void main(String[] args){
        // 변수의 값이 짝수면 "짝수" 출력하고 홀수면 "홀수" 출력
        System.out.println("시작");
        int data = 11;
        // 홀수/짝수가 되는 기준
        // 분기가 필요(필터링)
        // 홀수인지만 확인하면 됨
        if(data % 2 == 1){
            System.out.println("홀수");
        }
        else{
            System.out.println("짝수");
        }
        System.out.println("끝");
    }
}