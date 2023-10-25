package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import shape.*;
import utility.*;
public class Driver {

	public static void main(String[] args) {
		// Get the file location
		String [] arguments = new String[3];
		arguments[0] ="-fC:\\Class\\Semester3\\OOP-CPRG-304-D\\Assignment\\polyfor1.txt" ;
		arguments[1] ="-th";
		arguments[2] ="-sb";
		
		
		
		new SortManager(arguments);
	}
}
