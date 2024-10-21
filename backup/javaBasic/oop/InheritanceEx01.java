class Parent{
    String p = "parent";
    void viewParent(){
        System.out.println("viewParent() 호출");
    }
}

class Child1{
    void viewChild(){
        System.out.println("Child1 viewChild() 호출");
    }
}

// Parent를 상속받으면서 Parent의 메서드도 쓸 수 있게 되었다
// 다중상속은 허용하지 않는다(부모가 여럿이면 안된다)
// 자식이 여럿인건 okay!
class Child2 extends Parent{
    String c2 = "child2";
    void viewChild(){
        System.out.println("Child2 viewChild() 호출");
    }
}
class Child3 extends Parent{
    String c3 = "child3";
    void viewChild(){
        System.out.println("Child3 viewChild() 호출");
    }
}
class GrandChild2 extends Child2{
    String gc2 = "grandchild";
    void viewGrandChild(){
        System.out.println("GrandChild2 viewGrandChild() 호출");
    }
}
// 실행 클래스
public class InheritanceEx01{
    public static void main(String[] args){
        Parent p = new Parent();
        p.viewParent();
        Child1 c1 = new Child1();
        c1.viewChild();
        Child2 c2 = new Child2();
        c2.viewChild();
        c2.viewParent();
        Child3 c3 = new Child3();
        c3.viewChild();
        c3.viewParent();
        GrandChild2 gc2 = new GrandChild2();
        gc2.viewGrandChild();
        gc2.viewChild();
        gc2.viewParent();
        System.out.println(gc2.p);
        System.out.println(gc2.c2);
        System.out.println(gc2.gc2);
    }
}