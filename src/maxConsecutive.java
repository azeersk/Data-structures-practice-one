import java.util.Scanner;
import java.util.Arrays;

public class maxConsecutive {
    public static int Max_Ones(int[] A, int n){
        int[] arr = new int[n];
        int count = 0;
        for(int i=0; i<n; i++){
            if(A[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            arr[i] = count;
        }
        int maxi = Arrays.stream(arr).max().getAsInt();
        return maxi;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = input.nextInt();
        }
        System.out.println(Max_Ones(A,n));
    }
}
