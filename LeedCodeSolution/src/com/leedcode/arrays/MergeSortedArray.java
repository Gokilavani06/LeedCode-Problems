package com.leedcode.arrays;

import java.util.Arrays;

public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int j = 0;

		for (int i = 0; i < m + n; i++) {
			if (j < n) {
				if (nums1[i] == 0 && i > m - 1) {
					nums1[i] = nums2[j];
					j++;

				} else if (nums1[i] >= nums2[j]) {
					int temp = nums2[j];
					nums2[j] = nums1[i];
					nums1[i] = temp;
					Arrays.sort(nums2);

				}

			}

		}
	}

}
