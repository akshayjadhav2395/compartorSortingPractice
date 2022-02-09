package com.sorting;

import java.util.Comparator;

import com.model.User;

public class SortByAddress implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		
		int i=u1.getAddress().compareTo(u2.getAddress());
		
		return i;
	}

}
