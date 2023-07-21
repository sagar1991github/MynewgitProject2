package com.velocity.project2;

import java.util.HashMap;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {
     
		HashMap<Integer ,String> map= new HashMap<>();
        map.put(1,"Pune");
        map.put(2, "Mumabai");
        map.put(3,"Nashik");
        
        
        Set<Integer>keyset =map.keySet();
        for(Integer i:keyset) {
        	System.out.println("KEY="+i);
        	System.out.println("Value="+map.get(i));
        }
		
		
	}

}
