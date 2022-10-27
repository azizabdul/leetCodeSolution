package com.leetcode.dsasheet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//https://leetcode.com/problems/two-sum/
	public static void main(String[] args) {
		int[] nums = { 2,5,5,11 };
		int target = 10;
		System.out.println(Arrays.toString(twoSum(nums, target)));

	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){

            Integer diff = (Integer)(target - nums[i]);
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff), i};
                return toReturn;
            }

            hash.put(nums[i], i);

        }
        
        return null;

	}

}
