package ua.org.oa.metalfan0991;


	
	import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.ListIterator;
	import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

	/**
	 * 
	 *������� java  �����, �������������� ����� �������� ������ ������� � ��������������� ��������� �����������:
	1. ������ �����, ����, ����� ������ ����� ��������, ���������� ��� ���� � �����������, ����������� �� ��������������.
	2. �� ����� ����������� ��������� ������ ���� ������������ ���������� �� java code convention.
	3. ��� ������� �������� ������ ����� ������������ ���������� ���� String, ���������� �� ����� 5 ����� ������ (>400 ��������), ��������� ������� �� 3 �����������. ������������� (����������������, �� �� �������) - ������� ����� �� ����� �� ������� �����.
	4. �����! ������� ����� ���� ������ ����������� ���������. ���������� ������� 2 ������� ������� ������������ ������.
	5. �������������� ������������ �������, ������������������ ������������ ������� ������ ������ ��������.
	6. ��� ������ � ������� ��������� �����/������ ������ ����� ������ ua.org.oa.<Jira Login>.
	7. �������������� ����� � SVN ����������� ��� ���������� ����������� ������� ����������� �� ������ http://oracle-academy.org.ua/svn/<��� �������>/<Jira login>
	����� � ������� �� �����, ������� ��� ����������� � ������ ������ �����, ������� ����������� � ���.
	 *
	 */

	public class SearchWordVersion2 {
		 

		public static void main(String[] args) throws FileNotFoundException 
		    {
			 	
			 
			 String fulltext = "";
			 Scanner in = new Scanner (new File("D:\\Java_Fundamentals_Home3_text.txt") );   //���� �� ����������
			
			 while(in.hasNext())
			 fulltext += in.nextLine() + "\r\n";				//���������� � fulltext
			 in.close();
			 
			    
		        String[] words = fulltext.split(" ");			// � ������ �������� �� ������ ��� ����� ���������� ��������
		        Object[] wordsdistinct = unique(words);			// � ������ �������� �� ������ ������ ���������� �����, �.�. �� ����� ������� ����������� �������!!!
		        int i;
		        for(Object distword : wordsdistinct)
		        {
		            i = 0;
		            for(String oneword: words)
		                if(oneword.equals(distword))
		                    i++;
		            System.out.println("�����:\"" + distword + "\" ����������� " + i + " ���(�)");
		        }
		    }
		    
		    private static Object[] unique(String[] arrayName)
		    {
		        ArrayList distinct = new ArrayList ();
		        for(int i = 0; i < arrayName.length; i++ )
		        {
		            if(!distinct.contains(arrayName[i]))
		                distinct.add(arrayName[i]);
		        }
		        return distinct.toArray();
		    } 
		}



