public class ArrayEx04{
    public static void main(String[] args){
        // 문제
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // 짝수 인덱스에 해당하는 데이터의 합을 계산
        int sum = 0;
        int count = 0;
        for(int data : arr){
            if(count%2==0) sum+=data;
            count++;
        }
        System.out.println(sum);
        sum = 0;
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}