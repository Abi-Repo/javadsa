import java.util.Arrays;

public class binarysearch2darray {
    static void main() {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 7;
        int[] result = findingtargetin2darr(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] binarysearch(int[][] matrix, int target, int row, int cstart, int cend){
        while(cstart <= cend){
            int mid = cstart + (cend - cstart)/2;
            if(matrix[row][mid] == target){
                return new int[] {row, mid};
            }
            if(matrix[row][mid] < target ){
                cstart = mid +1;
            }else {
                cend = mid-1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] findingtargetin2darr(int[][] matrix, int target){

        int row = matrix.length;  //4
        int col = matrix[0].length;

        //what if there is only one line 2d array (basically array)
        if(row == 1){
            return binarysearch(matrix, target, 0, 0, col-1);
        }

        //main loop to cut out the major junk
        //running this loop until the row gets -> 2

        int rstart = 0;
        int rend = row-1;
        int cmid = col/2;

        //running this loop till 2 rows are remaining
        while (rstart < (rend -1)){
            int mid = rstart + (rend - rstart)/2;

            if(target == matrix[mid][cmid]){
                return new int[] {mid, cmid};
            }

            if(matrix[mid][cmid] < target){
                rstart = mid;
            }else {
                rend = mid;
            }
        }

        //now we have two rows
        //checking whether the elements are in those two rows

        //checking 1st row
        if(matrix[rstart][cmid] == target){
            return new int[] {rstart, cmid};
        }

        //checking in the 2nd row
        if(matrix[rstart+1][cmid] == target){
            return new int[] {rstart+1, cmid };
        }

        //search in 1st half
        if(target <= matrix[rstart][cmid-1]){
            return binarysearch(matrix, target, rstart, 0, cmid-1);
        }

        //search in 2nd half
        if(target <= matrix[rstart+1][cmid-1] ){
            return binarysearch(matrix, target, rstart+1, 0, cmid-1);
        }

        //search in 3rd half
        if(target >= matrix[rstart][cmid+1] && target <= matrix[rstart][col-1]){
            return binarysearch(matrix, target, rstart, cmid+1, col-1);

        }

        //search in 4th half
        if(target >= matrix[rstart+1][cmid+1]){
            return binarysearch(matrix, target, rstart+1, cmid+1, col-1);
        }

        return new int[] {-1,-1};
    }
}





































