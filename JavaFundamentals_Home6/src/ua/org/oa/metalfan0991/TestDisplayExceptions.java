package ua.org.oa.metalfan0991;
public class TestDisplayExceptions {

	/**
	 ������� java �����, ���������� ��������� ������� ���������������
	 ������������� ��������� ����������/������:
	 1. ArrayIndexOutOfBoundsException 
	 2. IllegalArgumentException 
	 3. ClassCastException 
	 4. StringIndexOutOfBoudException 
	 5. NullPointerException (3 ��������� �������) 
	 6. StackOverflowError 
	 7. NumberFormatException 
	 8. OutOfMemoryError
	  
	 1. �� ����� ����������� ��������� ������ ���� ������������ ���������� ��
	 	java code convention. 
	 2. �������������� ������������ �������,  ������������������ ������������ 
	 	������� ������ ������ ��������. 
	 3. ��� ������ � ������� ��������� �����/������ ������ ����� ������
	 	ua.org.oa.<Jira Login>. 
	 4. �������������� ����� � SVN ����������� ��� ���������� ����������� 
	 	������� ����������� �� ������
	 	http://oracle-academy.org.ua/svn/<��� �������>/<Jira login>
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