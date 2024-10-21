public class ArrayEx08{
    public static void main(String[] args){
        // 기타 자료형의 배열
        String[] arr1;
        arr1 = new String[3];
        arr1[0] = "1 번";
        arr1[1] = "2 번";
        arr1[2] = "3 번";
        System.out.println(arr1[0]);
        System.out.println(arr1[2]);
        String[] arr2 = {"1 번", "2 번", "3 번"};
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);
        for (String str : arr2){
            System.out.println(str);
        }
    }
}