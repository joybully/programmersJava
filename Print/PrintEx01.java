public class PrintEx01{
    public static void main(String[] args){
        System.out.print("hello1");
        System.out.println("hello2");
        System.out.printf("%s","hello3");
        System.out.print("hello4");
        System.out.printf("%s - %s", "hello11", "hello12");
        System.out.printf("%s%n", "hello14");
        System.out.printf("hello13");//"%s"가 디폴트
        
        //실행안함
        //설명문 쓸 수 있음
        //System.out.println("hello5");
        
        /*
        *은 파일명
        한글이 포함된 소스코드의 컴파일
        javac -encoding utf-8 *.java
        그 외에 컴파일
        javac *java
        실행
        java *(확장자 빠진 파일명)
         */

        /*System.out.println("hello6");
        System.out.println("hello7");
        System.out.println("hello8");
        System.out.println("hello9");
        System.out.println("hello10");
        */
        }
}