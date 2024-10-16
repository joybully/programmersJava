public class ConditionEx09{
    public static void main(String[] args){
        /*
            점수(score)
            점수가 90점 이상 - A를 출력
            점수가 80점 이상 - B를 출력
            점수가 70점 이상 - C를 출력
            점수가 60점 이상 - D를 출력
            기타             - F를 출력
            기준점
        */
       System.out.println("시작");
        int score = 55;
        // 여러개의 조건 중 하나를 선택
        if(score >= 90){
        System.out.println("A");
        }
        else{
        if(score >= 80){
            System.out.println("B");
        }
        else{
            if(score >= 70){
                System.out.println("C");
            }
            else{
                if(score >= 60){
                    System.out.println("D");
                }
                else{
                    System.out.println("F");
                }
            }
        }
        }
       // if ~ else if ~ else 구문
       if(score >= 90){
            System.out.println("A");
       }
       else if(score >= 80){
            System.out.println("B");
        }
        else if(score >= 70){
            System.out.println("C");
        }
        else if(score >= 60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
        // 처리와 출력 분리 = 모듈화!
        String grade = "";
        if(score >= 90){
            grade = "A";
       }
       else if(score >= 80){
            grade = "B";
        }
        else if(score >= 70){
            grade = "C";
        }
        else if(score >= 60){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.println("성적은 " + grade);
       System.out.println("끝");
    }
}