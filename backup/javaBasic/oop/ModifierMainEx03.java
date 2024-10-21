class Modifier{
    private String data;
    // 입력용 메서드
    // setter 메서드
    public void setterData(String data){
        this.data = data;
    }
    // 출력용 메서드
    // getter 메서드
    public String getterData(){
        return this.data;
    }
}

public class ModifierMainEx03{
    public static void main(String[] args){
        Modifier m = new Modifier();
        // 에러난다
        // 맴버필드 private
        // m.data = "data";
        // 데이터의 입출력
        // 데이터의 입력
        m.setterData("데이터");
        // 데이터의 출력
        System.out.println(m.getterData());
    }
}