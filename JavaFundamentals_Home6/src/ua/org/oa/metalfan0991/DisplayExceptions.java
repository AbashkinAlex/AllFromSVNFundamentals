package ua.org.oa.metalfan0991;

import java.util.ArrayList;

public class DisplayExceptions {

	// 1-------------ArrayIndexOutOfBoundsException------------------
	void ArrayIndex(int z) {
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		try {
			System.out.println(arr[z]);
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Ошибка ArrayIndexOutOfBoundsException (или Выход индекса за пределы массива) ");
			System.out.println(
					"Произошла, потому что массив из трех элеменов, а мы, для вывода на экран, ссылаемся на седьмой."
							+ "\n");

		}
	}

	// 2----------------IllegalArgumentException-------------------

	void IllegalArgument(String s) {
		try {
			System.out.println(Integer.parseInt(s));
			System.out.println();
		} catch (IllegalArgumentException iae) {
			System.out.println(
					"Ошибка IllegalArgumentException (или Употребление недопустимого аргумента при вызове метода)");
			System.out.println(
					"Произошла, потому что мы парсим int, а в качестве аргумента получили строку 234i, символ i недопустим. "
							+ "\n");

		}
	}

	// 3----------------ClassCastException-------------------

	void ClassCastE() {
		try {
			Object d = new Double(15.8);
			System.out.println((String) d);
		} catch (ClassCastException iae) {
			System.out.println("Ошибка ClassCastException (или Неверное приведение типов)");
			System.out.println("Произошла, потому что числа с плавающей точкой нельзя привести к строке." + "\n");

		}
	}

	// 4----------------StringIndexOutOfBoudsException-------------------

	void StringIndex(String s, int z) {
		try {
			System.out.println("Char number " + z + ": " + s.charAt(z));
			System.out.println();
		} catch (StringIndexOutOfBoundsException si) {
			System.out.println(
					"Ошибка StringIndexOutOfBoundsException (или Выход индекса некоторого типа за допустимые пределы)");
			System.out.println();
		}
	}

	// 5----------------NullPointerException-------------------

	void NullPointer1() {
		String[] s = new String[5];
		try {
			System.out.println(s[1].charAt(0));
		} catch (NullPointerException npe) {
			System.out.println("Ошибка NullPointerException №1 (Неверное использование пустой ссылки)");

			System.out.println();
		}
	}

	void NullPointer2() {
		Integer[] in = new Integer[5];
		try {
			System.out.println(in[1].toString());
		} catch (NullPointerException npe) {
			System.out.println("Ошибка NullPointerException №2 (Неверное использование пустой ссылки)");
			System.out.println();
		}
	}

	void NullPointer3() {
		Object ob = null;
		try {
			System.out.println(ob.toString());
		} catch (NullPointerException npe) {
			System.out.println("Ошибка NullPointerException №3 (Неверное использование пустой ссылки)");
			System.out.println();
		}
	}

	// 6----------------StackOverflowError-------------------

	void StackOver() {
		try {
			StackOver();
		} catch (StackOverflowError so) {
			System.out.println("~");
			System.out.println("Ошибка StackOverFlowError , переполнение памяти(стэка)");
			System.out.println("Метод вызвает сам себя, рекурсия.");
			System.out.println();
		}

	}

	// 7----------------NumberFormatException-------------------

	void NumberFormat(String s) {
		try {
			System.out.println(Integer.parseInt(s));
			System.out.println();
		} catch (NumberFormatException iae) {
			System.out.println(
					"Ошибка NumberFormatException -  Неверное преобразова ние символьной строки в числовой формат");
			System.out.println();
		}
	}

	// 8----------------OutOfMemoryError-------------------

	void outMem() {
		ArrayList<String> st = new ArrayList<String>();
		try {
			while (true) {
				st.add("mama");
			}
		} catch (OutOfMemoryError om) {
			System.out.println(
					"Ошибка OutOfMemoryError переполнение памяти (в хипе), бесконечный цикл, который добавляет строки.");
			System.out.println();
		}
	}

}