class Main{
    Main(){
        System.out.println("Main 생성자 호출");
    }
}

public class MainEx01{
    int instanceVariable = 10;
    static int classVariable = 30;
    MainEx01(){
        System.out.println("MainEx01 생성자 호출");    
    }
    public static void main(String[] args){
        Main m = new Main();
        MainEx01 me = new MainEx01();
        // instanceVariable/ classVariable
        System.out.println(MainEx01.classVariable);
        // 이 클래스 메소드는 static이 붙었기 때문에 this호출 안된다
        // 에러난다
        // System.out.println(this.instanceVariable);
        System.out.println(me.instanceVariable);
    }
}