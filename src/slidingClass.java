public class slidingClass {
    public static int slidingWindow(int[] arr, int k){
        int max = 0;
        int current = 0;
        int end = k-1;
        for(int i=0; i<k; i++){
            current = current + arr[i];
            max = current;
        }
        for(int i=k; i<arr.length; i++){
            current = current-arr[i-k] + arr[i];
            if(current > max){
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {5,2,-1,6,0,7,3};
        int k = 3;
        System.out.println(slidingWindow(arr,k));
    }
}
