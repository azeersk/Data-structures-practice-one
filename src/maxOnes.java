import java.util.Arrays;

public class maxOnes {
    public static void maximumOnes(int[] arr){
        int len = arr.length;
        int[] newArr = new int[len-1];
        int count = 0;
        for(int i=0; i<len; i++){
            if(arr[i]==1){
                count++;
            }
            else {
                newArr[i] = count;
                count = 0;
            }
        }
        System.out.println(Arrays.stream(newArr).max().getAsInt());
    }


    public static void main(String[] args){
        int[] array = {1,0,1,1,1,1,0,1,1};
        maximumOnes(array);
    }
}