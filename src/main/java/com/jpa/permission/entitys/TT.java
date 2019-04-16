package com.jpa.permission.entitys;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

public class TT {
	
	@OneToMany
	@ManyToMany
	private static void reverseString1(String str) {
		 
		char[] chr = str.toCharArray();
		
//		InputStream
		
		for (int i = chr.length-1 ; i >= 0; i--) {
//			System.out.print(chr.length-1);
//			System.out.print(i);
			System.out.print(chr[i]);
		}
		
		System.out.println("\t");
 
	}
	
	public static void main(String[] args) {
		reverseString1("这是一条消息");
	}
}
