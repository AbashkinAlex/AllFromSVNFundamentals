package ua.org.oa.metalfan0991;

public class App {

	public static void main(String[] args) {
		  Company target = new Company("Target");
		  System.out.println(target.addEmployee(new Boss("Sasha", "Ivanov", 25000)));
		  System.out.println(target.addEmployee(new CommissionWorker("Kolya", "Petrov", 10000, 2)));
		  System.out.println(target.addEmployee(new PieceWorker("Andrey", "Sidorov", 22, 200)));
		  System.out.println(target.addEmployee(new HourlyWorker("Igor", "Bondarenko", 25, 8, 5, 25)));
		  System.out.println(target.getEmpList());
		  target.calcTotalSalary();
		 }
}
