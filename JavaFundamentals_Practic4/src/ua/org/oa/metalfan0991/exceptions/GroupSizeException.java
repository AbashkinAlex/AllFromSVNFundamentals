package ua.org.oa.metalfan0991.exceptions;

public class GroupSizeException extends Exception {

	public GroupSizeException() {
		toString();
	}

	@Override
	public String toString() {
		return "\n"+"\n"+ "Был неправильно введен размер группы!"+"\n";
	}

}
