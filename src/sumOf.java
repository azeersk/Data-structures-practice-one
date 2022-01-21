import java.util.Scanner;

public class sumOf {
    public static String sumOfSubArray(int[] arr, int sum){
        int n = arr.length;
        int current_sum = 0;
        int start = 0;
        int end = 1;
        while (end<n){
            while((current_sum > sum) && (start<end-1)){
                current_sum = current_sum - arr[start];
                start = start + 1;
            }
            if(arr[start] == sum){
                return start + " "+ (end-1);
            }
            if(end<n)
                current_sum = current_sum + arr[end];
            end = end + 1;
        }
        return "-1";
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();
        int[] arr = {12,20,34,25,30,10,40};
        System.out.println(sumOfSubArray(arr,sum));
    }
}
