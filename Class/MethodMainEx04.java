class Method{
    // 가변인자(argument)
    void doFunc1(int a){
        System.out.println("doFunc1(int a) 호출");
    }
    // 가변인자 선언
    // args는 배열처럼 사용된다
    void doFunc2(int ... args){
        System.out.println("doFunc2(int ... args) 호출");
        System.out.println(args.length);
        for(int arg: args){
            System.out.print(arg + ", ");
        }
        System.out.println();
    }
}

public class MethodMainEx04{
    public static void main(String[] args){
        Method m = new Method();
        m.doFunc1(10);
        // 가변인자로 호출
        m.doFunc2(10);
        m.doFunc2(10, 20);
        m.doFunc2(10, 20, 30, 40);
    }
}