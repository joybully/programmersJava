// 상속불가
final class Parent{
    Parent(){
        System.out.println("Parent 생성자");
    }
}

// 에러난다
// 상속 막아놓은 class를 상속해서
// class Child extends Parent{
//     Child(){
//         System.out.println("Child 생성자");
//     }
// }

public class FinalMainEx03{
    public static void main(String[] args){
        // Child c = new Child();
    }
}