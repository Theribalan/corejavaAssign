package elementsinarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer>arrayList=new ArrayList<Integer>();
		ArrayList<Integer>arrayList1=new ArrayList<Integer>();
		System.out.println("Enter the size of first array size");
		Integer size1=scanner.nextInt();
		System.out.println("Enter the values of first arraylist:");
		for (int i = 0; i < size1; i++) {
			arrayList.add(scanner.nextInt());
		}
		System.out.println("Enter the size of second array:");
		Integer size2=scanner.nextInt();
		System.out.println("Enter the size of second arrarlist:");
		for (int i = 0; i < size2; i++) {
			arrayList1.add(scanner.nextInt());
		}
		int[] array=UserMainCode.arrayListSubtractor(arrayList,arrayList1);
		Arrays.sort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
