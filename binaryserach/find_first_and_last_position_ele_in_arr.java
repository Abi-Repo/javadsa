import java.util.Arrays;

//leetcode 34
public class find_first_and_last_position_ele_in_arr {
    static void main() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(findfirstandlast(nums, target)));
    }
    static int[] findfirstandlast(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int ans1 = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                ans1 = mid;
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        int one = 0;
        int two = arr.length-1;
        int ans2 = -1;

        while(one <= two){
            int mid = one + (two - one)/2;

            if(target < arr[mid]){
                two = mid-1;
            } else if (target > arr[mid]) {
                one = mid+1;
            }else{
                ans2= mid;
                two = mid-1;
            }
        }
        return new int[] {ans2, ans1};
    }
}
