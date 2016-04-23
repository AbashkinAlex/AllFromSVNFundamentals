package ua.org.oa.metalfan0991;

import java.util.ArrayList;
import java.util.Scanner;

public class Strings {
	private Strings(){
	}
	

//  1. ������ 2 ������������ ������. �� ���� ����� ������� ����
//     ������������ ��� ������ �������� � ������ �� �����. 
public static String Task1(String s1,String s2) {
	return s1.substring(1).concat(s2.substring(1));
	
}

//	2. ������ ������ � �������� ����������� ��������. �������� ������,
//	   ��������� �� 3-� ��������, ��������: �Candy� -> �and�, �solving� -> �lvi�.

	public static String Task2(String s3) { 
		if (s3.length()%2 != 0){
		return  s3.substring((s3.length()/2)-1,(s3.length()/2)+2);
		
		} else {
			return " ��� ������ �����! ";
		}
		
	
}

//	3. ������ ������ ������������� �������. �������� �� ���� ������ �����,
//	   � ������� 2 ��������� ������� �������� ������ ���������� � ������.

	public static String Task3(String s4) {
	 
	return s4.substring((s4.length()-2)).concat(s4.substring(0, s4.length()-2));
	 
}

//	4. �� �������� ������ ��������� �����, � ������� ������ �������� ������ 
//	   ����������� �����, �������� �Candy� -> �CCaannddyy�.


	public static String Task4(String s5) {
	char [] b = s5.toCharArray();
	StringBuilder sb = new StringBuilder();
     for(char ch : b){
    	 sb.append(ch).append(ch);
     }
     return sb.toString();
     
	  
}

// 5. ������� ��� ��������� ������ "b*b" (* - ����� ������) � �������� ������ 
//    ��� ������������� ���������� ���������, �������� �bob is bab� -> 2 .

	public static int Task5(String s6) {
	 
	   int count = 0;
	   char [] b = new char [s6.length()];
	 
	   for (int i = 0; i < s6.length(); i++) {
	     b[i] = s6.charAt(i);
	     
	   }
	    
	    for (int j =0; j < s6.length()-2; j++){
	        if ((b[j]=='b') && (b[j+2]=='b')){
	            count++;
	        }
	    }
	  return count;
}
	
//6. �������� ��������� �� �������� ������, ��� � ������ �����, ���������� 
//	������ �*� ������� �������� ����� � ������ �������, �������� �th*is is sum*mer� -> �ts is suer�.

	public static String Task6(String s7) {
					
		 int count;
		 
		 for (int i = 0; i < s7.length(); i++)
		 {
		  if (s7.charAt(i) == '*')
		  {
		   count = i;
		   s7 = s7.substring(0, count-1) + s7.substring(count+2);
		  }
		 }
		  return s7;
	}
	
//7.  � �������� ������ ����������� ���������� ����, ��������������� �� �a�
//	  ��� �s�, ��� ����� �������� ��������.
	
	public static int Task7(String s8) {
					 
			 int countA = 0;
			 int countS = 0;
			 		 
			 {
			  s8 = s8.toLowerCase();
			  for (int i = 0; i < s8.length(); i++)
			  {
			   if(s8.charAt(i) == ' ')
			   {
			    if (s8.charAt(i-1) == 'a')
			     countA++;
			    if (s8.charAt(i-1) == 's')
			     countS++;
			   }   
			  }
			  			  
			  return (countA + countS);
			 }
		
	   }
//8.  ������ ��� ������. �������� ����� ������, ��������� �� ������ ������, 
//	  � ������� ������� ��� ��������� ������ ������.	 
		 
	public static String Task8(String s9, String s10) {
		 		 
		  String result = s9.replaceAll(s10, "");
		  			  
		  return result;
		 }
		
  }
	
	
	
	
	


	 


