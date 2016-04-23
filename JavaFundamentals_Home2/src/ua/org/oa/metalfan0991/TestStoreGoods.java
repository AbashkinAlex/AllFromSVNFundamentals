package ua.org.oa.metalfan0991;

import java.util.Scanner;


public class TestStoreGoods {
/**
  ��� ������� ������ ������� java ���������, ��������������� ��������� �����������:
  1. �������������� ������� �����, ���������� � �������� ����� ������� ������ �������.
  2. ������������� ����������� �������� �������� ������ � ��������� ��������� ����������
  �������������.
  3. ������ �����, ����, ����� ������ ����� ��������, ���������� ��� ���� � �����������,
  ����������� �� ��������������.
  4. ������������������ ������������� ������������� ������� � �������������, ��������.
  5. ��� ������������� ����� ������� ��������� ������������ ��������� ������.
  6. ������� ����� ��������������� ������������ ������ ������������� java ���������
  7. �� ����� ����������� ��������� ������ ���� ������������ ���������� �� java code convention.
  8. ��� ������ � ������� ��������� �����/������ ������ ����� ������ ua.org.oa.<Jira Login>.
  9. �������������� ����� � SVN ����������� ��� ���������� ����������� ������� ���������� �� ������
   http://oracle-academy.org.ua/svn/<��� �������>/<Jira login>
   10. �����������: ������������ ���� ������ � �������
   11. �����������: ������������� ������� � ������� �� �����������, �� ��������� ������
   �� �������� �����. 
   ������� ������ ������� � ������. � ������ ������� ��������� �������
   ���� ������� � ���������� ������ ��� ������ �� ����� ���� ������� ��������, ��� ����:
   ���� �������;
   ���� ������������ ����;
   ���� �������;
   ���� ������������ ����.
 */
	public static void main(String[] args) {

		Store myStore = new Store(); // �������� ������� ��������

		Goods dictionaryGoods = new Goods("������ �����", "Colgate", 25.50, 2015);// ��������
																		// ������� �																		// �
																		// �����������

		Goods programmingGoods = new Goods("���������� �������", "Persil", 120.75, 2014);

		Goods cookGoods = new Goods("�����", "�������", 50.00, 1985);

		Goods bibliyaGoods = new Goods("�������", "���������� ��������� �����", 450.00, 2013);

		Goods technicGoods = new Goods("������������� ����", "��� �����������", 2.33, 2011);

		myStore.addGoodsToStore(dictionaryGoods);// ���������� �������  �
													//�������
		myStore.addGoodsToStore(programmingGoods);
		myStore.addGoodsToStore(cookGoods);
		myStore.addGoodsToStore(bibliyaGoods);
		myStore.addGoodsToStore(technicGoods);

		System.out.println("���������� ������� � ��������: "
				+ myStore.myGoodss.size());// ����� ���������� ������� �
											// �������

		myStore.calculateAveragePriceAllGoodss();// ������ ������� ����������
													// ��������� ���� ������� �
													// ��������

		System.out.println("��������, ���������� �����:");
		System.out.println("1. ������� �� ����� ��� ������ � ��������");
		System.out.println("2. ������� �� ����� ������ � ���������� ���������� ���� �������");
		System.out.println("3. ������� �� ����� ������ � ���������� ���������� ���� �������");
		System.out.println("4. ������� �� ����� ������ � ���������� ���������� ���� ��������� (����� ��������� ����)");
		System.out.println("5. ������� �� ����� ������ � ���������� ���������� ���� ��������� (����� ��������� ����)");
		System.out.println("6. �������� ��� ���� ����� � �������");

		Scanner input2 = new Scanner(System.in);
		int inputItem = input2.nextInt();

		switch (inputItem) {
		case 1: {
			myStore.showAllGoodss();
		}
			break;
		case 2: {
			myStore.showAllGoodssAboveAvarege();
		}
			break;
		case 3: {
			myStore.showAllGoodssBelowAvarege();
		}
			break;
		case 4: {
			System.out.println("������� ��������� ����:"); // ���� ���������
															// ������ ��� ������
															// ������ ���� ���
															// ���� ���� �������
			Scanner input = new Scanner(System.in);
			double inputCap = input.nextDouble();
			if (inputCap <= 0) {
				System.out.println("��������� ����� ������ ���� ������ ����");
			} else {
				myStore.setTargetPrice(inputCap);
				myStore.showAllAboveInput();
			}
		}
			break;
		case 5: {
			System.out.println("������� ��������� ����:");  // ���� ���������
															// ������ ��� ������
															// ������ ���� ���
															// ���� ���� �������
			Scanner input = new Scanner(System.in);
			double inputCap = input.nextDouble();
			if (inputCap <= 0) {
				System.out.println("��������� ����� ������ ���� ������ ����");
			} else {
				myStore.setTargetPrice(inputCap);
				myStore.showAllBelowInput();
			}
		}
			break;
		case 6: {
			Goods emptyGoods = new Goods();// �������� ������ ��� ����������
			myStore.addGoodsToStore(emptyGoods);
			System.out.println("����� ��������");
			myStore.showAllGoodss();

		}
			break;

		default:
			System.out.println("�� ����� �������� ��������!");
			break;
		}

	}

}

