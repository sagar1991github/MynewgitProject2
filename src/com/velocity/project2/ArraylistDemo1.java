package com.velocity.project2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(40);
		al2.add(50);
		al2.add(60);
		
		al.addAll(al2);
		//System.out.println(al);
	//	for(int d : al) {
	//		System.out.println(d);
	//	}
		//using Iterator
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
