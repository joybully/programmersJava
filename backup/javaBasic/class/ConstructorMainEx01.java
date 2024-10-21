class Constructor{
    // 맴버필드
    String name;
    // 생성자가 없으면 컴파일러 자동생성: 디폴트 생성자
    // 수동생성
    Constructor(){
        System.out.println("생성자 호출");
        this.name = "홍길동";
    }
    Constructor(String name){
        // 매서드 내부에서 맴버필드와 지역변수를 구분
        this.name = name;
    }
}

public class ConstructorMainEx01{
    public static void main(String[] args){
        // 인스턴스화
        // 클래스명 변수명 = new + 생성자 호출
        // 생성자는 독립적으로 호출할 수 없음
        // Constructor c = new Constructor();
        Constructor c1 = new Constructor();
        System.out.println(c1.name);
        Constructor c2 = new Constructor("홍길동");
        System.out.println(c2.name);
    }
}