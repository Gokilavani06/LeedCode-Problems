package com.leedcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTraingleTwo {

	public List<Integer> getRow(int rowIndex) {

		List<Integer> previousArray = new ArrayList<>();
		previousArray = List.of(1);
		for (int i = 1; i <= rowIndex; i++) {
			List<Integer> value = new ArrayList<>();

			for (int j = 0; j <= i; j++) {
				if (j == 0 || j <= i) {

					if (j == 0) {
						value.add(previousArray.get(j));

					} else if (j == i) {
						value.add(previousArray.get(j - 1));
					} else {
						value.add(previousArray.get(j - 1) + previousArray.get(j));
					}

				}

			}

			previousArray = value;

		}
		return previousArray;
	}
}
