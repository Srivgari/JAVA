package com.collecttion.www;

import java.util.ArrayList;

public class ArrayListExample {
  
	public static void main(String[] args) {
		
		ArrayList<Comparable> l = new ArrayList<Comparable>();
		l.add("A");
		l.add(10);
		l.add("B");
		l.add(null);
		System.out.println(l);
	}
}
