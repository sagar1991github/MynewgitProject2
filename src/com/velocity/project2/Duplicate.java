package com.velocity.project2;

public class Duplicate {

	public static void main(String[] args) {
		String s1= new String("Great Responsibility");
		int count=0;
		char []ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
          for(int j=i+1;j<ch.length;j++) {
        	  if(ch[i]==ch[j]) {
        		  System.out.println("Duplicate Character in a Given String="+ch[j]);
        	   count++;
        	  }
          }
          }
		System.out.println("Duplicate Character count="+count);
		

	}
}
