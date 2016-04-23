package ua.org.oa.metalfan0991;

import java.awt.DisplayMode;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StringsTest {
	
public static void main(String[] args) throws IOException {
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~ Task 1 ~~~~~~~~~~");
	BufferedReader br = new BufferedReader(new FileReader("text"));
	String s1 = br.readLine();
	String s2 = br.readLine();
	System.out.println("First string: " + s1);
	System.out.println("Second string: " + s2);
	String result1 = Strings.Task1(s1, s2);
	System.out.println("Output: " + result1);
	
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~ Task 2 ~~~~~~~~~~");
	String s3 = br.readLine();
	System.out.println("Input: " + s3);
	String result2 = Strings.Task2(s3);
	System.out.println("Output: " + result2);
		
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~ Task 3 ~~~~~~~~~~");
	String s4 = br.readLine();
	System.out.println("Input: " + s4);
	String result3 = Strings.Task3(s4);
	System.out.println("Output: " + result3);
	
		
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~ Task 4 ~~~~~~~~~~");
	String s5 = br.readLine();
	System.out.println("Input: " + s5);
	String result4 = Strings.Task4(s5);
	System.out.println("Output: " + result4);
	
		
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~ Task 5 ~~~~~~~~~~");
	String s6 = br.readLine();
	System.out.println("Input: " + s6);
	int result5 = Strings.Task5(s6);
	System.out.println("Output: " + result5);
	
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~ Task 6 ~~~~~~~~~~");
	String s7 = br.readLine();
	System.out.println("Input: " + s7);
	String result6 = Strings.Task6(s7);
	System.out.println("Output: " + result6);
	
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~ Task 7 ~~~~~~~~~~");
	String s8 = br.readLine();
	System.out.println("Input: " + s8);
	int result7 = Strings.Task7(s8);
	System.out.println("Output: " + result7);
	
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~ Task 8 ~~~~~~~~~~");
	String s9 = br.readLine();
	String s10 = br.readLine();
	System.out.println("Input first string: " + s9);
	System.out.println("Input second string: " + s10);
	String result8 = Strings.Task8(s9, s10);
	System.out.println("Output: " + result8);
	
	
		  }
		
}
	
	
	
	
	
	

	

