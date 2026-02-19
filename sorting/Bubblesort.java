import java.util.Arrays;

public class Bubblesort {
    static void main() {
        int[] arr = {3,1,5,4,2};
        int[] result = bubblesort(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] bubblesort(int[] arr){


        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length - i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
