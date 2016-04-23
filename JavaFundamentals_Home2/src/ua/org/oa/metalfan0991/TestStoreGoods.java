package ua.org.oa.metalfan0991;

import java.util.Scanner;


public class TestStoreGoods {
/**
  Для решения задачи создать java программу, удовлетворяющую следующим требованиям:
  1. Спроектировать базовый класс, содержащий в качестве полей объекты других классов.
  2. Предусмотреть возможность создания объектов класса с указанием различных параметров
  инициализации.
  3. Каждый класс, поле, метод должны иметь название, отражающее его суть и комментарии,
  описывающие их предназначение.
  4. Продемонстрировать использование перегруженных методов и конструкторов, массивов.
  5. При инициализации полей классов проверять корректность введенных данных.
  6. Создать класс демонстрирующий корректность работы разработанной java программы
  7. На этапе составления программы должны быть использованы соглашения из java code convention.
  8. Имя пакета в котором создается класс/классы должно иметь формат ua.org.oa.<Jira Login>.
  9. Индивудуальная папка в SVN репозатарии для сохранения выполненных заданий располжена по адресу
   http://oracle-academy.org.ua/svn/<Имя проекта>/<Jira login>
   10. Опционально: организовать ввод данных с консоли
   11. Опционально: отсортировать объекты в массиве по возрастанию, на основании одного
   из значащих полей. 
   Создать классы магазин и товары. В классе магазин вычислить среднюю
   цену товаров и определить методы для вывода на экран всех товаров магазина, чья цена:
   выше средней;
   выше определенной цены;
   ниже средней;
   ниже определенной цены.
 */
	public static void main(String[] args) {

		Store myStore = new Store(); // создание объекта магазина

		Goods dictionaryGoods = new Goods("Зубная паста", "Colgate", 25.50, 2015);// создание
																		// товаров с																		// с
																		// параметрами

		Goods programmingGoods = new Goods("Стиральный порошок", "Persil", 120.75, 2014);

		Goods cookGoods = new Goods("Радио", "Мелодия", 50.00, 1985);

		Goods bibliyaGoods = new Goods("Веревка", "Московский верёвочный завод", 450.00, 2013);

		Goods technicGoods = new Goods("Хозяйственное мыло", "ООО ХарьковМыло", 2.33, 2011);

		myStore.addGoodsToStore(dictionaryGoods);// добавление товаров  в
													//магазин
		myStore.addGoodsToStore(programmingGoods);
		myStore.addGoodsToStore(cookGoods);
		myStore.addGoodsToStore(bibliyaGoods);
		myStore.addGoodsToStore(technicGoods);

		System.out.println("Количество товаров в магазине: "
				+ myStore.myGoodss.size());// вывод количества товаров в
											// магазин

		myStore.calculateAveragePriceAllGoodss();// расчет средней остаточной
													// стоимости всех товаров в
													// магазине

		System.out.println("Выбирете, пожалуйста пункт:");
		System.out.println("1. Вывести на экран все товары в магазине");
		System.out.println("2. Вывести на экран товары с остаточной стоимсотью выше средней");
		System.out.println("3. Вывести на экран товары с остаточной стоимсотью ниже средней");
		System.out.println("4. Вывести на экран товары с остаточной стоимсотью выше введенной (будет запрошена цена)");
		System.out.println("5. Вывести на экран товары с остаточной стоимсотью ниже введенной (будет запрошена цена)");
		System.out.println("6. Добавить еще один товар в магазин");

		Scanner input2 = new Scanner(System.in);
		int inputItem = input2.nextInt();

		switch (inputItem) {
		case 1: {
			myStore.showAllGoodss();
		}
			break;
		case 2: {
			myStore.showAllGoodssAboveAvarege();
		}
			break;
		case 3: {
			myStore.showAllGoodssBelowAvarege();
		}
			break;
		case 4: {
			System.out.println("Введите пороговую цену:"); // ввод стоимости
															// товара для выбора
															// товара выше или
															// ниже этой границы
			Scanner input = new Scanner(System.in);
			double inputCap = input.nextDouble();
			if (inputCap <= 0) {
				System.out.println("Введенное число должно быть больше нуля");
			} else {
				myStore.setTargetPrice(inputCap);
				myStore.showAllAboveInput();
			}
		}
			break;
		case 5: {
			System.out.println("Введите пороговую цену:");  // ввод стоимости
															// товара для выбора
															// товара выше или
															// ниже этой границы
			Scanner input = new Scanner(System.in);
			double inputCap = input.nextDouble();
			if (inputCap <= 0) {
				System.out.println("Введенное число должно быть больше нуля");
			} else {
				myStore.setTargetPrice(inputCap);
				myStore.showAllBelowInput();
			}
		}
			break;
		case 6: {
			Goods emptyGoods = new Goods();// создание товара без параметров
			myStore.addGoodsToStore(emptyGoods);
			System.out.println("Товар добавлен");
			myStore.showAllGoodss();

		}
			break;

		default:
			System.out.println("Вы ввели неверное значение!");
			break;
		}

	}

}

