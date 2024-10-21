 class Parent{
//     // 디폴트 생성자
//     Parent(){
//         System.out.println("Parent : " + this);
//     }
    Parent(String name){
        System.out.println("Parent(String name) : " + this);
    }
}

class Child extends Parent{
    // 생성자
    Child(){
        // 부모의 생성자를 호출
        super("홍길동");
        System.out.println("Child : " + this);
        // super("홍길동");
    }
}

public class InheritanceEx03{
    public static void main(String[] args){
        Child c = new Child();
        // 위랑 주소가 똑같이 나온다
        System.out.println("c : " + c);
    }
}