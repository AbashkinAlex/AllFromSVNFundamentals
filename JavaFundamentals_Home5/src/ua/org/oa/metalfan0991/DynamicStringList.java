package ua.org.oa.metalfan0991;

import java.util.Arrays;
/*
 * 1. Создать интерфейс SimpleList, который определяет методы динамического массива, предназначенного для хранения строк:
void add(String s) - добавить строку в массив
String get() - получить последний элемент из массива
String get(int id) - получить элемент по его индексу
String remove() - удалить последний элемент
String remove(int id) - удалить элемент по индексу
boolean delete() - удалить все элементы массива.
2. Создать класс DynamicStringList, который реализует все методы интерфейса SimpleList. 
Для хранения элементов добавленных в объект типа DynamicStringList должен использоваться обычный Java-массив.
3. В классе DynamicStringList предусмотреть 2 конструктора: а)пустой и б) с числовым аргументом, определяющим
 начальный размер массива для хранения строк.
4. Все поля, используемые в классе для хранения элементов массива должны быть инкапсулированы.
5. Переопределить метод toString этого класса, для вывода всех строк, которые хранятся в объекте типа DynamicStringList
6. Создать объект типа DynamicStringList. Продемонстрировать добавление, извлечение, удаление строк из объекта,
 а также вывод на экран его содержимого.
5. На этапе составления программы должны быть использованы соглашения из java code convention.
6. Выполненное задание переслать в SVN репозатарий по адресу http://oracle-academy.org.ua/svn/<Имя проекта>/<Jira login>
 */

public class DynamicStringList implements SimpleList {

	// ---------------Переменные---------------

	private int index = 0;
	private String[] stringElements;

	// ---------------Констуктор---------------

	public DynamicStringList() {
		stringElements = new String[0];
	}

	public DynamicStringList(int size) {
		stringElements = new String[size];
	}

	// ---------------Методы---------------

	@Override
	public void add(String s) {
		if (index + 1 - stringElements.length > 0)
			stringElements = Arrays.copyOf(stringElements, index + 1); // делаем копию
																// массива , где
																// новый массив
																// будет с
																// размером на
																// один элемент
																// больше
		stringElements[index++] = s; // записываем строку в массив ,а затем
									// увеличиваем индекс на единицу
	}

	@Override
	public String get() {
		return stringElements[index - 1]; // метод возвращает последний элемент
										// массива
	}

	@Override
	public String get(int id) {
		return stringElements[id]; // метод возвращает элемент массива из конкретной
								// ячейки
	}

	@Override
	public String remove() { // метод по удалению последнего элемента в массиве

		return stringElements[--index] = null;

	}

	@Override
	public String remove(int id) { // метод по удалению элемента в массиве по
									// его индексу
		String oldValue = stringElements[id];
		int numMoved = index - id - 1;
		System.arraycopy(stringElements, id + 1, stringElements, id, numMoved);
		return stringElements[--index] = null;

	}

	@Override
	public boolean delete() { // метод по обнулению массива
		for (int i = 0; i < index; i++)
			stringElements[i] = null;
		index = 0;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); // разделяем все элементы
												// запятыми
		sb.append("[");
		for (int i = 0; i < index; i++) {
			if (i != 0)
				sb.append(", ");
			sb.append(stringElements[i]);
		}
		sb.append("]");

		return sb.toString();
	}

}
