package com.exam;

public class LambdaEx07 {
    public static void execute(LambdaInter7 f){
        f.run();
    }

    public static void main(String[] args) {
        LambdaInter7 f = () -> System.out.println("Hello Lambda1");
        execute(f);
        execute( () -> System.out.println("Hello Lambda2"));
    }
}
