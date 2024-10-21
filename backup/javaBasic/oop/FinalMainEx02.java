class Parent{
    // final 붙여서 Overriding 금지
    final void viewParent(){
        System.out.println("Parent viewParent");
    }
}

class Child extends Parent{
    // 오버라이딩
    // void viewParent(){
    //     System.out.println("Child viewParent");
    // }
}

public class FinalMainEx02{
    public static void main(String[] args){
        Child c = new Child();
        c.viewParent();
    }
}