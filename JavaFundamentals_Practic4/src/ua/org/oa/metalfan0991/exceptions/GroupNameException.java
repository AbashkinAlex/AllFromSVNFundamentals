package ua.org.oa.metalfan0991.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class GroupNameException extends Exception {

	public GroupNameException() {
		toString();
	}

	@Override
	public String toString() {
		return "\n"+"\n"+ "Было неправильно введено имя группы!"+"\n";
	}

}
