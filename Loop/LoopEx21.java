public class LoopEx21{
    public static void main(String[] args){
        // 문제1
        // A
        // AB
        // ABC
        // ABCD
        // ABCDE
        // ABCDEF
        // ABCDEFG
        // ABCDEFGH
        // ABCDEFGHI
        // ABCDEFGHIJ
        // 출력하시오
        // 문제2
        // 1 X 1 = 1  1 X 2 = 2  1 X 3 = 3 ... 1 X 9 = 9
        // 2 X 1 = 2  2 X 2 = 4  2 X 3 = 6 ... 2 X 9 = 18
        // ...
        // 9 X 1 = 9  9 X 2 = 18  9 X 3 = 27 ... 9 X 9 = 81
        // 구구단을 출력하시오
        // 문제3
        // 1 + (1+2) + (1+2+3) + ... +(1+2+3+...+10)
        // 결과를 계산하시오
        // 문제1
        for(char ch1='A'; ch1<='J'; ch1++){
            for(char ch2='A'; ch2<=ch1; ch2++){
                System.out.print(ch2);
            }
            System.out.println();
        }
        // 문제2
        for(int i=1; i<=9; i++){
            int first = i;
            for(int j=1; j<=9; j++){
                int second = j;
                System.out.print(first + " X " + second + " = " + (first*second) + "  ");
            }
            System.out.println();
        }
        // 문제3
        // sol1
        // 이중for문
        int sum = 0;
        for(int i=1; i<=10; i++){
            int unit = 0;
            for(int j=1; j<=i; j++){
                unit+=j;
            }
            sum+=unit;
        }
        System.out.println(sum);
        // sol2
        // 단일for문
        sum = 0;
        for(int i=1; i<=10; i++){
            sum+=i*(11-i);
        }
        System.out.println(sum);
    }
}