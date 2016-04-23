package ua.org.oa.metalfan0991;
public class TestDisplayExceptions {

	/**
	 —оздать java класс, содержащий несколько методов демонстрирующих
	 возникновение следующих исключений/ошибок:
	 1. ArrayIndexOutOfBoundsException 
	 2. IllegalArgumentException 
	 3. ClassCastException 
	 4. StringIndexOutOfBoudException 
	 5. NullPointerException (3 различных способа) 
	 6. StackOverflowError 
	 7. NumberFormatException 
	 8. OutOfMemoryError
	  
	 1. Ќа этапе составлени€ программы должны быть использованы соглашени€ из
	 	java code convention. 
	 2. ѕротестировать предложенное решение,  продемонстрировать корректность 
	 	решени€ задачи каждым способом. 
	 3. »м€ пакета в котором создаетс€ класс/классы должно иметь формат
	 	ua.org.oa.<Jira Login>. 
	 4. »ндивидуальна€ папка в SVN репозатарии дл€ сохранени€ выполненных 
	 	заданий расположена по адресу
	 	http://oracle-academy.org.ua/svn/<»м€ проекта>/<Jira login>
	 */

	public static void main(String[] args) {

		DisplayExceptions error = new DisplayExceptions();

		error.ArrayIndex(7);

		error.IllegalArgument("234i");

		error.ClassCastE();

		error.StringIndex("mama", 4);

		error.NullPointer1();

		error.NullPointer2();

		error.NullPointer3();

		error.StackOver();

		error.NumberFormat("0i");

		error.outMem();

	}

}