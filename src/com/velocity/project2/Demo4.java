package com.velocity.project2;

import java.util.ArrayList;

public class Demo4 {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(10,"sagar","IT"));
		emplist.add(new Employee(20,"Mayur","ADMIN"));
		emplist.add(new Employee(30,"Samarth","service"));
		emplist.add(new Employee(40,"sSajjan","Management"));
		emplist.add(new Employee(50,"Sakshi","Analist"));
		
		for (Employee emp : emplist) {
			System.out.println(emp);
		}

	}

}
