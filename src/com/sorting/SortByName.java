package com.sorting;

import java.util.Comparator;

import com.model.User;

public class SortByName implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		
		int i=u1.getUname().compareTo(u2.getUname());
		
		return i;
	}

}
