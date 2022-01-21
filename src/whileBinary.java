public class whileBinary {
    public static int binarySearch(int[] arr, int find){
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
            int mid = (first + last)/2;
            if(arr[mid]==find){
                return mid;
            }
            else if(arr[mid]<find){
                first = mid + 1;
            }
            else{
                last = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int find = 11;
        System.out.println(binarySearch(arr,find));
    }
}
