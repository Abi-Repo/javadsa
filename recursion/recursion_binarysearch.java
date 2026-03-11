public class recursion_binarysearch {
    static void main() {
        int[] arr = {1,2,3,5,6,7};
        int target = 2;
        System.out.println(recurssion_binarysearch(arr, target, 0 , arr.length-1));
    }
    static int recurssion_binarysearch(int[] arr, int target, int s, int e){

        int m = s+(e-s)/2;

        if(s > e){
            return -1;
        }

        if(arr[m] == target){
            return m;
        }

        if(target > arr[m]){
            return recurssion_binarysearch(arr, target, m+1, e);
        }

        return recurssion_binarysearch(arr, target, s, m-1);
    }
}