public class ArrayEx12{
    public static void main(String[] args){
        // 가변 배열
        // 열의 개수를 마음대로 설정할 수 있다
        int[][] arr1 = new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[2];
        arr1[2] = new int[1];
        arr1[0][0] = 10;
        arr1[2][0] = 20;
        System.out.println(arr1[0][0]);
        System.out.println(arr1[2][0]);
        int[][] arr2 = {{10, 20, 30}, {40, 50}, {10}};
        System.out.println(arr1[0][0]);
        System.out.println(arr1[2][0]);
        int[][] arr = new int[3][];
        arr[0] = new int[]{10, 20, 30};
        arr[1] = new int[]{40, 50};
        arr[2] = new int[]{10, 20, 30};
        // arr[0] = {10, 20, 30};
        // arr[1] = {40, 50};
        // arr[2] = {10, 20, 30};
        for(int[] col:arr){
            for(int data:col){
                System.out.print(data + "\t");
            }
            System.out.println();
        }
        int[] arr4 = new int[3];
        arr4 = {1,2,3};
    }
}