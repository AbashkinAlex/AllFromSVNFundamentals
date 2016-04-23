package ua.org.oa.metalfan0991;

/*
 * ������� ������� ������� ���������� ����� �� �����������.
 ������� ������� ����� Employee. ����������� ������ �� �������� 
 ������ Employee ��������:
 ����� Boss - ����������� ������������ ������������� ����� 
 ���������� �� ����� ������������ �����;
 ����� HourlyWorker - �������� ����������� ��������� �/� �� ����,
 ������������ � �������� �����, � ���������� ����� �� ����, 
 ������������ �����������;
 ����� PieceWorker - �������� ����������� �������� ����� �� 
 ���������� ������������� �������;
 ����� CommissionWorker - �������� ����������� ������� �/� ���� 
 ������������ ������� �� ������.
 � ������� ������ ���������� 2 ������: ������ �/� ���������� � ����� 
 �� ����� ����� � ������� ��������. � ������� ��������� ��������
 ��������� ���������� ���� ����� ��������.
 ����� ������� ������ ��� ArrayList ���� Employee � �������� ���� 
 ������ �������.
 �������� ������� ������� ����� ����� ������� � ����� ���� 
 �������.
 */

abstract public class Employee {
	private String firstName;
	private String secondName;

	abstract double calculateSalary();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Employee(String firstName, String secondName) {
		setFirstName(firstName);
		setSecondName(secondName);
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", secondName="
				+ secondName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((secondName == null) ? 0 : secondName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}

	public void print() {
		System.out.println(toString() + " salary " + calculateSalary());
	}

}
