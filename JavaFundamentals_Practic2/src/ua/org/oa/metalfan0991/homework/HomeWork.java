package ua.org.oa.metalfan0991.homework;

import java.util.ArrayList;
import java.util.Scanner;



public class HomeWork {

	/**
	 *–еализовать программу учета среднесуточной температуры на прот€жении мес€ца. ¬вод 
данных реализовать с консоли. ¬начале должен быть выведен запрос названи€ мес€ца, 
затем значений температуры дл€ каждого числа.  оличество дней в мес€це программа 
должна определ€ть автоматически.  «начени€ хранить в ArrayList. ѕри вводе реализовать
проверку корректности вводимых данных, если данные введены не корректно - запросить 
ввод повторно. ѕосле введени€ данных вывести среднемес€чную температуру,  дату 
когда была максимальна€ температура и минимальна€ с указанием ее значени€.
	 */
	public static void main(String[] args) {
		
		 System.out.println ("¬ведите мес€ц");
		   Scanner scan = new Scanner(System.in); //организовуем ввод с косоли
		      int days = 0;
		      int sum = 0;
		      double average = 0;
		      int min = 0;
		      int max = 0;
		      
		      String s11 = scan.nextLine();
		         
		      String [] month31 = {"январь","ћарт","ћай","»юль","—ент€брь","Ќо€брь"}; // массив мес€цев с количеством дней 31
		         
		      String [] month30 = {"јпрель","»юнь","јвгуст","ќкт€брь","ƒекабрь"};  // массив мес€цев с количеством дней 30
		         
		      String month28  = "‘евраль"; // массив мес€цев с количеством дней 28
		         
		         for ( String a: month31){
		        	
		          if (s11.equals(a)){
		        	  days = 31;
		           System.out.println(a + " состоит из " + days + " дней." );
		          }
		         }
		         for ( String b: month30){
		           if (s11.equals(b)){
		        	   days = 30;
		            System.out.println(b + " состоит из " + days + " дней." );
		           }
		         }
		         if (s11.equals(month28)) {
		             days=28;
		             System.out.println(month28 + " состоит из " + days + " дней." );
		            }
		         
		         int[] temp = new int[days];
		         for (int i = 0; i < days; i++){
		        	 System.out.println("¬ведите температуру воздуха " + (i+1) + " числа."); 
		        	 temp [i] = scan.nextInt();
		        	 System.out.println("ћес€ц " + s11 + ".");
		        	 }
		         
		         for (int i = 0; i < days; i++){		         
		        	 
		        	 sum += temp[i];
		        	 
		         }
		         average =  (sum/days); // рассчет среднесуточной температуры
	        	 System.out.printf("—редн€€ температура: %.2f", average);
	        	 System.out.println();
	        	 
	        	 for (int i = 0; i < temp.length; ++i){		         
		        	 
		        	 min = Math.min(min,temp[i]); // рассчет минимальной температуры
		        	 max = Math.max(max,temp[i]); // рассчет максимальной температуры
	        	 }
	        	  
	              for (int i = 0; i<temp.length; i++){
	                  if (min == temp[i]) { 
	                   System.out.println("ћинимальна€ температура была на(в) "+ (i+1) + " день" + " и составила " + min + " градусов по ÷ельсию.");
	                  }
	                  if (max == temp[i]) {
	                    System.out.println("ћаксимальна€ температура была на(в) "+ (i+1) + " день" + " и составила " + max + " градусов по ÷ельсию.");
	                   }
	                 }        
		         
	}
}
