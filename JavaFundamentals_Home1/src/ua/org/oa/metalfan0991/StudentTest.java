package ua.org.oa.metalfan0991;

//������ ����� ����� StudentTest ��� ������������ ������ Student

public class StudentTest {
	//��������� ����� ��� ������ ���������� �� ������� �� �����.
	public static void main (String args[]){
	
	Student student1 = new Student(18, 80, true, true, "Bob");
	Student student2 = new Student(18, 40, true, false, "Max");
	Student student3 = new Student(19, 9, false, false, "John");
	
	System.out.println("~~~~~~~~~~~~~~Student1~~~~~~~~~~~~~~~~~~");
	if (student1.visit < 0 | student1.visit > 100 ){         // �������� ��������� �� ����� ������ � ������������
		System.out.println("�������� ������������ ��� �������� " + student1.name + " ������� �� ���������.");
	} else {
	System.out.println("������� : " + student1.name + ". ������� : " + student1.age + " ���.");
	System.out.println("����� �������� ������ ����� : " + student1.chance() + "% .");
	}
	
	System.out.println("~~~~~~~~~~~~~~Student2~~~~~~~~~~~~~~~~~~");
	if (student2.visit < 0 | student2.visit > 100 ){			// �������� ��������� �� ����� ������ � ������������
		System.out.println("�������� ������������ ��� �������� " + student2.name + " ������� �� ���������.");
	} else {
	System.out.println("������� : " + student2.name + ". ������� : " + student2.age + " ���.");
	System.out.println("����� �������� ������ ����� : " + student2.chance() + "% .");
	}
	
	System.out.println("~~~~~~~~~~~~~~Student3~~~~~~~~~~~~~~~~~~");
	if (student3.visit < 0 | student3.visit > 100 ){			// �������� ��������� �� ����� ������ � ������������
		System.out.println("�������� ������������ ��� �������� " + student3.name + " ������� �� ���������.");
	} else {
	System.out.println("������� : " + student3.name + ". ������� : " + student3.age + " ���.");
	System.out.println("����� �������� ������ ����� : " + student3.chance() + "% .");
	}
}			

}
