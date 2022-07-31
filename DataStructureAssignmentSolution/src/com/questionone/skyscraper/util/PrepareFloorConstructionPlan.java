package com.questionone.skyscraper.util;

import java.util.LinkedList;
import java.util.Stack;

public class PrepareFloorConstructionPlan {
	public static int[] arrInputFloorSize;
	public static Stack<Integer> floorStack;
	public static boolean flag=true;
	public static LinkedList<Integer> tempList = new LinkedList<Integer>();
	
	public static void displayPlan(int[] arrInputSize, Stack<Integer> flrStack) {
		arrInputFloorSize = arrInputSize;
		floorStack = flrStack;
		System.out.println("The order of construction is as follows");
		//Iterating through the array
		for(int intCounter=0;intCounter<arrInputFloorSize.length;intCounter++) {
			if(arrInputFloorSize[intCounter] == floorStack.peek()) {
				System.out.println("\nDay: "+(intCounter+1));
				System.out.print(floorStack.pop()+" "); 
				
				if(tempList.size()>0) {
					//check if the Top Of Stack (TOS) is present in tempList.
					flag = true;
					getPlan();
				}
			}else {
				System.out.println("\nDay: "+(intCounter+1));
				tempList.add(arrInputFloorSize[intCounter]);
			}
		}
		
//		System.out.println("TempList size after end of loop "+tempList.size());
		//Validating if the templist is empty if not then stack has some elements pop it.
		if(tempList.size()>0) {
			flag = true;
			getPlan();
		}
	}
	
	static boolean checkInList(int element, LinkedList<Integer> pendingNumList) {
		boolean found = false;
		found = pendingNumList.contains(element);
		return found;
	}
	
	static void getPlan() {			
		while(floorStack.size()>0 && flag) {
			if(checkInList(floorStack.peek(), tempList)) {
				int elementToRemove = floorStack.pop();
				System.out.print(elementToRemove+" "); //remove from TOS
				int intPosition = tempList.indexOf(elementToRemove);
				tempList.remove(intPosition);
			}else {
				flag = false;
			}
		}
	}
}
