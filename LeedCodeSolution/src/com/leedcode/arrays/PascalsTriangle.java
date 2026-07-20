package com.leedcode.arrays;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
       

		List<List<Integer>> result = new ArrayList<>();
		result.add(List.of(1));
		for (int i = 1; i < numRows; i++) {
			List<Integer> value = new ArrayList<>();

			for (int j = 0; j <= i; j++) {
				if (j == 0 || j <= i) {
					List<Integer> previousArray = result.get(i - 1);

					if (j == 0) {
						value.add(previousArray.get(j));

					} else if (j == i) {
						value.add(previousArray.get(j - 1));
					} else {
						value.add(previousArray.get(j - 1) + previousArray.get(j));
					}

				}

			}

			result.add(value);

		}

		return result;
 
    }
}