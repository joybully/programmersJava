class Student{
    private String studentNumber;
    private String name;
    private String phoneNumber;
    private int age;
    private String address;
    Student (String studentNumber, String name, String phoneNumber, int age, String address){
        this.setStudentNumber(studentNumber);
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setAge(age);
        this.setAddress(address);
    }
    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getStudentNumber(){
        return this.studentNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }
    public String printData(){
        String sN = this.getStudentNumber();
        String n = this.getName();
        String pN = this.getPhoneNumber();
        int ag = this.getAge();
        String ad = this.getAddress();
        return (sN + "\t" + n + "\t" + pN + "\t" + ag + "\t" + ad);
    }
}

public class ROA03{
    public static void main(String[] args){
        String[][] student1 = new String[3][5];
        student1[0][0] = "1001";
        student1[0][1] = "홍길동";
        student1[0][2] = "010-111-1111";
        student1[0][3] = "20";
        student1[0][4] = "서울시";
        student1[1][0] = "1002";
        student1[1][1] = "박문수";
        student1[1][2] = "010-222-2222";
        student1[1][3] = "22";
        student1[1][4] = "경기도";
        student1[2][0] = "1003";
        student1[2][1] = "임꺽정";
        student1[2][2] = "010-333-3333";
        student1[2][3] = "25";
        student1[2][4] = "강원도";
        for(String[] col1:student1){
            for(String data:col1){
                System.out.print(data + "\t");
            }
            System.out.println();
        }
        Student[] student2 = new Student[3];
        student2[0] = new Student("1001", "홍길동", "010-111-1111", 20, "서울시");
        student2[1] = new Student("1002", "박문수", "010-222-2222", 22, "경기도");
        student2[2] = new Student("1003", "임꺽정", "010-333-3333", 25, "강원도");
        for(Student stu:student2){
            System.out.println(stu.printData());
        }
        System.out.println();

        int[] arr1 = {1};
        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[0] = arr1;
        System.out.println(arr[0][0]);
        // arr[1] = {1,2};
        // arr[2] = {1,2,3};
    }
}