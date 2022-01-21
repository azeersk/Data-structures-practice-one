public class forPrefix {
    public static void prefixSub(int[] arr, int a, int start, int end){
        for(int i=0; i<a; i++){
            int sum = 0;
            for(int j = start; j<end; j++){
                sum = sum + arr[j];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args){
        int[] arr = {5,2,-1,6,-2,7,3};
        int a = 1;
        prefixSub(arr,a,3,5);
    }
}
