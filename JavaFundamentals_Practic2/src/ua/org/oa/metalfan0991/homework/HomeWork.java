package ua.org.oa.metalfan0991.homework;

import java.util.ArrayList;
import java.util.Scanner;



public class HomeWork {

	/**
	 *����������� ��������� ����� �������������� ����������� �� ���������� ������. ���� 
������ ����������� � �������. ������� ������ ���� ������� ������ �������� ������, 
����� �������� ����������� ��� ������� �����. ���������� ���� � ������ ��������� 
������ ���������� �������������.  �������� ������� � ArrayList. ��� ����� �����������
�������� ������������ �������� ������, ���� ������ ������� �� ��������� - ��������� 
���� ��������. ����� �������� ������ ������� �������������� �����������,  ���� 
����� ���� ������������ ����������� � ����������� � ��������� �� ��������.
	 */
	public static void main(String[] args) {
		
		 System.out.println ("������� �����");
		   Scanner scan = new Scanner(System.in); //������������ ���� � ������
		      int days = 0;
		      int sum = 0;
		      double average = 0;
		      int min = 0;
		      int max = 0;
		      
		      String s11 = scan.nextLine();
		         
		      String [] month31 = {"������","����","���","����","��������","������"}; // ������ ������� � ����������� ���� 31
		         
		      String [] month30 = {"������","����","������","�������","�������"};  // ������ ������� � ����������� ���� 30
		         
		      String month28  = "�������"; // ������ ������� � ����������� ���� 28
		         
		         for ( String a: month31){
		        	
		          if (s11.equals(a)){
		        	  days = 31;
		           System.out.println(a + " ������� �� " + days + " ����." );
		          }
		         }
		         for ( String b: month30){
		           if (s11.equals(b)){
		        	   days = 30;
		            System.out.println(b + " ������� �� " + days + " ����." );
		           }
		         }
		         if (s11.equals(month28)) {
		             days=28;
		             System.out.println(month28 + " ������� �� " + days + " ����." );
		            }
		         
		         int[] temp = new int[days];
		         for (int i = 0; i < days; i++){
		        	 System.out.println("������� ����������� ������� " + (i+1) + " �����."); 
		        	 temp [i] = scan.nextInt();
		        	 System.out.println("����� " + s11 + ".");
		        	 }
		         
		         for (int i = 0; i < days; i++){		         
		        	 
		        	 sum += temp[i];
		        	 
		         }
		         average =  (sum/days); // ������� �������������� �����������
	        	 System.out.printf("������� �����������: %.2f", average);
	        	 System.out.println();
	        	 
	        	 for (int i = 0; i < temp.length; ++i){		         
		        	 
		        	 min = Math.min(min,temp[i]); // ������� ����������� �����������
		        	 max = Math.max(max,temp[i]); // ������� ������������ �����������
	        	 }
	        	  
	              for (int i = 0; i<temp.length; i++){
	                  if (min == temp[i]) { 
	                   System.out.println("����������� ����������� ���� ��(�) "+ (i+1) + " ����" + " � ��������� " + min + " �������� �� �������.");
	                  }
	                  if (max == temp[i]) {
	                    System.out.println("������������ ����������� ���� ��(�) "+ (i+1) + " ����" + " � ��������� " + max + " �������� �� �������.");
	                   }
	                 }        
		         
	}
}
