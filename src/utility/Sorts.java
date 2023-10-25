package utility;

import java.util.Comparator;

import shape.Shape;

public class Sorts {
	//Bubble sort algorithm
	public static <T extends Comparable <? super T>> void bubbleSort(T[] array) {
		int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }}}
	}
	
	public static <T> void bubbleSort(T[] array, Comparator<? super T> c) {
		int i, j;
		T temp;
        boolean swapped;
        for (i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (j = 0; j < array.length - i - 1; j++) {
                if (c.compare(array[j],array[j+1]) > 0) {
                     
                    // Swap arr[j] and arr[j+1]
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
	}}
	
	//Insertion sort algorithm
	public static <T extends Comparable <? super T>> void insertionSort(Shape[] array) {
		int n = array.length;
	    for (int i = 1; i < n; i++) {
	        Shape key = array[i];
	        int j = i - 1;
	        while (j >= 0 && array[j].getHeight() > key.getHeight()) {
	            array[j + 1] = array[j];
	            j--;
	        }
	        array[j + 1] = key;
	    }
	}
	
	public static <T> void insertionSort(Shape[] array, Comparator<? super Shape> c) {
		int n = array.length;
	    for (int i = 1; i < n; i++) {
	        Shape key = array[i];
	        int j = i - 1;
	        while (j >= 0 && c.compare(array[j], key)>0) {
	            array[j + 1] = array[j];
	            j--;
	        }
	        array[j + 1] = key;
	    }
	}
	
	
	//Merge sort algorithm
	public static <T extends Comparable <? super T>> void mergeSort(T[] array) {
		
	}
	
	public static <T> void mergeSort(T[] array, Comparator<? super T> c) {
		
	}
	
	
	//Selection sort algorithm
	public static <T extends Comparable <? super T>> void selectionSort(T[] array) {
		
	}
	
	public static <T> void selectionSort(T[] array, Comparator<? super T> c) {
		
	}
	
	
	//Quick sort algorithm
	public static <T extends Comparable <? super T>> void quickSort(Shape[] array , int low, int high) {
		if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
	}
	
	
	public static <T> void quickSort(Shape[] array, Comparator<? super T> c, int low, int high) {
		if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
	}
	
		//Methods for quickSort
	 public static int partition(Shape[] arr, int low, int high) {
	        Shape pivot = arr[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (arr[j].compareTo(pivot) < 0) {
	                i++;
	                // Swap arr[i] and arr[j]
	                Shape temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        Shape temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }
	
	
	
	//Shell sort algorithm, algorithm of choice
	public static <T extends Comparable <? super T>> void shellSort(T[] array) {
		
	}
	
	public static <T> void shellSort(T[] array, Comparator<? super T> c) {
		
	}
	
}
