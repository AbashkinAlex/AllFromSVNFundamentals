package ua.org.oa.metalfan0991;

public interface SimpleList {
	void add(String s); // добавляем строки в массив

	String get(); // получить последний элемент массива

	String get(int id); // получить элемент по индексу массива

	String remove(); // удалить последний элемент массива

	String remove(int id); // удалить элемент по индексу массива

	boolean delete(); // обнуляем массив, очищаем всё содержимое элементов
}
