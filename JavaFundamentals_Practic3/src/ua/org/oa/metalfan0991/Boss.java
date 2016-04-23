package ua.org.oa.metalfan0991;

/*
 * класс Boss - начисляется еженедельный фиксированный оклад 
 независимо от числа отработанных часов;
 */

public class Boss extends Employee {

	private double weekSalary;

	public double getWeekSalary() {
		return weekSalary;
	}

	public void setWeekSalary(double weekSalary) {
		this.weekSalary = weekSalary;
	}

	public Boss(String firstName, String secondName, double weekSalary) {
		super(firstName, secondName);
		setWeekSalary(weekSalary);

	}

	@Override
	public double calculateSalary() {

		return getWeekSalary() * 4;
	}

	@Override
	public String toString() {
		return "Boss [Salary = " + getWeekSalary() + ", FirstName = "
				+ getFirstName() + ", SecondName = " + getSecondName() + "]";
	}

}
