public class ConditionEx10{
    public static void main(String[] args){
        /*
            data가 10이면 10을 출력
            data가 20이면 20을 출력
            data가 30이면 30을 출력
            기타이면      00을 출력
            if
            switch
        */
       System.out.println("시작");
       int data = 20;
       // 조건에 만족하면 밑의 조건은 통과
       // 따라서 break;를 추가해야 한다
       // switch에 들어갈 수 있는 data자료형은 byte, short, int, char이고
       // String이 추가 됨
       switch(data){
        case 10 : 
            System.out.println("10");
            break;
        case 20 :
            System.out.println("20");
            break;
        case 30 :
            System.out.println("30");
            break;
        default :
            System.out.println("00");
       }
       // 문자열 형식을 비교
       String str = "20";
       switch(str){
        case "10" :
            System.out.println("10");
            break;
        case "20" :
            System.out.println("20");
            break;
        case "30" :
            System.out.println("30");
            break;
        default :
            System.out.println("기타");
       }
       System.out.println("끝");
    }
}