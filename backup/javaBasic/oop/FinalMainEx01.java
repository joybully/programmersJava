class Parent{
    // final 붙어서 오버라이드 막아버림
    // final void viewParent(){
    //     System.out.println("Parent viewParent");
    // }
    void viewParent(){
         System.out.println("Parent viewParent");
    }
}

class Child extends Parent{
    // 상수화 된 맴버변수가 됨 => 변경안됨
    // 이렇게는 거의 안쓰임
    // final String name = "홍길동";
    // 보통 이렇게 쓰임
    // 보통 final static을 같이 씀
    // final static, static final 모두 된다
    static final String NAME = "홍길동";
    void viewChild(){
        // 상수화 된 지역변수
        final String name = "박문수";
        System.out.println(name);
    }
    // 오버라이딩
    void viewParent(){
        System.out.println("Child viewParent");
    }
}

public class FinalMainEx01{
    public static void main(String[] args){
        Child c = new Child();
        System.out.println(c.NAME);
        // 에러난다
        // 상수화된 맴버변수이기 떄문에
        // c.name = "박문수";
        c.viewChild();
        c.viewParent();
    }
}