package br.edu.bribeiro;

import java.util.ArrayList;
import java.util.List;

public class MaxMinValues {

	private int max = Integer.MIN_VALUE;
	private int min = Integer.MAX_VALUE;

	public List<Integer> checker(List<Integer> list) {

		List<Integer> result = new ArrayList<Integer>();

		for (int number : list) {
			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
		}

		result.add(0, min);
		result.add(1, max);

		return result;

	}

}
