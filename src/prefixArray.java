public class prefixArray {
    public static int prefixOf(int[] arr, int start, int end){
        int len = arr.length;
        int[] sumArr = new int[len];
        sumArr[0] = arr[0];
        for(int i=1; i< arr.length; i++){
            sumArr[i] = arr[i] + sumArr[i-1];
            System.out.println(sumArr[i]);
        }
        int sum = sumArr[end] - sumArr[start-1];
        return sum;
    }
    public static void main(String[] args){
        int start = 2;
        int end = 5;
        int[] arr = {12,10,3,24,20,32,7,18};
        System.out.println(prefixOf(arr,start,end));
    }
}
