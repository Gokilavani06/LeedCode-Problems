package com.leedcode.arrays;

public class FindMedianSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = nums1.length;
		int j = nums2.length;
		int[] arr = new int[i + j];

		int num1Index = 0;
		int num2Index = 0;
		int currentIndex = 0;

		while (num1Index < i && num2Index < j) {
			if (nums1[num1Index] <= nums2[num2Index]) {
				arr[currentIndex++] = nums1[num1Index++];
			} else {
				arr[currentIndex++] = nums2[num2Index++];
			}
		}

		while (num1Index < i) {
			arr[currentIndex++] = nums1[num1Index++];
		}

		while (num2Index < j) {
			arr[currentIndex++] = nums2[num2Index++];
		}

		int n = arr.length;
		if (n % 2 == 0) {
			int mid1 = arr[n / 2 - 1];
			int mid2 = arr[n / 2];
			return (mid1 + mid2) / 2.0;
		} else {
			return arr[n / 2];
		}
	}

}
