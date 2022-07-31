package com.questionone.skyscraper.util;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class DataStaging {
	static Scanner input = new Scanner(System.in);
	
	public static int[] insertValues(int totalNumOfFloors){
		int [] arrOfFloorSizes = new int[totalNumOfFloors];
		for(int i=0;i<totalNumOfFloors;i++) {
			System.out.println("Enter the floor size given on day: "+(i+1));
			int inputNum = input.nextInt();
			if(inputNum <=0) {
				System.out.println("The value cannot be less than or equal to zero");
				i--;
			}else {
				arrOfFloorSizes[i] = inputNum;
			}
			
			
		}
		input.close();
		return arrOfFloorSizes;
	}
	
	public static Stack<Integer> getStack(int [] arrOfFloorSizes) {
		Set<Integer> floorSet = new TreeSet<Integer>();
		Stack<Integer> stackFromSet = new Stack<Integer>();
		for(int num:arrOfFloorSizes) {
			floorSet.add(num);
		}
		
		for(int num:floorSet) {
//			System.out.println("adding "+num);
			stackFromSet.push(num);
		}
		return stackFromSet;
	}
	
}
