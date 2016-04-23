package ua.org.oa.metalfan0991;

import java.util.ArrayList;


public class Store {

	private double targetPrice; 				// ��������� ���� ��� ���������
	private double averagePriceAllGoodss; 		// ������� ���������� ��������� ������
	private double sumPriceAllGoodss;			// ��������� ��������� ���� ������� � ��������
	static ArrayList<Goods> myGoodss = new ArrayList<Goods>();// ������ ��������
															// �������� �������

	public double getTargetPrice() {
		return targetPrice;
	}

	public void setTargetPrice(double targetPrice) {
		this.targetPrice = targetPrice;
	}

	public void calculateAveragePriceAllGoodss()// ������� ������� ����������
												// ��������� �������
	{

		sumPriceAllGoodss = 0;
		for (Goods el : myGoodss) {
			sumPriceAllGoodss += el.getDepreciatedCost();
		}
		averagePriceAllGoodss = sumPriceAllGoodss / myGoodss.size();
		System.out.println("������� ���������� ��������� ������� ��������:");
		System.out.printf("%4.2f", averagePriceAllGoodss);
		System.out.println();
	}

	public void showAllGoodssAboveAvarege() {
		System.out.println("������, ���������� ��������� �������, ���� ������� �� ��������:");

		for (Goods el : myGoodss) {
			if (el.getDepreciatedCost() > averagePriceAllGoodss) {

				System.out.println(el.getGoodsName());
				System.out.println(el.getAuthor());
				System.out.printf("%4.2f", el.getNewGoodsPrice());
				System.out.println();
				System.out.printf("%4.2f", el.getDepreciatedCost());
				System.out.println();
				System.out.println("------------------------");
			}
		}
	}

	public void showAllGoodssBelowAvarege() {
		System.out.println("������, ���������� ��������� �������, ���� ������� �� ��������:");

		for (Goods el : myGoodss) {
			if (el.getDepreciatedCost() < averagePriceAllGoodss) {

				System.out.println(el.getGoodsName());
				System.out.println(el.getAuthor());
				System.out.printf("%4.2f", el.getNewGoodsPrice());
				System.out.println();
				System.out.printf("%4.2f", el.getDepreciatedCost());
				System.out.println();
				System.out.println("------------------------");
			}
		}
	}

	public void showAllAboveInput() {
		System.out.print("������, ���������� ��������� �������, ���� �������� ����:");
		System.out.printf("%4.2f", targetPrice);
		System.out.println();

		for (Goods el : myGoodss) {
			if (el.getDepreciatedCost() > targetPrice) {

				System.out.println(el.getGoodsName());
				System.out.println(el.getAuthor());
				System.out.printf("%4.2f", el.getNewGoodsPrice());
				System.out.println();
				System.out.printf("%4.2f", el.getDepreciatedCost());
				System.out.println();
				System.out.println("------------------------");
			}
		}
	}

	public void showAllBelowInput() {
		System.out.print("������, ���������� ��������� �������, ���� �������� ����:");
		System.out.printf("%4.2f", targetPrice);
		System.out.println();

		for (Goods el : myGoodss) {
			if (el.getDepreciatedCost() < targetPrice) {

				System.out.println(el.getGoodsName());
				System.out.println(el.getAuthor());
				System.out.printf("%4.2f", el.getNewGoodsPrice());
				System.out.println();
				System.out.printf("%4.2f", el.getDepreciatedCost());
				System.out.println();
				System.out.println("------------------------");
			}
		}
	}

	public void showAllGoodss() {
		for (Goods el : myGoodss) {
			System.out.println("------------------------");
			System.out.println(el.getGoodsName());
			System.out.println(el.getAuthor());
			System.out.printf("%4.2f", el.getNewGoodsPrice());
			System.out.println();
			System.out.printf("%4.2f", el.getDepreciatedCost());
			System.out.println();

		}

	}

	public void addGoodsToStore(Goods addingGoods)// ���������� ������ �
													// ������(����������)
	{

		myGoodss.add(addingGoods);
	}

}


