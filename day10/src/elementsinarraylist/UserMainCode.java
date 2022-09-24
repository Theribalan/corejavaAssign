package elementsinarraylist;

import java.util.ArrayList;

public class UserMainCode {
	public static int[] arrayListSubtractor(ArrayList<Integer> arraylist,ArrayList<Integer>arrayList2) {
		ArrayList<Integer>first=new ArrayList<Integer>(arraylist);
		first.removeAll(arrayList2);
		ArrayList<Integer>second=new ArrayList<Integer>(arraylist);
		second.removeAll(arraylist);
		first.addAll(second);
		int[] array=new int[first.size()];
		Object[] array1=first.toArray();
		for (int i = 0; i < array1.length; i++) {
			array[i]= (int) array1[i];
		}
		return array;
	}
	

}
