class Modifier{
    // 맴버 필드
    String data1 = "default";
    public String data2 = "public";
    protected String data3 = "protected";
    // 클래스 밖에서 접근 불가
    private String data4 = "private";
    void viewData(){
        // 내부적으로는 접근제어자가 필요없음
        System.out.println(this.data1);
        System.out.println(this.data2);
        System.out.println(this.data3);
        // 클래스 안에서 접근된다
        System.out.println(this.data4);
    }
}

public class ModifierMainEx01{
    public static void main(String[] args){
        Modifier m = new Modifier();
        // 외부의 접근은 접근제어자가 필요함
        // private & public
        System.out.println(m.data1);
        System.out.println(m.data2);
        System.out.println(m.data3);
        // 에러난다
        // 밖의 class에서 private로 막았다
        // System.out.println(m.data4);
        m.viewData();
    }
}