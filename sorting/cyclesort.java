import java.util.Arrays;

public class cyclesort {
    static void main() {
        int[] arr = {3,5,2,1,4};
        int[] result = cyclesorting(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] cyclesorting(int[] arr){

        int i =0;
        while(i < arr.length){
            int correctindex = arr[i]-1;
            if(arr[i] != arr[correctindex] ){
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            }else{
                i++;
            }
        }
        return arr;
    }
}
