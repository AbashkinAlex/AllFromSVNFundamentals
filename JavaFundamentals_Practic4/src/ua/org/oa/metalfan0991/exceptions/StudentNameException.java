package ua.org.oa.metalfan0991.exceptions;

public class StudentNameException extends Exception {

	public StudentNameException() {
		toString();
	}

	@Override
	public String toString() {
		return "\n"+"\n"+ "Было неправильно введено имя студента!"+"\n";
	}


}
