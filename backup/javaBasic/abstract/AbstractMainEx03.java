abstract class Animal{
    // Animal(){
    //     System.out.println("Animal 생성자 호출");
    // }
    abstract void cry();
}

class Dog extends Animal{
    // Dog(){
    //     System.out.println("Dog 생성자 호출");
    // }
    void cry(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    // Cat(){
    //     System.out.println("Cat 생성자 호출");
    // }
    void cry(){
        System.out.println("야옹");
    }
}

public class AbstractMainEx03{
    public static void main(String[] args){
        Animal animal = new Dog();
        animal.cry();
        animal = new Cat();
        animal.cry();
    }
}