public class Split_array_largest_sum {
    static void main() {

        int[] nums = {7,2,5,10,8};
        int k = 2;

        int result = splitarraylargestsum(nums, k);
        System.out.println(result);
    }
    static int splitarraylargestsum(int[] nums, int k){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        //now i'm applying the binary search
        while(start < end){
            int mid = start + (end -start)/2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums){
                if (sum+num >  mid){
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }
            if(pieces <= k){
                end = mid;
            }else {
                start = mid+1;
            }

        }
        return end;
    }
}
