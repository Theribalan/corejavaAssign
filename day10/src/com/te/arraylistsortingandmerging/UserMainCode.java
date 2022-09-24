package com.te.arraylistsortingandmerging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMainCode {
	public static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> list, ArrayList<Integer> list2) {

		list.addAll(list2);
		Collections.sort(list);

		return list;

	}

}
