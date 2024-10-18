class Modifier{
    void method1(){
        System.out.println("default");
    }
    public void method2(){
        System.out.println("public");
    }
    protected void method3(){
        System.out.println("protected");
    }
    private void method4(){
        System.out.println("private");
    }
}

public class ModifierMainEx02{
    public static void main(String[] args){
        Modifier m = new Modifier();
        m.method1();
        m.method2();
        m.method3();
        // 에러난다
        // private 메소드라서
        // m.method4();
    }
}