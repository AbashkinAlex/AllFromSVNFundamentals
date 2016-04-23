package ua.org.oa.metalfan0991;

import java.util.ArrayList;

public class Company {

	private String name;
	private ArrayList<Employee> empList = new ArrayList<>(); // создаем
																// ArrayList для
																// добавления
																// туда разных
																// объектов

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

	// создаем метод по рассчету общей ЗП

	public void calcTotalSalary() {
		double totalSalary = 0;
		for (Employee employee : empList) {
			totalSalary += employee.calculateSalary();
			employee.print();
		}
		System.out.println("Total salary :" + totalSalary);

	}

}
