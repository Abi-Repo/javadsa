import java.util.Arrays;

public class binarysearch2d_arr {
    static void main() {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 37;
        int[] result = binarysearch2darr(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] binarysearch2darr(int[][] arr, int target){

        int row = 0;
        int column = arr.length-1;

        while(row < arr.length && column >=0){
            if(target == arr[row][column]){
                return new int[] {row, column};
            } else if (target < arr[row][column]) {
                column--;
            }else {
                row++;
            }
        }
        return new int[] {-1};
    }
}
