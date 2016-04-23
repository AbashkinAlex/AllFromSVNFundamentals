package ua.org.oa.metalfan0991;

import java.util.Scanner;

public class Goods {
private String GoodsName;			//�������� ������
private String author;				//�������������
private double newGoodsPrice;		//"������" ����
private double depreciatedCost;		// ���������� ���������
private int GoodsRealeseYear;		// ��� ������� ������
private int nowYear = 2015;			// ������� ���
private int ageOfGoodsLimit = 20;	// ���� �������� ������

public double getNewGoodsPrice() {
	return newGoodsPrice;
}

public void setNewGoodsPrice(double newGoodsPrice) {
	this.newGoodsPrice = newGoodsPrice;
}

public String getGoodsName() {
	return GoodsName;
}

public void setGoodsName(String GoodsName) {

	this.GoodsName = GoodsName;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public int getGoodsRealeseYear() {
	return GoodsRealeseYear;
}

public void setGoodsRealeseYear(int GoodsRealeseYear) {
	this.GoodsRealeseYear = GoodsRealeseYear;
}

public double getDepreciatedCost() {
	return depreciatedCost;
}

public void setDepreciatedCost(double depreciatedCost) {
	this.depreciatedCost = depreciatedCost;
}

public Goods()// ���������������� ����������� ���������� ������ ������
{
	Scanner in = new Scanner(System.in);
	System.out.println("������� �������� ������:");
	setGoodsName(in.nextLine());
	System.out.println("������� ������������� ������:");
	setAuthor(in.nextLine());
	System.out.println("������� ���� ������:");
	setNewGoodsPrice(in.nextDouble());
	System.out.println("������� ��� ������� ������:");
	setGoodsRealeseYear(in.nextInt());

	this.calcDepreciatedCost();
}

public Goods(String GoodsName, String author, double newGoodsPrice,
		int GoodsRealeseYear)// ���������� ������ ������
{
	setGoodsName(GoodsName);
	setAuthor(author);
	setNewGoodsPrice(newGoodsPrice);
	setGoodsRealeseYear(GoodsRealeseYear);

	this.calcDepreciatedCost();
}

public void calcDepreciatedCost()// ������ ���������� ��������� ������
{

	if ((nowYear - GoodsRealeseYear) >= ageOfGoodsLimit) {
		depreciatedCost = newGoodsPrice - 0.99 * newGoodsPrice;
	} else {
		depreciatedCost = newGoodsPrice- ((nowYear - GoodsRealeseYear) / (double) ageOfGoodsLimit)	* newGoodsPrice;
	}

}

}