package com.exam;

public class LambdaEx08 {
    public static LambdaInter7 getLambdaInter8(){
        LambdaInter7 f = () -> System.out.println("Hello Lambda");
        return f;
    }

    public static void main(String[] args) {
        LambdaInter7 f = getLambdaInter8();
        f.run();
    }
}
