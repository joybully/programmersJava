class Parent{
    String p = "박문수";
    void viewParent(){
        System.out.println("Parent viewParent");
    }
}

class Child extends Parent{
    // 맴버필드
    String p = "홍길동";
    String c = "임꺽정";
    void viewChild(){
        System.out.println("viewChild");
    }
    void viewParent(){
        System.out.println("Child viewParent");
    }
    void parentView(){
        // 부모의 맴버필드
        // 부모의 p인 박문수를 가져온다
        System.out.println(super.p);
        // 부모의 메서드
        super.viewParent();
        // 현재 클래스의 주소값이 나옴
        System.out.println(this);
        // super나 this나 똑같은데, super는 주소값이 안나온다
        // System.out.println(super);
    }
}

public class InheritanceEx04{
    public static void main(String[] args){
        Child c = new Child();
        System.out.println(c.c);
        System.out.println(c.p);
        c.viewChild();
        c.viewParent();
        c.parentView();
    }
}