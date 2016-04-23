package ua.org.oa.metalfan0991;

import java.util.Scanner;

public class Goods {
private String GoodsName;			//название товара
private String author;				//производитель
private double newGoodsPrice;		//"первая" цена
private double depreciatedCost;		// остаточная стоимость
private int GoodsRealeseYear;		// год выпуска товара
private int nowYear = 2015;			// текущий год
private int ageOfGoodsLimit = 20;	// срок годности товара

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

public Goods()// переопределенный конструктор добавления нового товара
{
	Scanner in = new Scanner(System.in);
	System.out.println("Введите название товара:");
	setGoodsName(in.nextLine());
	System.out.println("Введите производителя товара:");
	setAuthor(in.nextLine());
	System.out.println("Введите цену товара:");
	setNewGoodsPrice(in.nextDouble());
	System.out.println("Введите год выпуска товара:");
	setGoodsRealeseYear(in.nextInt());

	this.calcDepreciatedCost();
}

public Goods(String GoodsName, String author, double newGoodsPrice,
		int GoodsRealeseYear)// добавление нового товара
{
	setGoodsName(GoodsName);
	setAuthor(author);
	setNewGoodsPrice(newGoodsPrice);
	setGoodsRealeseYear(GoodsRealeseYear);

	this.calcDepreciatedCost();
}

public void calcDepreciatedCost()// расчет остаточной стоимости товара
{

	if ((nowYear - GoodsRealeseYear) >= ageOfGoodsLimit) {
		depreciatedCost = newGoodsPrice - 0.99 * newGoodsPrice;
	} else {
		depreciatedCost = newGoodsPrice- ((nowYear - GoodsRealeseYear) / (double) ageOfGoodsLimit)	* newGoodsPrice;
	}

}

}