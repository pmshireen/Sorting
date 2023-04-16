import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
           int[] arr ={-1,8,-32,9,0};
           bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped = false;
        for(int i=0;i<arr.length-1;i++){
            //for each step the largest element will come at respective index
            for(int j=1;j<arr.length-i;j++){  //or can be witten as j<=arr.length-i-1
            // swap if the element is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;// for any particular value ,if swap does not occur ,then the array is sorted
            }
        }

    }
}