public class InputEx{
	public static void main(String[] args){
    	String opt = args[1];
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        int result;
        switch(opt){
        	case "+":
            	result = num1+num2;
            	System.out.println(num1 + " " + opt + " " + num2 + " = " + result);
				break;
			case "-":
            	result = num1-num2;
            	System.out.println(num1 + " " + opt + " " + num2 + " = " + result);
				break;
			case "x":
            	result = num1*num2;
            	System.out.println(num1 + " " + opt + " " + num2 + " = " + result);
				break;
			case "/":
            	result = num1/num2;
            	System.out.println(num1 + " " + opt + " " + num2 + " = " + result);
				break;
			default:
            	result = 0;
                System.out.println("Invaild Operator");
        }
    }
}