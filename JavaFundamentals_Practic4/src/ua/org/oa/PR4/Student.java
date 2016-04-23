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
 * �������.

1. ������� ����� Student. �������������� � ��� ������ 
toString() equals() � hashCode().
2. ����������� ���� ���������������� ���������� ��� �������� ������ Exception � ����� ������������ ��� ��� ��������� �������� ������ �����.
3. ������������������ ������ � ������� � ��������� ����������. 
 ������� ����� Group, ����������� ������ ��������� (����� �������� Student)
 ����� ����� �� ���������� � ������� (�������� ����������� � ������, 
 ����������� �������� ����������� ��� �������� ������� group).
4. �� ��������� ���������� ������ ����������� ������ ������.

 */

public class Student {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// ~~~~~~~~~~~~~~ ���������� ~~~~~~~~~~~~~~~~~
	private static final int MAX_AGE = 100;
	private static final int MIN_AGE = 18;
	private String studName;
	private int studAge;

	private Object groupName;

	// ~~~~~~~~~~~~~~ ������� � ������� ~~~~~~~~~~~~~~~~~
	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) throws StudentNameException, IOException {
		int count1;
		int count2;
		if (Pattern.matches("[A-Z�-�][a-z�-�]{2,20}", studName)) {
			this.studName = studName;
		} else {
			count1 = 0;
			count2 = 2;
			while (!(Pattern.matches("[A-Z�-�][a-z�-�]{2,20}", studName))) {
				if (count1 == 2) {
					throw new StudentNameException();

				}

				System.out.println("������ ��� �������� �� ���������. ��� ������ ���������� � ������� �����.");
				System.out.println("������� ��� ��� ��� ��������.");
				System.out.println("�������� ������� : " + count2 + ".");
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
				System.out.println("����������� ������ ������� ��������. ����������� ��������� �������� ��������� �� 18 �� 100 ���.");
				System.out.println("������� ��� ��� ������ ������.");
				System.out.println("�������� ������� : " + count2 + ".");

				studAge = Integer.parseInt(br.readLine());

				count1++;
				--count2;

			}
			this.studAge = studAge;

		}

	}

	// ~~~~~~~~~~~~~~ ����������� ~~~~~~~~~~~~~~~~~

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
		return "��� �������� : " + studName + ". �������: " + studAge + ".";
	}

}
