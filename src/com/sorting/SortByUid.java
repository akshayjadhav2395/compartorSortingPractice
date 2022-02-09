package com.sorting;

import java.util.Comparator;

import com.model.User;

public class SortByUid implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {

		
		Integer i1=u1.getUid();
		Integer i2=u2.getUid();
		
		int i=i1.compareTo(i2);
		
		return i;
	}

}
