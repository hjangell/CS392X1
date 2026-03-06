//
// HX-2026-03-04: 30 points
// This one may seem easy but can be time-consuming
// if you use a brute-force approach.
// Hint: Try to think about implementing bubble-sort
// without recursion
//

// Run from CS392X1
// javac -cp . quizzes/01/MySolution/Quiz01_03.java
// java -cp .:quizzes/01/MySolution Quiz01_03


public class Quiz01_03 {
    public static <T extends Comparable<T>> T[] sort20WithNoRecursion
	(T x00, T x01, T x02, T x03, T x04, T x05, T x06, T x07, T x08, T x09,
	 T x10, T x11, T x12, T x13, T x14, T x15, T x16, T x17, T x18, T x19) {
	// HX-2026-03-03:
	// Given 20 arguments,
	// please return an array of size 20 containing the
	// 20 arguments sorted according to the order implemented by
	// compareTo on T.
	// HX: No recursion is allowed for this one
	// HX: No loops (either while-loop or for-loop) is allowed.
	// HX: Yes, you can use functions (but not recursive functions)
	// HX: Please do not try to write a HUGE if-then-else mumble jumble!
		
		// Creates array of T
		T[] arr = (T[]) new Comparable[20];
		arr[0] = x00; arr[1] = x01; arr[2] = x02; arr[3] = x03;
		arr[4] = x04; arr[5] = x05; arr[6] = x06; arr[7] = x07;
		arr[8] = x08; arr[9] = x09; arr[10] = x10; arr[11] = x11; 
		arr[12] = x12; arr[13] = x13; arr[14] = x14; arr[15] = x15; 
		arr[16] = x16; arr[17] = x17; arr[18] = x18; arr[19] = x19; 

		// Iterates through using bubble sort swapping method
		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); swap(arr, 8, 9); swap(arr, 9, 10);
		swap(arr, 10, 11); swap(arr, 11, 12); swap(arr, 12, 13); swap(arr, 13, 14); swap(arr, 14, 15);
		swap(arr, 15, 16); swap(arr, 16, 17); swap(arr, 17, 18); swap(arr, 18, 19); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); swap(arr, 8, 9); swap(arr, 9, 10);
		swap(arr, 10, 11); swap(arr, 11, 12); swap(arr, 12, 13); swap(arr, 13, 14); swap(arr, 14, 15);
		swap(arr, 15, 16); swap(arr, 16, 17); swap(arr, 17, 18); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); swap(arr, 8, 9); swap(arr, 9, 10);
		swap(arr, 10, 11); swap(arr, 11, 12); swap(arr, 12, 13); swap(arr, 13, 14); swap(arr, 14, 15);
		swap(arr, 15, 16); swap(arr, 16, 17); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); swap(arr, 8, 9); swap(arr, 9, 10);
		swap(arr, 10, 11); swap(arr, 11, 12); swap(arr, 12, 13); swap(arr, 13, 14); swap(arr, 14, 15);
		swap(arr, 15, 16); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); swap(arr, 8, 9); swap(arr, 9, 10);
		swap(arr, 10, 11); swap(arr, 11, 12); swap(arr, 12, 13); swap(arr, 13, 14); swap(arr, 14, 15);

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); swap(arr, 8, 9); swap(arr, 9, 10);
		swap(arr, 10, 11); swap(arr, 11, 12); swap(arr, 12, 13); swap(arr, 13, 14); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); swap(arr, 8, 9); swap(arr, 9, 10);
		swap(arr, 10, 11); swap(arr, 11, 12); swap(arr, 12, 13); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); swap(arr, 8, 9); swap(arr, 9, 10);
		swap(arr, 10, 11); swap(arr, 11, 12); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); swap(arr, 8, 9); swap(arr, 9, 10);
		swap(arr, 10, 11); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); swap(arr, 8, 9); swap(arr, 9, 10);

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); swap(arr, 8, 9); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); swap(arr, 7, 8); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); swap(arr, 6, 7); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);
		swap(arr, 5, 6); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); swap(arr, 4, 5);

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); swap(arr, 3, 4); 

		swap(arr, 0, 1); swap(arr, 1, 2); swap(arr, 2, 3); 

		swap(arr, 0, 1); swap(arr, 1, 2); 

		swap(arr, 0, 1); 

		return arr;

    }

	private static <T extends Comparable<T>> void swap(T[] A, int i, int j) {
		if(A[i].compareTo( A[j] ) > 0){
			T temp = A[i];
			A[i] = A[j];
			A[j] = temp;
		}
	}



    public static void main (String[] args) {
	// HX-2025-10-12:
	// Please write minimal testing code for sort20WithNoRecursion.
	Comparable[] int_list = sort20WithNoRecursion(20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1);
	
	// Testing if sorted
	for(int i = 0; i < int_list.length; i++) System.out.print(int_list[i] + ", ");
	System.out.println();

	return;

    }
}
