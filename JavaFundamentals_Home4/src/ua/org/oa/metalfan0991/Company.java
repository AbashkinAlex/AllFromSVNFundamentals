package ua.org.oa.metalfan0991;

import java.util.ArrayList;

public class Company {

	private String name;
	private ArrayList<Employee> empList = new ArrayList<>(); // �������
																// ArrayList ���
																// ����������
																// ���� ������
																// ��������

	public Company(String string) {
		setName(name);
	}

	public boolean addEmployee(Employee emp) {
		for (Employee employee : empList) {
			if (employee.equals(emp)) {
				return false;

			}
		}
		empList.add(emp);
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(ArrayList<Employee> empList) {
		this.empList = empList;
	}

	// ������� ����� �� �������� ����� ��

	public void calcTotalSalary() {
		double totalSalary = 0;
		for (Employee employee : empList) {
			totalSalary += employee.calculateSalary();
			employee.print();
		}
		System.out.println("Total salary :" + totalSalary);

	}

}
