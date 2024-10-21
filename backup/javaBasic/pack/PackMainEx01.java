import com.Pack2;
import com.java.test.Pack3;
// com.java.test에 있는 모든 파일 다 가져온다
// import com.java.test.*;

public class PackMainEx01{
    public static void main(String[] args){
        // Pack1 p1 = new Pack1();
        // Pack2 p2 = new Pack2();

        // 패키지 안의 클래스에 접근하는 방법
        // com.Pack2 p2 = new com.Pack2();

        // import 했으니 아래와 같이 써도 된다
        // Pack p2 = new Pack2();

        // com.java.test.Pack3 p3 = new com.java.test.Pack3();
        // import 했으니 아래와 같이 써도 된다
        Pack3 p3 = new Pack3();
    }
}