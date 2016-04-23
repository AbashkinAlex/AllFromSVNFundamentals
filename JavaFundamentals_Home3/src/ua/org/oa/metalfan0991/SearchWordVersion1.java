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
 *—оздать java класс, обрабатывающий текст согласно вашему заданию и удовлетвор€ющий следующим требовани€м:
1.  аждый класс, поле, метод  должен иметь название, отражающее его суть и комментарии, описывающие их предназначение.
2. Ќа этапе составлени€ программы должны быть использованы соглашени€ из java code convention.
3. ƒл€ задани€ входного текста можно использовать переменную типа String, содержащую не менее 5 строк текста (>400 символов), разбитого минимум на 3 предложени€. јльтернативно (предпочтительнее, но по желанию) - считать текст из файла на жестком диске.
4. ¬ажно! «адани€ могут быть решены несколькими способами. ѕредложите минимум 2 способа решени€ поставленной задачи.
5. ѕротестировать предложенное решение, продемонстрировать корректность решени€ задачи каждым способом.
6. »м€ пакета в котором создаетс€ класс/классы должно иметь формат ua.org.oa.<Jira Login>.
7. »ндивидуальна€ папка в SVN репозатарии дл€ сохранени€ выполненных заданий расположена по адресу http://oracle-academy.org.ua/svn/<»м€ проекта>/<Jira login>
Ќайти и вывести на экран, сколько раз повтор€етс€ в тексте каждое слово, которое встречаетс€ в нем.
 *
 */

public class SearchWordVersion1 {
	 public static void main(String[] args) 
	    {
		 
		    String fulltext = "Romeo and  Juliet is one of a group of lyrical plays usually dated at 1594-95. The earliest date that has been proposed for first performance of Romeo and Juliet is 1591. The play might have begun in about 1591, then laid aside, and only completed a year or two later. The allusions to Daniel and Eliot indicate 1953 as the earliest possible date for Romeo and Juliet, the Bad Quatro makes 1596 the latest.";
	        String[] words = fulltext.split(" ");			// в массив стригнов мы вносим все слова разделЄнные пробелом
	        Object[] wordsdistinct=unique(words);			// в массив объектов мы вносим только уникальные слова, т.е. те слова которые встречаютс€ впервые!!!
	        int i;
	        for(Object distword: wordsdistinct)				// цикл перебирает все уникальные слова из массива wordsdistinct , записывает их в i и создает объекты Object distword
	        {
	            i = 0;
	            for(String oneword : words)					// цикл 
	                if(oneword.equals(distword))			// когда слово повторилось, то i увеличиваетс€
	                    i++;
	            System.out.println("—лово:\"" + distword + "\" встречаетс€ " + i + " раз(а)");
	        }
	    }
	    
	    private static Object[] unique(String[] arrayName) // метод по нахождению уникальных слов
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
