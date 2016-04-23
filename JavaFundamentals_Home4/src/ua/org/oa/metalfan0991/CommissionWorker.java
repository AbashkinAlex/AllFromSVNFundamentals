package ua.org.oa.metalfan0991;

/*
 * класс CommissionWorker - служащим начисляется базовая з/п плюс 
 комиссионный процент от продаж.
 */

public class CommissionWorker extends Employee {

	double mainSalary; // заработная плата
	double sales; // продажы
	public static final double percent = 10; //процент от продаж

	public CommissionWorker(String firstName, String secondName,
			int mainSalary, int sales) {
		super(firstName, secondName);
		setMainSalary(mainSalary);
		setSales(sales);

	}

	public double getMainSalary() {
		return mainSalary;
	}

	public void setMainSalary(double mainSalary) {
		this.mainSalary = mainSalary;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public static double getPersent() {
		return percent;
	}

	@Override
	double calculateSalary() {
		return getMainSalary() + getSales() / 100 * percent;
	}

	@Override
	public String toString() {
		return "CommissionWorker [MainSalary = " + getMainSalary()
				+ ", Percent= " + getPersent() + ", FirstName = "
				+ getFirstName() + ", SecondName = " + getSecondName() + "]";
	}
}
