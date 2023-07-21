package com.velocity.project2;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;

public class ArraylistDemo2 {

	public static void main(String[] args) {
             
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("pune");
		list1.add("Nashik");
		list1.add("jalgaon");
		list1.add("Ratnagiri");
		list1.add("Amaravati");
		list1.add("sindhudurg");
		list1.add("mumbai");
		list1.add("Nagpur");
		
	//	Iterator<String> itr=list1.iterator();
	//	while(itr.hasNext()) {
	//		System.out.println(itr.next());
	//	}
	//	System.out.println(list1.size());
	//	System.out.println(list1.contains("Nagpur"));

	   System.out.println(list1);
     	Collections.sort(list1);
	   System.out.println(list1);
	
	}
	
}
