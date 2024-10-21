// 다형성
// 부모(일반클래스, 추상클래스, 인터페이스) -> 자식의 메서드
interface Employee{
    void salary();
}

class ChildEmployee implements Employee{
    public void salary(){
        System.out.println("ChildEmployee salary 호출");
    }
}

class Child2Employee implements Employee{
    public void salary(){
        System.out.println("Child2Employee salary 호출");
    }
}

public class InterfaceMainEx04{
    public static void main(String[] args){
        // 앞의 호출이 인터페이스여도 상관없다
        Employee e1 = new ChildEmployee(); 
        Employee e2 = new Child2Employee(); 
        e1.salary();
        e2.salary();
    }
}