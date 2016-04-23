package ua.org.oa.PR4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.rmi.CORBA.StubDelegate;

import ua.org.oa.metalfan0991.exceptions.GroupNameException;
import ua.org.oa.metalfan0991.exceptions.GroupSizeException;
import ua.org.oa.metalfan0991.exceptions.StudentAgeException;
import ua.org.oa.metalfan0991.exceptions.StudentNameException;
import ua.org.oa.PR4.Group;

public class App {

	public static void main(String[] args) throws StudentNameException, IOException, GroupNameException,
			NumberFormatException, GroupSizeException, StudentAgeException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ~~~~~~~~~~~~~~ ������� ������ ~~~~~~~~~~~~~~~~~
		
		Group myFavoriteGroup = null;
		for (int i = 0; i < 1; i++) {
			System.out.println("������� ��� ������:");
			String name = br.readLine();
			System.out.println("������� ������ ������:");
			int size = Integer.parseInt(br.readLine());
			myFavoriteGroup = new Group(name, size);
			

		}
		
		// ~~~~~~~~~~~~~~ ������� ��������� ~~~~~~~~~~~~~~~~~

		for (int i = 0; i < Group.getGroupSize(); i++) {
			Student student = null;
			if (true) {
				System.out.println("������� ��� ��������:");
				String name = br.readLine();

				System.out.println("������� ������� ��������:");
				int age = Integer.parseInt(br.readLine());

				student = new Student(name, age);

				myFavoriteGroup.addStud(student);

			}
		}
		System.out.println(myFavoriteGroup);

	}
}
