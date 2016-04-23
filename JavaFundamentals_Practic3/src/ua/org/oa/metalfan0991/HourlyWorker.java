package ua.org.oa.metalfan0991;

/*
 * ����� HourlyWorker - �������� ����������� ��������� �/� �� ����,
 ������������ � �������� �����, � ���������� ����� �� ����, 
 ������������ �����������;
 */

public class HourlyWorker extends Employee {

	int hourNorma; // ����� �� ��������� (� �����) �� �����
	int hour; // ��� ������������ ���� �� �����

	int hourSalary; // �������� �� ������������ ��� �� � �����������
	int overHourSalary; // ��������� �������� �� ����� �����������

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
