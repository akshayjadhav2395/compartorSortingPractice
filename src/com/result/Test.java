package com.result;

import java.util.Set;
import java.util.TreeSet;

import com.model.User;
import com.sorting.SortByName;

public class Test {

	public static void main(String[] args) {
		
		Set<User> uset=new TreeSet<User>(new SortByName());
		
		User u1=new User(1, "akshay", "pune");
		User u2=new User(4, "shivani", "chennai");
		User u3=new User(2, "john", "goa");
		User u4=new User(3, "unmukt", "mumbai");
		
		uset.add(u1);
		uset.add(u2);
		uset.add(u3);
		uset.add(u4);
		
		System.out.println(uset);

	}

}
