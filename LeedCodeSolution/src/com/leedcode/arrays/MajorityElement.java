package com.leedcode.arrays;

import java.util.HashMap;

public class MajorityElement {

	public int majorityElement(int[] nums) {

		int max = 0;
		int majValue = 0;
		HashMap<Integer, Integer> storeValue = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (storeValue.containsKey(nums[i])) {

				storeValue.put(nums[i], storeValue.get(nums[i]) + 1);
			} else {
				storeValue.put(nums[i], 1);
			}

			if (storeValue.get(nums[i]) > majValue) {
				majValue = storeValue.get(nums[i]);
				max = nums[i];
			}

		}

		return max;

	}

}
