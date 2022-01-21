import java.util.Scanner;

public class sumPair {
    public static void sumPairFind(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum == k){
                System.out.println(start);
                System.out.println(end);
                return;
            }
            else if(sum>k){
                end--;
            }
            else {
                start++;
            }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = input.nextInt();
        }
        sumPairFind(arr,k);
    }
}
