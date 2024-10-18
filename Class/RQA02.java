class Util {
	void doGugudan(int start, int end) {
		for( int i=start ; i<=end ; i++ ) {
			for( int j=1 ; j<=5 ; j++ ) {
				System.out.print( i + " x " + j + " = " + ( i * j ) + "\t" );
			}
			System.out.println();
		}
	}
	void doCalculator(int num1, String oper, int num2) {
		int result = 0;
		switch( oper ) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "x":
			result = num1 * num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		}

		System.out.println( num1 + " " + oper + " " + num2 + " = " + result );
	}
}

public class RQA01 {
	public static void main(String[] args) {
		if( args.length != 3 ) {
				System.out.println( "인자의 갯수가 틀립니다. : " + args.length );
			} else {
				int value1 = Integer.parseInt( args[0] );
				int value2 = Integer.parseInt( args[2] );
				
				switch( args[1] ) {
				case "+":
					System.out.println( "결과 : " + ( value1 + value2 ) );
					break;
				case "-":
					System.out.println( "결과 : " + ( value1 - value2 ) );
					break;
				case "x":
					System.out.println( "결과 : " + ( value1 * value2 ) );
					break;
				case "/":
					System.out.println( "결과 : " + ( value1 / value2)  );
					break;
				default:
					break;
				}
			}
		Util u = new Util();
		u.doGugudan( 2, 3 );
		System.out.println( "" );
		u.doGugudan( 2, 5 );
		u.doCalculator( 2, "+", 3 );
		u.doCalculator( 2, "x", 3 );
	}
}
