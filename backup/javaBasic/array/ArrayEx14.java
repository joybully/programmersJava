public class ArrayEx14{
    public static void main(String[] args){
        // 암기
        // String의 형변환
        // String -> int        : Integer.parseInt()
        // String -> double     : Double.parseDouble()
        String str1 = "1";
        String str2 = "2";
        // 문자열 연결 연산자
        System.out.println(str1 + str2);
        // 산술
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
        // 입력받아 계산
        System.out.println(args[0] + args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
        int[] arr1 = new int[Integer.parseInt(args[0])];
        for(int i=1; i<arr1.length; i++){
            arr1[i] = i;
        }
        for(int data:arr1){
            System.out.println(data);
        }
    }
}