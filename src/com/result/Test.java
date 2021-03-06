package com.result;

import java.util.Set;
import java.util.TreeSet;

import com.model.User;
import com.sorting.SortByName;
import com.sorting.SortByUid;

public class Test {

	public static void main(String[] args) {
		
		// sort by name
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
		
		// sort by uid
		Set<User> uset1=new TreeSet<User>(new SortByUid());
		
		User us1=new User(11, "mandar", "pune");
		User us2=new User(41, "ovee", "chennai");
		User us3=new User(32, "dinesh", "goa");
		User us4=new User(33, "hanumant", "mumbai");
		
		uset1.add(us1);
		uset1.add(us2);
		uset1.add(us3);
		uset1.add(us4);

		System.out.println(uset1);
		
		// sort by name
		Set<User> uset2=new TreeSet<User>(new SortByUid());
		
		User user1=new User(111, "ayush", "pune");
		User user2=new User(412, "jeet", "chennai");
		User user3=new User(332, "eshwar", "goa");
		User user4=new User(622, "laxman", "mumbai");
		
		uset2.add(user1);
		uset2.add(user2);
		uset2.add(user3);
		uset2.add(user4);

		System.out.println(uset2);
	}

}
