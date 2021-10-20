package com.collection;

import java.util.ArrayList;

public class CollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList al = new ArrayList();
			al.add("Kamali");
			al.add("Sathish");
			al.add(true);
			al.add(5.1f);
			al.add("Sriram");
			al.add("Kamali");
			System.out.println(al);
			System.out.println(al.contains("Sathi"));
			System.out.println(al.get(1));
			System.out.println(al.lastIndexOf("Kamali"));
			System.out.println(al.indexOf("Kamali"));
			System.out.println(al.remove(3));
			ArrayList al2= new ArrayList();
			al2.addAll(al);
			al2.add("Krish");
			al2.add("JayaMeena");
			System.out.println("al2 contailns al ->"+ al2);
			
			ArrayList al3 = new ArrayList();
			al3.addAll(al2);
			System.out.println("al3 contains all->"+ al3);
			
			ArrayList al4 = new ArrayList();
			al4.addAll(al2);
			al4.clone();
			System.out.println(al4.containsAll(al));
			System.out.println(al4.isEmpty());
			
			ArrayList al5 = new ArrayList();
			al5.add(al);
			System.out.println("al5 contains ->"+ al5.addAll(0, al));
			//System.out.println("al5 contains al-> "+al5);
			
	}

}
