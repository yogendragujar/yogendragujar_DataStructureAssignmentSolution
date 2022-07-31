package com.questionone.skyscraper.main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

import com.questionone.skyscraper.util.DataStaging;
import com.questionone.skyscraper.util.PrepareFloorConstructionPlan;

public class FloorSizeMain {
	static Scanner input = new Scanner(System.in);
	static int[] arrOfFloors;
	
	public static void main(String [] args) {
		System.out.println("Enter the total number of floors in the building");
		int numOfFloors = input.nextInt();		//get size
		
		DataStaging construct = new DataStaging();
		arrOfFloors = construct.insertValues(numOfFloors);
		System.out.println(Arrays.toString(arrOfFloors));
		Stack<Integer> stackOfFloors = new Stack<Integer>();
		stackOfFloors = construct.getStack(arrOfFloors);

		PrepareFloorConstructionPlan.displayPlan(arrOfFloors, stackOfFloors);
	}
}
