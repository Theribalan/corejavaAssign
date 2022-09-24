package com.te.differencebetweenlargestandsmallest;

public class UserMainCode {
	public static int getBigDif(int[] array) {
		int largest = array[0];
		int smallest = array[0];

		for (int i = 0; i < array.length; i++) {
			//System.out.println(array[i]);

			if (array[i] > largest) {
				largest = array[i];
			} 
			
		}
			for (int i = 0; i < array.length; i++) {
				//System.out.println(array[i]);

				if (array[i]< smallest) {
					smallest = array[i];
				} 	

		}
		//System.out.println("largest:" + largest);
		//System.out.println("smallest:" + smallest);
		return largest - smallest;
	
	}
}
