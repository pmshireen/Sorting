import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {66,0,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void  insertionSort(int[] arr) {
        for(int i = 0;i < arr.length - 1 ;i++) {
            for(int j= i+1;j>0;j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}