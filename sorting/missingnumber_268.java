
//leetcode 268

import java.util.Arrays;

public class missingnumber_268 {
    static void main() {
        int[] nums = {1,0};
        int result = missingnumber(nums);
        System.out.println(result);
    }
    static int missingnumber(int[] nums){

        int missingnum = 0;
        int i =0;
        while(i < nums.length) {

            if (nums[i] == nums.length) {
                i++;
            } else {
                int correctindex = nums[i];
                if (nums[correctindex] != nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[correctindex];
                    nums[correctindex] = temp;
                } else {
                    i++;
                }
            }
        }
        for(int j=0; j<nums.length; j++){
            if(j != nums[j]){
                missingnum = j;
                return missingnum;
            }else{
                missingnum = nums.length;
            }
        }

        return missingnum;
    }
}
