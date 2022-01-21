import java.util.Scanner;

public class peekOfMountain {
    public static int get_peek(int[] arr, int n){
        int lower = 0;
        int higher = n-1;
        while (lower<higher){
            int mid =(higher+lower)/2;
            if (arr[mid]<arr[mid+1]){
                lower = mid +1;
            }
            else{
                higher = mid;
            }
        }
        return lower;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(get_peek(arr,n));
    }
}
