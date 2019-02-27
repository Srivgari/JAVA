package com.collecttion.www;

import java.util.ArrayList;
// arraylist
public class ArrayListExample {
  
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> l = new ArrayList<Comparable>();
		l.add("A");
		l.add(10);
		l.add("B");
		l.add(null);
		System.out.println(l);
	}
}
