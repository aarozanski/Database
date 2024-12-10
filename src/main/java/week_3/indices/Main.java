package week_3.indices;

import java.util.HashMap;

public class Main {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int val = nums[i];
            // target == val + complement
            int complement = target-val;
            System.out.println("val: " + val + " index: " + i + " complement: "+ complement);
            if(complements.containsKey(complement)){
                return new int[]{complements.get(complement), i};
            }
            complements.put(val,i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        //            0,1,2,3
        int[] nums = {5,8,3,9};
        int t  =13;
        int[] indices = twoSum(nums,t); // 0,1
        System.out.println("Indices: " + indices[0] + ", " + indices[1]);
        indices = twoSum(nums, 12); // 2,3
        System.out.println("Indices: " + indices[0] + ", " + indices[1]);
    }
}
