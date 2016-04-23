package ua.org.oa.PR4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.regex.Pattern;

import javax.sql.rowset.spi.TransactionalWriter;

import ua.org.oa.metalfan0991.exceptions.GroupNameException;
import ua.org.oa.metalfan0991.exceptions.GroupSizeException;
import ua.org.oa.metalfan0991.exceptions.StudentNameException;

public class Group {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// ~~~~~~~~~~ Переменные ~~~~~~~~~~~

	private static final int MAX_SIZE = 35;

	private static final int MIN_SIZE = 1;

	int index;

	private String groupName;

	private static int groupSize;

	private Student[] studList;

	// ~~~~~~~~~~ Геттеры и Сеттеры ~~~~~~~~~~~

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) throws IOException, GroupNameException {
		int count1;
		int count2;
		if (Pattern.matches("[A-ZА-Я0-9]{2,20}", groupName)) {
			this.groupName = groupName;
		} else {
			count1 = 0;
			count2 = 2;
			while (!(Pattern.matches("[A-ZА-Я0-9]{2,20}", groupName))) {
				if (count1 == 2) {
					throw new GroupNameException();

				}

				System.out.println("Назвал группу не правильно.Все буквы в названии группы должны быть в верхнем регистре, допускается вводить цифры от 0 до 9.");
				System.out.println("Введите еще раз имя группы.");
				System.out.println("Осталось попыток : " + count2 + ".");
				groupName = br.readLine();

				count1++;
				--count2;

			}
			this.groupName = groupName;
			System.out.println("Группа "+ groupName +" создана!");
		}
	}

	public static int getGroupSize() {
		return groupSize;
	}

	public void setGroupSize(int groupSize) throws NumberFormatException, IOException, GroupSizeException {

		int count1;
		int count2;
		if (groupSize > MIN_SIZE && groupSize < MAX_SIZE) {
			this.groupSize = groupSize;
		} else {
			count1 = 0;
			count2 = 2;
			while (!(groupSize > MIN_SIZE && groupSize < MAX_SIZE)) {
				if (count1 == 2) {
					throw new GroupSizeException();

				}
				System.out.println("Неправильно указан размер группы. Допускается создавать группу в диапазоне от 1 до 35 человек.");
				System.out.println("Введите еще раз размер группы.");
				System.out.println("Осталось попыток : " + count2 + ".");

				groupSize = Integer.parseInt(br.readLine());

				count1++;
				--count2;

			}
			this.groupSize = groupSize;

		}

	}

	public Student[] getStudList() {
		return studList;
	}

	public void setStudList(Student[] studList) {
		this.studList = studList;
	}

	// ~~~~~~~~~~ Конструктор ~~~~~~~~~~~

	public Group(String groupName, int groupSize)
			throws IOException, GroupNameException, NumberFormatException, GroupSizeException {
		setGroupName(groupName);
		setGroupSize(groupSize);
		studList = new Student[groupSize];

	}

	// ~~~~~~~~~~ Проверка и добавление студента ~~~~~~~~~~~

	public boolean addStud(Student stud) {
		for (Student student : studList) {
			if (stud.equals(student)) {
				System.out.println("Такой студент уже существует в группе");
				return false;

			}
		}

		studList[index] = stud;
		index++;
		return true;

	}

	// ~~~~~~~~~~~~~~~ toString ~~~~~~~~~~~~~

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Student student : studList) {

			sb.append(student).append("\n");
		}
		return "Группа : " + groupName + "\n" + sb;
	}

}
