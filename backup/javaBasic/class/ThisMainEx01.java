class This{
    This(){
        System.out.println("생성자 호출");
    }
    This(String name){
        // 에러난다
        // This();
        this();
        System.out.println("생성자 오버로딩 호출");
        // 에러난다
        // this()는 무조건 첫줄에 써야한다
        // this();
    }
}

public class ThisMainEx01{
    public static void main(String[] args){
        This t = new This("홍길동");
    }
}