abstract class E{

}

interface I{
    void method();
}

class E1 extends E implements I{
    public void method(){}
}

class E2 extends E{

} 

public class InstanceOfMainEx01{
    public static void main(String[] args){
        E1 e1 = new E1();
        E2 e2 = new E2();
        E e11 = new E1();
        E e12 = new E2();
        // instanceof -> 어떤 것의 instance인지 물어본다
        System.out.println(e11 instanceof E1); // true
        System.out.println(e12 instanceof E2); // true
        System.out.println(e11 instanceof E2); // false
        System.out.println(e11 instanceof E); // true
        System.out.println(e11 instanceof E); // true
        System.out.println(e1 instanceof I); // true
        I i1 = e1;
        System.out.println(e2 instanceof I); // false
        // 에러난다
        // E2는 I 안 받았으니까
        // I i2 = e2;
    }
}