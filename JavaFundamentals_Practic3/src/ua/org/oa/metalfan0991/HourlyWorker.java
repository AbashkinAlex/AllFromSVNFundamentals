package ua.org.oa.metalfan0991;

/*
 * класс HourlyWorker - служащим начисляется почасовая з/п за часы,
 отработанные в основное время, и повышенная плата за часы, 
 отработанные сверхурочно;
 */

public class HourlyWorker extends Employee {

	int hourNorma; // норма по отработки (в часах) за месяц
	int hour; // все отработанные часы за месяц

	int hourSalary; // расценка за отработанный час не в переработки
	int overHourSalary; // почасовая расценка во время переработки

	public int getHourNorma() {
		return hourNorma;
	}

	public void setHourNorma(int hourNorma) {
		this.hourNorma = hourNorma;
	}

	public int getOverHourSalary() {
		return overHourSalary;
	}

	public void setOverHourSalary(int overHourSalary) {
		this.overHourSalary = overHourSalary;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(int hourSalary) {
		this.hourSalary = hourSalary;
	}

	public HourlyWorker(String firstName, String secondName, int hourNorma,
			int hour, int hourSalary, int overHourSalary) {
		super(firstName, secondName);
		setHour(hour);
		setHourSalary(hourSalary);
		setHourNorma(hour);
		setOverHourSalary(hourSalary);

	}

	@Override
	double calculateSalary() {
		if (hour < hourNorma) {
			return hour * hourSalary;
		} else {
			return (((hour - hourNorma) * overHourSalary) + (hourNorma * hourSalary));
		}
	}

	@Override
	public String toString() {
		return "HourlyWorker [Hour = " + getHour() + ", HourSalary = "
				+ getHourSalary() + ", FirstName = " + getFirstName()
				+ ", SecondName = " + getSecondName() + "]";
	}

}
