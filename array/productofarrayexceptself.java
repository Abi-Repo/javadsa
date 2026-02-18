//import java.util.Arrays;
//
//public class productofarrayexceptself {
//    static void main() {
//        int[] nums = {1,2,3,4};
//        int[] result = productofarrexceptself(nums);
//        System.out.println(Arrays.toString(result));
//    }
//    static int[] productofarrexceptself(int[] nums){
//
//        int[] res = new int[nums.length];
//
//        //left prodcuts
//        res[0] = 1;
//        for (int i = 1; i < nums.length; i++) {
//            res[i] = res[i-1] * nums[i-1];
//        }
//
//        //right products
//        int rgt = 1;
//        for (int i = nums.length-1; i >= 0; i--) {
//            res[i] = res[i]*rgt;
//            rgt *= nums[i];
//        }
//        return res;
//    }
//}


import java.util.Arrays;

public class productofarrayexceptself {
    static void main() {
        int[] nums = {1,2,3,4};
        int[] result = productarrexceptself(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] productarrexceptself(int[] nums){

        int n = nums.length;
        int[] res = new int[nums.length];

        res[0] = 1;
        for(int i=1; i<n; i++){
            res[i] = res[i-1]*nums[i-1];
        }

        int rgt = 1;
        for (int i = n-1; i >= 0  ; i--) {
            res[i] = rgt*res[i];
            rgt = rgt*nums[i];
        }

        return res;
    }
}















