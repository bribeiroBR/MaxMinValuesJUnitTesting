package br.edu.bribeiro;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AddressTest {

	@Test
	public void ascOrder() {
		MaxMinValues maxMinValues = new MaxMinValues();

		List<Integer> myList = new ArrayList<Integer>();
		int number1 = 1;
		int number2 = 2;
		int number3 = 3;

		myList.add(0, number1);
		myList.add(1, number2);
		myList.add(2, number3);

		assertTrue(maxMinValues.checker(myList).get(0) == 1);
		assertTrue(maxMinValues.checker(myList).get(1) == 3);
	}

	@Test
	public void descOrder() {
		MaxMinValues maxMinValues = new MaxMinValues();

		List<Integer> myList = new ArrayList<Integer>();
		int number1 = 3;
		int number2 = 2;
		int number3 = 1;

		myList.add(0, number1);
		myList.add(1, number2);
		myList.add(2, number3);

		assertTrue(maxMinValues.checker(myList).get(0) == 1);
		assertTrue(maxMinValues.checker(myList).get(1) == 3);
	}

	@Test
	public void randomOrder() {
		MaxMinValues maxMinValues = new MaxMinValues();

		List<Integer> myList = new ArrayList<Integer>();
		int number1 = 3;
		int number2 = 1;
		int number3 = 2;

		myList.add(0, number1);
		myList.add(1, number2);
		myList.add(2, number3);

		assertTrue(maxMinValues.checker(myList).get(0) == 1);
		assertTrue(maxMinValues.checker(myList).get(1) == 3);
	}

	@Test
	public void minEqual() {
		MaxMinValues maxMinValues = new MaxMinValues();

		List<Integer> myList = new ArrayList<Integer>();
		int number1 = 1;
		int number2 = 1;
		int number3 = 3;

		myList.add(0, number1);
		myList.add(1, number2);
		myList.add(2, number3);

		assertTrue(maxMinValues.checker(myList).get(0) == 1);
		assertTrue(maxMinValues.checker(myList).get(1) == 3);
	}

	@Test
	public void maxEqual() {
		MaxMinValues maxMinValues = new MaxMinValues();

		List<Integer> myList = new ArrayList<Integer>();
		int number1 = 1;
		int number2 = 3;
		int number3 = 3;

		myList.add(0, number1);
		myList.add(1, number2);
		myList.add(2, number3);

		assertTrue(maxMinValues.checker(myList).get(0) == 1);
		assertTrue(maxMinValues.checker(myList).get(1) == 3);
	}

}
