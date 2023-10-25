package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import shape.*;
import utility.*;

public class SortManager {
	private String fileName;
	private String compareType;
	private String sortType;
	//private Shape[] shapeArray;
	//Shape[] shapeArray = new Shape[10];
	
	public SortManager(String[] args) {
		
		//Determine file location
		if (args[0].toLowerCase().startsWith("-f")) 
		{
			fileName = args[0].substring(2);
		}
		if (args[1].toLowerCase().startsWith("-f")) 
		{
			fileName = args[1].substring(2);
		}
		else if (args[2].toLowerCase().startsWith("-f")) 
		{
			fileName = args[2].substring(2);
		}
		
		//Determine the compare type
		if (args[0].toLowerCase().startsWith("-t")) 
		{
			compareType = args[0].substring(2).toLowerCase();
		}
		if (args[1].toLowerCase().startsWith("-t")) 
		{
			compareType = args[1].substring(2).toLowerCase();
		}
		else if (args[2].toLowerCase().startsWith("-t")) 
		{
			compareType = args[2].substring(2).toLowerCase();
		}
		
		//Determine which sorting algorithm to use
		if (args[0].toLowerCase().startsWith("-s")) 
		{
			sortType = args[0].substring(2).toLowerCase();
		}
		if (args[1].toLowerCase().startsWith("-s")) 
		{
			sortType = args[1].substring(2).toLowerCase();
		}
		else if (args[2].toLowerCase().startsWith("-s")) 
		{
			sortType = args[2].substring(2).toLowerCase();
		}
		
		sortShapes(fillShapes());
	}
		
	
		//Read from file and fill array
		private Shape[] fillShapes() {
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
			// Array to store the data
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
			return shapeArray;
		}
				
			
			private void sortShapes(Shape[] shapeArray) {
				//Start time for Algorithm performance
				 long startTime = System.currentTimeMillis();
			        
				//Sorting Algorithm
				if (sortType == "b" || sortType == "B") {
					if(compareType == "H" || compareType == "h") {
						Sorts.bubbleSort(shapeArray);
					}
					else if(compareType == "V" || compareType =="v") {
						Sorts.bubbleSort(shapeArray, new VolumeComparator());
					}
					else if(compareType == "A" || compareType == "a") {
						Sorts.bubbleSort(shapeArray, new BaseAreaComparator());
					}
					for (int i = 1; i < shapeArray.length - 1; i += 1000) {
						System.out.println("Every Thousandth Value: " + shapeArray[i]);
					};
				}
				else if (sortType == "q" || sortType == "Q") {
					if(compareType == "H" || compareType == "h") {
						Sorts.quickSort(shapeArray, 0, shapeArray.length - 1);
					}
					else if(compareType == "V" || compareType =="v") {
						Sorts.quickSort(shapeArray, new VolumeComparator(), 0, shapeArray.length - 1);
					}
					else if(compareType == "A" || compareType == "a") {
						Sorts.quickSort(shapeArray, new BaseAreaComparator(), 0, shapeArray.length - 1);
					}
					for (int i = 1; i < shapeArray.length - 1; i += 1000) {
						System.out.println("Every Thousandth Value: " + shapeArray[i]);
					};
				}
				else if (sortType == "s" || sortType == "S") {
					if(compareType == "H" || compareType == "h") {
						Sorts.selectionSort(shapeArray);
					}
					else if(compareType == "V" || compareType =="v") {
						Sorts.selectionSort(shapeArray, new VolumeComparator());
					}
					else if(compareType == "A" || compareType == "a") {
						Sorts.selectionSort(shapeArray, new BaseAreaComparator());
					}
				}
				else if (sortType == "i" || sortType == "I") {
					if(compareType == "H" || compareType == "h") {
						Sorts.insertionSort(shapeArray);
					}
					else if(compareType == "V" || compareType =="v") {
						Sorts.insertionSort(shapeArray, new VolumeComparator());
					}
					else if(compareType == "A" || compareType == "a") {
						Sorts.insertionSort(shapeArray, new BaseAreaComparator());
					}
				}
				else if (sortType == "m" || sortType == "M") {
					if(compareType == "H" || compareType == "h") {
						Sorts.mergeSort(shapeArray);
					}
					else if(compareType == "V" || compareType =="v") {
						Sorts.mergeSort(shapeArray, new VolumeComparator());
					}
					else if(compareType == "A" || compareType == "a") {
						Sorts.mergeSort(shapeArray, new BaseAreaComparator());
					}
				}
				else if (sortType == "z" || sortType == "Z") {
					if(compareType == "H" || compareType == "h") {
						Sorts.shellSort(shapeArray);
					}
					else if(compareType == "V" || compareType =="v") {
						Sorts.shellSort(shapeArray, new VolumeComparator());
					}
					else if(compareType == "A" || compareType == "a") {
						Sorts.shellSort(shapeArray, new BaseAreaComparator());
					}
				};
				
				//Get Algorithm end time
				long endTime = System.currentTimeMillis();
		        long elapsedTime = endTime - startTime;
		        System.out.println("Time elapsed: " + elapsedTime + " milliseconds");
		        System.out.println(fileName);
		        System.out.println("Comparing "+compareType);
		        System.out.println("Sort with "+sortType);
		        for (int i = 1; i < shapeArray.length - 1; i += 1000) {
					System.out.println("Every Thousandth Value: " + shapeArray[i]);
				};
				// Print out the first, every thousands, last values of the sorted array
				//if(compareType == "H" || compareType == "h") {
					/*if (shapeArray.length > 0) {
						System.out.println("First Sorted Value: " + shapeArray[0]);
					};
					for (int i = 1; i < shapeArray.length - 1; i += 1000) {
						System.out.println("Every Thousandth Value: " + shapeArray[i]);
					};
					if (shapeArray.length > 0) {
						System.out.println("Last Sorted Value: " + shapeArray[shapeArray.length - 1]);
					};*/
				//}
				/*else if(compareType == "V" || compareType =="v") {
					if (shapeArray.length > 0) {
						System.out.println("First Sorted Value: " + shapeArray[0].getVolume());
					}
					for (int i = 1; i < shapeArray.length - 1; i += 1000) {
						System.out.println("Every Thousandth Value: " + shapeArray[i].getVolume());
					}
					if (shapeArray.length > 0) {
						System.out.println("Last Sorted Value: " + shapeArray[shapeArray.length - 1].getVolume());
					}
				}
				else if(compareType == "A" || compareType == "a") {
					if (shapeArray.length > 0) {
						System.out.println("First Sorted Value: " + shapeArray[0].getBaseArea());
					}
					for (int i = 1; i < shapeArray.length - 1; i += 1000) {
						System.out.println("Every Thousandth Value: " + shapeArray[i].getBaseArea());
					}
					if (shapeArray.length > 0) {
						System.out.println("Last Sorted Value: " + shapeArray[shapeArray.length - 1].getBaseArea());
					}
				}*/
			}
	}

