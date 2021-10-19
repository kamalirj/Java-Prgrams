package com.mproject.kamali;

public class Library {

	static String libraryName;
	static int fees; //=2000;
	String readerName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library reader = new Library();
		//reader.fees=1500;
		reader.readerName="Kamali";
		System.out.println("Reader Name : "+ reader.readerName + " "+ reader.fees + " " + reader.fees);
	}

}
