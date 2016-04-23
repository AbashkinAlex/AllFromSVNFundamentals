package ua.org.oa.evlashdv;

public abstract class SimpleDataTypeUtils {
	/*
	 * Выведите на экран значение полей класса без предварительной инициализации.
Повторите тоже самое для локальных переменных.
	 */
	
	public static byte MyByte;
	public static short MyShort;
	public static int MyInt;
	public static long MyLong;
	public static float MyFloat;
	public static double MyDouble;
	public static char MyChar;
	public static boolean MyBoolean;
	
	public static void printFields1() {
		System.out.println("byte :" + " " + MyByte);
		System.out.println("short :" + " " + MyShort);
		System.out.println("int :" + " " + MyInt);
		System.out.println("long :" + " " + MyLong);
		System.out.println("float :" + " " + MyFloat);
		System.out.println("double :" + " " + MyDouble);
		System.out.println("char :" + " " + MyChar);
		System.out.println("boolean :" + " " + MyBoolean);
	
	
		/*
		 * Для локальных переменных выводить в консоль без преварительной инициализации нельзя. По этому проинициализируем их.
		 */ 
		 
		byte MyByteLocal = 1;
		short MyShortLocal = 3;
		int MyIntLocal = 4;
		long MyLongLocal = 5;
		float MyFloatLocal = 3.4f;
		double MyDoubleLocal = 3.4;
		char MyCharLocal = 'e';
		boolean MyBooleanLocal =  true;

		System.out.println("byte :" + MyByteLocal);
		System.out.println("short :" + MyShortLocal);
		System.out.println("int :" + MyIntLocal);
		System.out.println("long :" + MyLongLocal);
		System.out.println("float :" + MyFloatLocal);
		System.out.println("double :" + MyDoubleLocal);
		System.out.println("char :" + MyCharLocal);
		System.out.println("boolean :" + MyBooleanLocal);
				
	}
	
		
		
		
		
		public static void printFields2(){
			/*
			 * Создайте несколько переменных типа float. Присвойте этим переменным следующие значения:
			 * 1.;
			 * 1;
			 * 0x1;
			 * 0b1;
			 * 1.0e1;
			 * 01;
			 */
		float MyFloat2 = 1.f;
		float MyFloat3 = 1;
		float MyFloat4 = 0x1;
		float MyFloat5 = 0b1;		
		float MyFloat6 = 1.0e1f;
		float MyFloat7 = 01;
		
		System.out.println("MyFloat2 =" + MyFloat2);
		System.out.println("MyFloat3 =" + MyFloat3);
		System.out.println("MyFloat4 =" + MyFloat4);
		System.out.println("MyFloat5 =" + MyFloat5);
		System.out.println("MyFloat6 =" + MyFloat6);
		}
		
		public static void printFields3(){
			/*
			 * Создайте переменную типа short. Инициализаируйте ее результатом выполнения следующих операций:
			 * - суммой двух целых чисел;
			 * - суммой целого и дробного чисел;
			 * - суммой значений переменных типов float и int;
			 * - суммой значений переменных типа byte + short;
			 * - суммой значений переменных типа float + double;
			 */
			
			short sh1 = (short)(200+145);
			short sh2 = (short)(2+2.3);
			short sh3 = (short)(2.4f + 4);
			short sh4 = (short)((byte)3+(short)4);
			short sh5 = (short)(2.4f + 4.2d);

			System.out.println(sh1);
			System.out.println(sh2);
			System.out.println(sh3);
			System.out.println(sh4);
			System.out.println(sh5);
			
			
		}
		
		public static void printFields4(int katet1, int katet2, int gipotenuza){
			/*Заданы значения 2-х катетов и гипотенузы треугольника. Проверить является ли
			 * данный треугольник прямоугольным. Вычисления записать выражением, состоящим из
			 * одной строки (используя оператор “?:”).
			 *  
			 */
		
			System.out.println((katet1*katet1 + katet2*katet2 == gipotenuza*gipotenuza)? "rectangular triangle" : "rectangular is not triangle");
					
		}
		
		public static void printFields5(){
			/*5) Подсчитать сумму целых чисел от 1 до 20.
			 *  
			 */
			int sum = 0;
			for (int i = 1; i <= 20 ; i++){
			sum = sum + i;
			}
			System.out.println(sum);		
			
		}
		public static void printFields6(){
			/*
			6) Подсчитать сумму четных целых цисел от 1 до 20.
			*/

			int sum1 = 0;
			for (int i = 0; i <= 20 ; i=i+2){
			sum1 = sum1 + i;
			}
			System.out.println(sum1);
			
			
			
			/*или можно так
			 * 
			 * int sum2 = 0;
			 * for (int i = 0; i <= 20 ; i++){
			 * if(i%2 == 0){
			 * sum2 = sum2 + i;
			 * }
			 * }
			 * System.out.println(sum2);
			 *  
			 */
			
		}
		
		public static void printFields7(){
			
			/*
			7) Подсчитать сумму простых чисел в диапазоне о т 1 до 20.
			*/
			int sum5 = 0;
			int b1, b2;
			for (b1 = 2; b1 <= 20; b1++){
			b2 = 0;
			for (int i = 1; i <= b1; i++){
			if (b1 % i == 0)
			b2++;
			}
			if (b2 <= 2)
			sum5 = sum5 + b1;

			}
			System.out.println(sum5);
		}
		
		public static void printFields8(){
			/*
			 * Имея три переменных типа int a, b, c выведите на экран “true”, если сумма 
			 * значений двух любых из этих переменных равна значению третьей.
			 * 
			 */
		
			int a25 = 2;
			int b25 = 2;
			int c25 = 4;
			boolean bo;
			if (a25+b25 == c25 || a25+c25 == b25 || b25+c25 == a25 ){
			bo = true;
			System.out.println(bo);
			}
			
		}
			
			public static void printFields9(){
				/*
				 * Две переменные типа int, имеют положительные значения int a - начало
				 * диапазона, int b - конец диапазона, a>b. Вычислить среднее значение чисел в
				 * заданном диапазоне.
				 */
				int a = 20;
				int b = 10;
				while (a != b){
				--a;
				++b;
				}
				System.out.println(a);							
				
			}
			
			public static void printFields10(double credit, double procent, int countMonth){
				
				/*Написать программу расчета обязательных платежей кредитора при пользовании банковским кредитом.
				 * 
				 * Задание:
				 * а) Для каждого месяца вывести на экран сумму к оплате по телу кредита и начисленные проценты;
				 * б) Суммарное значение выплаченных процентов за период пользования кредитом.
				 * 
				 * Исходные данные: Сумма кредита, процентная ставка, срок кредитования. 
				 */

				double a = (credit / countMonth);
				double b = ((credit * procent / 100d) / countMonth);
				int sum = 0;
				for (int i = 1; i <= countMonth; i++) {
					sum+= b;
					System.out.println("In " + i + " pay credit " + a + " . Procent " + b + " .");
					System.out.println();
								}
				System.out.println(sum);

			}
		
		

}

