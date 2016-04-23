package ua.org.oa.metalfan0991;

//Создаю новый класс StudentTest для тестирования класса Student

public class StudentTest {
	//Определяю метод для вывода информации об объекте на экран.
	public static void main (String args[]){
	
	Student student1 = new Student(18, 80, true, true, "Bob");
	Student student2 = new Student(18, 40, true, false, "Max");
	Student student3 = new Student(19, 9, false, false, "John");
	
	System.out.println("~~~~~~~~~~~~~~Student1~~~~~~~~~~~~~~~~~~");
	if (student1.visit < 0 | student1.visit > 100 ){         // проверяю корректно ли ввели данные о посещаемости
		System.out.println("Значение посещаемости для студента " + student1.name + " введено не правильно.");
	} else {
	System.out.println("Студент : " + student1.name + ". Возраст : " + student1.age + " лет.");
	System.out.println("Шансы получить диплом равны : " + student1.chance() + "% .");
	}
	
	System.out.println("~~~~~~~~~~~~~~Student2~~~~~~~~~~~~~~~~~~");
	if (student2.visit < 0 | student2.visit > 100 ){			// проверяю корректно ли ввели данные о посещаемости
		System.out.println("Значение посещаемости для студента " + student2.name + " введено не правильно.");
	} else {
	System.out.println("Студент : " + student2.name + ". Возраст : " + student2.age + " лет.");
	System.out.println("Шансы получить диплом равны : " + student2.chance() + "% .");
	}
	
	System.out.println("~~~~~~~~~~~~~~Student3~~~~~~~~~~~~~~~~~~");
	if (student3.visit < 0 | student3.visit > 100 ){			// проверяю корректно ли ввели данные о посещаемости
		System.out.println("Значение посещаемости для студента " + student3.name + " введено не правильно.");
	} else {
	System.out.println("Студент : " + student3.name + ". Возраст : " + student3.age + " лет.");
	System.out.println("Шансы получить диплом равны : " + student3.chance() + "% .");
	}
}			

}
