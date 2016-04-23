package ua.org.oa.metalfan0991;

import java.util.ArrayList;


public class Store {

	private double targetPrice; 				// введенна€ цена дл€ рассчетов
	private double averagePriceAllGoodss; 		// средн€€ остаточна€ стоимость товара
	private double sumPriceAllGoodss;			// суммарна€ стоимость всех товаров в магазине
	static ArrayList<Goods> myGoodss = new ArrayList<Goods>();// массив хранени€
															// объектов товаров

	public double getTargetPrice() {
		return targetPrice;
	}

	public void setTargetPrice(double targetPrice) {
		this.targetPrice = targetPrice;
	}

	public void calculateAveragePriceAllGoodss()// подсчет средней остаточной
												// стоимости товаров
	{

		sumPriceAllGoodss = 0;
		for (Goods el : myGoodss) {
			sumPriceAllGoodss += el.getDepreciatedCost();
		}
		averagePriceAllGoodss = sumPriceAllGoodss / myGoodss.size();
		System.out.println("—редн€€ остаточна€ стоимость товаров магазина:");
		System.out.printf("%4.2f", averagePriceAllGoodss);
		System.out.println();
	}

	public void showAllGoodssAboveAvarege() {
		System.out.println("“овары, остаточна€ стоимость которых, выше средней по магазину:");

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
		System.out.println("“овары, остаточна€ стоимость которых, ниже средней по магазину:");

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
		System.out.print("“овары, остаточна€ стоимость которых, выше введеной цены:");
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
		System.out.print("“овары, остаточна€ стоимость которых, ниже введеной цены:");
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

	public void addGoodsToStore(Goods addingGoods)// добавление товара в
													// массив(библиотеку)
	{

		myGoodss.add(addingGoods);
	}

}


