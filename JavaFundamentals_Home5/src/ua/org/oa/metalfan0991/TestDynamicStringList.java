package ua.org.oa.metalfan0991;

public class TestDynamicStringList {

	public static void main(String[] args) {
		DynamicStringList listString = new DynamicStringList();

		listString.add("Str0");
		listString.add("Str1");
		listString.add("Str2");
		listString.add("Str3");
		listString.add("Str4");
		System.out.println("��� �������� �������: " + listString);
		System.out.println("��������� ������� �������: " + listString.get());
		System.out.println("������� ������� � �������� 3 : " + listString.get(3));
		listString.remove();
		System.out.println("������� ��������� ������� �������. ������ ������ �������� ��� ���: " + listString);
		listString.remove(2);
		System.out.println("������� ������ ������� � �������� 2. ������ ������ �������� ��� ���: " + listString);
		listString.delete();
		System.out.println("������� ��� �������� �������. ������ ������ �������� ��� ���: " + listString);

	}

}
