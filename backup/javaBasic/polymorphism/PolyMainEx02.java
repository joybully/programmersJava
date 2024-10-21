class Parent{
    Parent(){
        System.out.println("Parent 생성자 호출");
    }
}

class Child1 extends Parent{
    Child1(){
        System.out.println("Child1 생성자 호출");
    }
}

class Child2 extends Parent{
    Child2(){
        System.out.println("Childs 생성자 호출");
    }
}

public class PolyMainEx02{
    public static void main(String[] args){
        Parent p1 = new Parent();
        Parent c1 = new Child1();
        Parent c2 = new Child2();
        // 자동 형변환
        // 자식1 -> 부모
        // 자식2 -> 부모
        Parent p21 = new Child1();
        Parent p22 = new Child2();
        // 강제 형변환
        // 자식1 -> 부모 -> 자식1
        // 자식2 -> 부모 -> 자식2
        Child1 c11 = (Child1)p21;
        Child2 c21 = (Child2)p22;

        // 런타임 에러난다
        // 부모(자식으로 형변환) -> 자식
        // Child2 c22 = (Child2)p21;
        // 컴파일 에러난다
        // 부모 -> 자식
        // Child1 c31 = new Parent();
        // 런타임 에러난다
        // 자식1 -> 부모 -> 자식2
        // Child1 c31 = (Child1)(new Parent());
    }
}