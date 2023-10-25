package utility;

import java.util.Comparator;
import java.util.Arrays;
import java.util.Comparator;

import shape.Shape;

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
	
	
		
	public static <T extends Comparable<? super T>> void mergeSort(T[] array) {
	    mergeSort(array, 0, array.length - 1);
	}

	private static <T extends Comparable<? super T>> void mergeSort(T[] array, int left, int right) {
	    if (left < right) {
	        int middle = (left + right) / 2;

	        mergeSort(array, left, middle);
	        mergeSort(array, middle + 1, right);

	        merge(array, left, middle, right);
	    }
	}

	private static <T extends Comparable<? super T>> void merge(T[] array, int left, int middle, int right) {
	    int n1 = middle - left + 1;
	    int n2 = right - middle;

	    T[] leftArray = Arrays.copyOfRange(array, left, left + n1);
	    T[] rightArray = Arrays.copyOfRange(array, middle + 1, middle + 1 + n2);

	    int i = 0, j = 0, k = left;

	    while (i < n1 && j < n2) {
	        if (leftArray[i].compareTo(rightArray[j]) <= 0) {
	            array[k] = leftArray[i];
	            i++;
	        } else {
	            array[k] = rightArray[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < n1) {
	        array[k] = leftArray[i];
	        i++;
	        k++;
	    }

	    while (j < n2) {
	        array[k] = rightArray[j];
	        j++;
	        k++;
	    }
	}

	
	public static <T> void mergeSort(T[] array, Comparator<? super T> c) {
	    mergeSort(array, 0, array.length - 1, c);
	}

	private static <T> void mergeSort(T[] array, int left, int right, Comparator<? super T> c) {
	    if (left < right) {
	        int middle = (left + right) / 2;

	        mergeSort(array, left, middle, c);
	        mergeSort(array, middle + 1, right, c);

	        merge(array, left, middle, right, c);
	    }
	}

	private static <T> void merge(T[] array, int left, int middle, int right, Comparator<? super T> c) {
	    int n1 = middle - left + 1;
	    int n2 = right - middle;

	    T[] leftArray = Arrays.copyOfRange(array, left, left + n1);
	    T[] rightArray = Arrays.copyOfRange(array, middle + 1, middle + 1 + n2);

	    int i = 0, j = 0, k = left;

	    while (i < n1 && j < n2) {
	        if (c.compare(leftArray[i], rightArray[j]) <= 0) {
	            array[k] = leftArray[i];
	            i++;
	        } else {
	            array[k] = rightArray[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < n1) {
	        array[k] = leftArray[i];
	        i++;
	        k++;
	    }

	    while (j < n2) {
	        array[k] = rightArray[j];
	        j++;
	        k++;
	    }
	}

	
	
	//Selection sort algorithm
	public static <T extends Comparable <? super T>> void selectionSort(T[] array) {
		
		int n = array.length;
		 T temp;
	    // One by one move boundary of unsorted subarray
	    for (int i = 0; i < n-1; i++)
	    {
	        // Find the minimum element in unsorted array
	        int min_idx = i;
	        for (int j = i+1; j < n; j++)
	            if (array[j].compareTo(array[min_idx]) <0)
	                min_idx = j;
	
	        // Swap the found minimum element with the first
	        // element
	        temp = array[min_idx];
	        array[min_idx] = array[i];
	        array[i] = temp;
	    }
		
	}
	
	public static <T> void selectionSort(T[] array, Comparator<? super T> c) {
	    int n = array.length;

	    for (int i = 0; i < n - 1; i++) {
	        int min_idx = i;
	        for (int j = i + 1; j < n; j++) {
	            if (c.compare(array[j], array[min_idx]) < 0) {
	                min_idx = j;
	            }
	        }

	        // Swap the found minimum element with the first element
	        T temp = array[min_idx];
	        array[min_idx] = array[i];
	        array[i] = temp;
	    }
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
		 public static <T extends Comparable<? super T>> void shellSort(T[] array) {
		    int n = array.length;

		    // Start with a large gap and reduce it in each iteration
		    for (int gap = n / 2; gap > 0; gap /= 2) {
		        for (int i = gap; i < n; i++) {
		            T temp = array[i];

		            int j;
		            for (j = i; j >= gap && array[j - gap].compareTo(temp) > 0; j -= gap) {
		                array[j] = array[j - gap];
		            }
		            array[j] = temp;
		        }
		    }
		}

	
	
	public static <T> void shellSort(T[] array, Comparator<? super T> c) {
	    int n = array.length;
	    
	    // Start with a large gap and reduce it in each iteration
	    for (int gap = n / 2; gap > 0; gap /= 2) {
	        for (int i = gap; i < n; i++) {
	            T temp = array[i];

	            int j;
	            for (j = i; j >= gap && c.compare(array[j - gap], temp) > 0; j -= gap) {
	                array[j] = array[j - gap];
	            }
	            array[j] = temp;
	        }
	    }
	}
	
}

	

