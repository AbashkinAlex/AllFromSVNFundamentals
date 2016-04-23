package ua.org.oa.metalfan0991;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * 
 *������� java �����, �������������� ����� �������� ������ ������� � ��������������� ��������� �����������:
1. ������ �����, ����, �����  ������ ����� ��������, ���������� ��� ���� � �����������, ����������� �� ��������������.
2. �� ����� ����������� ��������� ������ ���� ������������ ���������� �� java code convention.
3. ��� ������� �������� ������ ����� ������������ ���������� ���� String, ���������� �� ����� 5 ����� ������ (>400 ��������), ��������� ������� �� 3 �����������. ������������� (����������������, �� �� �������) - ������� ����� �� ����� �� ������� �����.
4. �����! ������� ����� ���� ������ ����������� ���������. ���������� ������� 2 ������� ������� ������������ ������.
5. �������������� ������������ �������, ������������������ ������������ ������� ������ ������ ��������.
6. ��� ������ � ������� ��������� �����/������ ������ ����� ������ ua.org.oa.<Jira Login>.
7. �������������� ����� � SVN ����������� ��� ���������� ����������� ������� ����������� �� ������ http://oracle-academy.org.ua/svn/<��� �������>/<Jira login>
����� � ������� �� �����, ������� ��� ����������� � ������ ������ �����, ������� ����������� � ���.
 *
 */

public class SearchWordVersion1 {
	 public static void main(String[] args) 
	    {
		 
		    String fulltext = "Romeo and  Juliet is one of a group of lyrical plays usually dated at 1594-95. The earliest date that has been proposed for first performance of Romeo and Juliet is 1591. The play might have begun in about 1591, then laid aside, and only completed a year or two later. The allusions to Daniel and Eliot indicate 1953 as the earliest possible date for Romeo and Juliet, the Bad Quatro makes 1596 the latest.";
	        String[] words = fulltext.split(" ");			// � ������ �������� �� ������ ��� ����� ���������� ��������
	        Object[] wordsdistinct=unique(words);			// � ������ �������� �� ������ ������ ���������� �����, �.�. �� ����� ������� ����������� �������!!!
	        int i;
	        for(Object distword: wordsdistinct)				// ���� ���������� ��� ���������� ����� �� ������� wordsdistinct , ���������� �� � i � ������� ������� Object distword
	        {
	            i = 0;
	            for(String oneword : words)					// ���� 
	                if(oneword.equals(distword))			// ����� ����� �����������, �� i �������������
	                    i++;
	            System.out.println("�����:\"" + distword + "\" ����������� " + i + " ���(�)");
	        }
	    }
	    
	    private static Object[] unique(String[] arrayName) // ����� �� ���������� ���������� ����
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
