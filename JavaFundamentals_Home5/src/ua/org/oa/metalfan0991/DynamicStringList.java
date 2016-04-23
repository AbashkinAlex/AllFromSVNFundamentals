package ua.org.oa.metalfan0991;

import java.util.Arrays;
/*
 * 1. ������� ��������� SimpleList, ������� ���������� ������ ������������� �������, ���������������� ��� �������� �����:
void add(String s) - �������� ������ � ������
String get() - �������� ��������� ������� �� �������
String get(int id) - �������� ������� �� ��� �������
String remove() - ������� ��������� �������
String remove(int id) - ������� ������� �� �������
boolean delete() - ������� ��� �������� �������.
2. ������� ����� DynamicStringList, ������� ��������� ��� ������ ���������� SimpleList. 
��� �������� ��������� ����������� � ������ ���� DynamicStringList ������ �������������� ������� Java-������.
3. � ������ DynamicStringList ������������� 2 ������������: �)������ � �) � �������� ����������, ������������
 ��������� ������ ������� ��� �������� �����.
4. ��� ����, ������������ � ������ ��� �������� ��������� ������� ������ ���� ���������������.
5. �������������� ����� toString ����� ������, ��� ������ ���� �����, ������� �������� � ������� ���� DynamicStringList
6. ������� ������ ���� DynamicStringList. ������������������ ����������, ����������, �������� ����� �� �������,
 � ����� ����� �� ����� ��� �����������.
5. �� ����� ����������� ��������� ������ ���� ������������ ���������� �� java code convention.
6. ����������� ������� ��������� � SVN ����������� �� ������ http://oracle-academy.org.ua/svn/<��� �������>/<Jira login>
 */

public class DynamicStringList implements SimpleList {

	// ---------------����������---------------

	private int index = 0;
	private String[] stringElements;

	// ---------------����������---------------

	public DynamicStringList() {
		stringElements = new String[0];
	}

	public DynamicStringList(int size) {
		stringElements = new String[size];
	}

	// ---------------������---------------

	@Override
	public void add(String s) {
		if (index + 1 - stringElements.length > 0)
			stringElements = Arrays.copyOf(stringElements, index + 1); // ������ �����
																// ������� , ���
																// ����� ������
																// ����� �
																// �������� ��
																// ���� �������
																// ������
		stringElements[index++] = s; // ���������� ������ � ������ ,� �����
									// ����������� ������ �� �������
	}

	@Override
	public String get() {
		return stringElements[index - 1]; // ����� ���������� ��������� �������
										// �������
	}

	@Override
	public String get(int id) {
		return stringElements[id]; // ����� ���������� ������� ������� �� ����������
								// ������
	}

	@Override
	public String remove() { // ����� �� �������� ���������� �������� � �������

		return stringElements[--index] = null;

	}

	@Override
	public String remove(int id) { // ����� �� �������� �������� � ������� ��
									// ��� �������
		String oldValue = stringElements[id];
		int numMoved = index - id - 1;
		System.arraycopy(stringElements, id + 1, stringElements, id, numMoved);
		return stringElements[--index] = null;

	}

	@Override
	public boolean delete() { // ����� �� ��������� �������
		for (int i = 0; i < index; i++)
			stringElements[i] = null;
		index = 0;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); // ��������� ��� ��������
												// ��������
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
