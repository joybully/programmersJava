class Util{
    int start;
    int end;
    Util(int start, int end){
        this.start = start;
        this.end = end;
    }
    void doGugudan(){
        for(int i = this.start;i<=this.end;i++){
            for(int j=1; j<10;j++){
                System.out.print(i + " X " + j + " = " + i*j + "\t");
            }
            System.out.println();
        }
    }
    void doCalculator(int num1, String cal, int num2){
        double result = 0;
        switch(cal){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "x":
                result = num1*num2;
                break;
            case "X":
                result = num1*num2;
                break;
            case "/":
                result = (double)num1/num2;
                break;
            default:
        }
        System.out.println("연산결과는 " + result);
    }
}

public class UtilEx01{
    public static void main(String[] args){
        Util util = new Util(3,7);
        util.doGugudan();
        util.doCalculator(11,"+",123);
    }
}