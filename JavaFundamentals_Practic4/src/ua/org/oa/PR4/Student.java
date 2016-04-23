package ua.org.oa.PR4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

import ua.org.oa.metalfan0991.exceptions.GroupNameException;
import ua.org.oa.metalfan0991.exceptions.GroupSizeException;
import ua.org.oa.metalfan0991.exceptions.StudentAgeException;
import ua.org.oa.metalfan0991.exceptions.StudentNameException;

/*
 * Задание.

1. Создать класс Student. Переопределить в нем методы 
toString() equals() и hashCode().
2. Разработать свое пользовательское исключение как подкласс класса Exception и затем использовать его при обработке ситуаций ошибок ввода.
3. Продемонстрировать работу с классом и обработку исключений. 
 Создать класс Group, формирующий группу студентов (набор объектов Student)
 путем ввода их параметров с консоли (студенты сохраняются в массив, 
 размерность которого указывается при создании объекта group).
4. По окончанию заполнения группы распечатать состав группы.

 */

public class Student {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// ~~~~~~~~~~~~~~ Переменные ~~~~~~~~~~~~~~~~~
	private static final int MAX_AGE = 100;
	private static final int MIN_AGE = 18;
	private String studName;
	private int studAge;

	private Object groupName;

	// ~~~~~~~~~~~~~~ Геттеры и Сеттеры ~~~~~~~~~~~~~~~~~
	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) throws StudentNameException, IOException {
		int count1;
		int count2;
		if (Pattern.matches("[A-ZА-Я][a-zа-я]{2,20}", studName)) {
			this.studName = studName;
		} else {
			count1 = 0;
			count2 = 2;
			while (!(Pattern.matches("[A-ZА-Я][a-zа-я]{2,20}", studName))) {
				if (count1 == 2) {
					throw new StudentNameException();

				}

				System.out.println("Назвал имя студента не правильно. Имя должно начинаться с большой буквы.");
				System.out.println("Введите еще раз имя студента.");
				System.out.println("Осталось попыток : " + count2 + ".");
				studName = br.readLine();

				count1++;
				--count2;

			}
			this.studName = studName;
		}
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) throws StudentAgeException, NumberFormatException, IOException {

		int count1;
		int count2;
		if (studAge > MIN_AGE && studAge < MAX_AGE) {
			this.studAge = studAge;
		} else {
			count1 = 0;
			count2 = 2;
			while (!(studAge > MIN_AGE && studAge < MAX_AGE)) {
				if (count1 == 2) {
					throw new StudentAgeException();

				}
				System.out.println("Неправильно указан возраст студента. Допускается создавать студента возрастом от 18 до 100 лет.");
				System.out.println("Введите еще раз размер группы.");
				System.out.println("Осталось попыток : " + count2 + ".");

				studAge = Integer.parseInt(br.readLine());

				count1++;
				--count2;

			}
			this.studAge = studAge;

		}

	}

	// ~~~~~~~~~~~~~~ Конструктор ~~~~~~~~~~~~~~~~~

	public Student(String studName, int studAge) throws StudentNameException, StudentAgeException, IOException {

		setStudName(studName);
		setStudAge(studAge);
	}

	// ~~~~~~~~~~~~~~ HashCode ~~~~~~~~~~~~~~~~~

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studAge;
		result = prime * result + ((studName == null) ? 0 : studName.hashCode());
		return result;
	}

	// ~~~~~~~~~~~~~~ Equals ~~~~~~~~~~~~~~~~~

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studAge != other.studAge)
			return false;
		if (studName == null) {
			if (other.studName != null)
				return false;
		} else if (!studName.equals(other.studName))
			return false;
		return true;
	}

	// ~~~~~~~~~~~~~~ toString ~~~~~~~~~~~~~~~~~

	@Override
	public String toString() {
		return "Имя студента : " + studName + ". Возраст: " + studAge + ".";
	}

}
