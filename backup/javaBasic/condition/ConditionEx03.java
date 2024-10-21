public class ConditionEx03{
    public static void main(String[] args){
        // 나이(age)가 18이면 "선거 가능"이라고 출력
        // 18세 미만이면 아무것도 안함
        System.out.println("시작");
        int age = 18;
        if(age >= 18){
            System.out.println("선거 가능");
        }
        System.out.println("끝");
    }
}