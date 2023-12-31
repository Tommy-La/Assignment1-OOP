package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import shape.*;
import utility.*;
public class TestingMain {

	public static void main(String[] args) {
		// Get the file location
		/*String [] arguments = new String[3];
		arguments[0] ="-fC:\\Class\\Semester3\\OOP-CPRG-304-D\\Assignment\\polyfor3.txt" ;
		arguments[1] ="-th";
		arguments[2] ="-sb";
		
		
		
		new SortManager(arguments);
		*/
		// Read the file provided in to an array
		
		
		
		
		
		
		
		
		// Create an array of Shape
		Cone s1 = new Cone(12,5);
		Cylinder s2 = new Cylinder(13,8);
		Pyramid s3 = new Pyramid(100,6);
		Pyramid s4 = new Pyramid(1,0);
		Pyramid s5 = new Pyramid(30,60);
		Pyramid s6 = new Pyramid(1,0);
		Pyramid s7 = new Pyramid(30,66);
		Shape[] sa =new Shape[7];
		
		sa[0] = s1;
		sa[1] = s2;
		sa[2] = s3;
		sa[3] = s4;
		sa[4] = s5;
		sa[5] = s6;
		sa[6] = s7;
		
		Sorts.quickSort(sa, new BaseAreaComparator(), 0, sa.length - 1);
		System.out.println("Sorted array: ");
		System.out.println(sa[0].getBaseArea() );
		System.out.println(sa[1].getBaseArea() );
		System.out.println(sa[2].getBaseArea() );
		System.out.println(sa[3].getBaseArea() );
		System.out.println(sa[4].getBaseArea() );
		System.out.println(sa[5].getBaseArea() );
		System.out.println(sa[6].getBaseArea() );
		
		Sorts.quickSort(sa, 0, sa.length - 1);
		System.out.println("Sorted array: ");
		System.out.println(sa[0].getHeight() );
		System.out.println(sa[1].getHeight() );
		System.out.println(sa[2].getHeight() );
		System.out.println(sa[3].getHeight() );
		System.out.println(sa[4].getHeight() );
		System.out.println(sa[5].getHeight() );
		System.out.println(sa[6].getHeight() );
		
		fillShapes();
		
		
	}
	
	static String fileName =  "C:\\Class\\Semester3\\OOP-CPRG-304-D\\Assignment\\polyfor1.txt";
	private static void fillShapes() {
		String[] fileData = null;
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			if (line != null) {
				fileData = line.split(" ");
			}
			else {
				System.out.println("File is empty");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int arraySize = Integer.parseInt(fileData[0]);
		//Resize the array
		Shape[] shapeArray = new Shape[arraySize];
		//*************************************
		//*************************************
		
		int dataIndex = 1;//start reading data from index 1
		
		for (int i = 0; i < arraySize; i++) {
			String shapeType = fileData[dataIndex];
			double value1 = Double.parseDouble(fileData[dataIndex + 1]);
			double value2 = Double.parseDouble(fileData[dataIndex + 2]);
			switch(shapeType) {
			case "Cone":
                shapeArray[i] = new Cone(value1, value2);
                break;
            case "Cylinder":
            	shapeArray[i] = new Cylinder(value1, value2);
                break;
            case "Pyramid":
            	shapeArray[i] = new Pyramid(value1, value2);
                break;
            case "OctagonalPrism":
            	shapeArray[i] = new OctagonalPrism(value1, value2);
                break;
            case "PentagonalPrism":
            	shapeArray[i] = new PentagonalPrism(value1, value2);
                break;
            case "SquarePrism":
            	shapeArray[i] = new SquarePrism(value1, value2);
                break;
            case "TriangularPrism":
            	shapeArray[i] = new TriangularPrism(value1, value2);
                break;
			}
			dataIndex += 3;		
			
			
			
		}
		System.out.println(shapeArray.length);
	}
		
}
