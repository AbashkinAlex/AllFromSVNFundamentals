package ua.org.oa.metalfan0991.exceptions;

public class StudentAgeException extends Exception {

	public StudentAgeException() {
		toString();
	}

	@Override
	public String toString() {
		return "\n"+"\n"+ "Был неправильно введен возраст студента!"+"\n";
	}

}
