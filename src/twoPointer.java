public class twoPointer {
    public static String twoPointerMethod(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int sum = arr[start] + arr[end];
            if (sum == x){
                return (start+ " + "+ end);
            }
            else if(sum>x){
                end = end - 1;
            }
            else{
                start = start + 1;
            }
        }
        return "Not found!!";
    }
    public static void main(String[] args){
        int[] arr = {12,23,34,45,56,67,78,89,90};
        int x = 68;
        System.out.println(twoPointerMethod(arr,x));
    }
}
