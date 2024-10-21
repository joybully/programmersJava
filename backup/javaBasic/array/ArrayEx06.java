public class ArrayEx06{
    public static void main(String[] args){
        // 기본 자료형
        // 선언, 초기화
        int a1 = 10;
        int a2 = a1;
        System.out.println(a1);
        System.out.println(a2);
        a2 = 20;
        System.out.println(a1);
        System.out.println(a2);
        // 참조 자료형
        int[] arr1 = {10, 20, 30};
        // shallow copy
        int[] arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2); // arr1의 주소값이 arr2라는 변수에 저장됨
        arr2[0] = 100;
        System.out.println(arr1[0]); // arr2의 0번 인덱스만 바꿔도 arr1의 0번 인덱스도 달라진다 
        System.out.println(arr2[0]);    
    }
}