package ua.org.oa.metalfan0991;

public class TestDynamicStringList {

	public static void main(String[] args) {
		DynamicStringList listString = new DynamicStringList();

		listString.add("Str0");
		listString.add("Str1");
		listString.add("Str2");
		listString.add("Str3");
		listString.add("Str4");
		System.out.println("Все элементы массива: " + listString);
		System.out.println("Последний элемент массива: " + listString.get());
		System.out.println("Элемент массива с индексом 3 : " + listString.get(3));
		listString.remove();
		System.out.println("Удаляем последний элемент массива. Теперь массив выглядит вот так: " + listString);
		listString.remove(2);
		System.out.println("Удаляем ячейку массива с индексом 2. Теперь массив выглядит вот так: " + listString);
		listString.delete();
		System.out.println("Удаляем все элементы массива. Теперь массив выглядит вот так: " + listString);

	}

}
