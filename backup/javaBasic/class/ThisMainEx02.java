class Constructor{
    String hakbun;
    String name;
    Constructor(){
        this("0000","아무개");
    }
    Constructor(String name){
        this("0000", name);
    }
    Constructor(String hakbun, String name){
        this.hakbun = hakbun;
        this.name = name;
    }
}

public class ThisMainEx02{
    public static void main(String[] args){
        Constructor c1 = new Constructor();
        System.out.println(c1.hakbun);
        System.out.println(c1.name);
        Constructor c2 = new Constructor("홍길동");
        System.out.println(c2.hakbun);
        System.out.println(c2.name);
        Constructor c3 = new Constructor("1111", "박문수");
        System.out.println(c3.hakbun);
        System.out.println(c3.name);
    }
}