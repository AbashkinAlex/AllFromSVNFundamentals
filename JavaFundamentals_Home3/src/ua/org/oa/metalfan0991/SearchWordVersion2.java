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
	 *—оздать java  класс, обрабатывающий текст согласно вашему заданию и удовлетвор€ющий следующим требовани€м:
	1.  аждый класс, поле, метод должен иметь название, отражающее его суть и комментарии, описывающие их предназначение.
	2. Ќа этапе составлени€ программы должны быть использованы соглашени€ из java code convention.
	3. ƒл€ задани€ входного текста можно использовать переменную типа String, содержащую не менее 5 строк текста (>400 символов), разбитого минимум на 3 предложени€. јльтернативно (предпочтительнее, но по желанию) - считать текст из файла на жестком диске.
	4. ¬ажно! «адани€ могут быть решены несколькими способами. ѕредложите минимум 2 способа решени€ поставленной задачи.
	5. ѕротестировать предложенное решение, продемонстрировать корректность решени€ задачи каждым способом.
	6. »м€ пакета в котором создаетс€ класс/классы должно иметь формат ua.org.oa.<Jira Login>.
	7. »ндивидуальна€ папка в SVN репозатарии дл€ сохранени€ выполненных заданий расположена по адресу http://oracle-academy.org.ua/svn/<»м€ проекта>/<Jira login>
	Ќайти и вывести на экран, сколько раз повтор€етс€ в тексте каждое слово, которое встречаетс€ в нем.
	 *
	 */

	public class SearchWordVersion2 {
		 

		public static void main(String[] args) throws FileNotFoundException 
		    {
			 	
			 
			 String fulltext = "";
			 Scanner in = new Scanner (new File("D:\\Java_Fundamentals_Home3_text.txt") );   //файл на винчестере
			
			 while(in.hasNext())
			 fulltext += in.nextLine() + "\r\n";				//записываем в fulltext
			 in.close();
			 
			    
		        String[] words = fulltext.split(" ");			// в массив стригнов мы вносим все слова разделЄнные пробелом
		        Object[] wordsdistinct = unique(words);			// в массив объектов мы вносим только уникальные слова, т.е. те слова которые встречаютс€ впервые!!!
		        int i;
		        for(Object distword : wordsdistinct)
		        {
		            i = 0;
		            for(String oneword: words)
		                if(oneword.equals(distword))
		                    i++;
		            System.out.println("—лово:\"" + distword + "\" встречаетс€ " + i + " раз(а)");
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



