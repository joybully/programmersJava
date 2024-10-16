import java.util.Scanner;
class JCal{
    void print(int num1, int num2, int result, String cal){
        System.out.println(num1 + " " + cal + " " + num2 + " = " + result);
    }
    void result(int num1, int num2, String cal){
        int result = 0;
        switch(cal){
            case "+":
                result = num1+num2;
                print(num1, num2, result, cal);
                break;
            case "-":
                result = num1-num2;
                print(num1, num2, result, cal);
                break;
            case "x":
                result = num1*num2;
                print(num1, num2, result, cal);
                break;
            case "X":
                result = num1*num2;
                print(num1, num2, result, cal);
                break;
            default:
        }    
    }
}

public class JavaCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            JCal jcal = new JCal();
            System.out.println("계산할 기호를 입력하시오 x: 곱하기, +: 더하기, -: 뺴기");
            String cal = sc.nextLine();
            System.out.println("계산할 숫자를 입력하시오");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.println("계산할 숫자를 하나 더 입력하시오");
            int num2 = Integer.parseInt(sc.nextLine());
            jcal.result(num1, num2, cal);
        }
    }
}