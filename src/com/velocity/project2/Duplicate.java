package com.velocity.project2;

public class Duplicate {

  
	public static void main(String[] args) {
       String s2=new String("Great Resposibily");
	     int count=0;
	     char[]ch= s2.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j< ch.length;j++) {
				if(ch[i]==ch[j]) {
		    System.out.println("Duplicate Character in a given String="+ch[j]);
					count++;
				
				}
			}
		
		}	
			
          System.out.println("Duplicate Characters Count="+count);			    
			}
			
		
	
}




