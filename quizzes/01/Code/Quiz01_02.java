// Run from CS392X1
// javac -cp . quizzes/01/Code/Quiz01_02.java
// // java -cp .:quizzes/01/Code Quiz01_02

public class Quiz01_02 {
    public static boolean solve_3prod(Integer[] A) {
	// Please give a soft quadratic time implementation
	// that solves the 3-prod problem. The function call
	// solve_3prod(A) returns true if and only if there exist
	// distinct indices i, j, and k satisfying A[i]*A[j] = A[k].
	// Why is your implementation soft O(n^2)? Please give a
	// BRIEF explanation

		// In order to implement a soft quadratic time implementation, 
		// you have to create a sorted version of the area (done in n^2 time using selection sort)
		// Then, iterates through the list twice over for i and j (n^2), and uses binary search to 
		// check if there is a k that exists

		// Creating sorted array
		Integer[] sorted = A;
		for(int i = 0; i < sorted.length; i++ ){
			int min = i;
			for(int j = i; j < sorted.length; j++ ){
				if(sorted[j] < sorted[min]) min = j;
			}
			int temp = sorted[i];
			sorted[i] = sorted[min];
			sorted[min] = temp;
		}


		// Looping through A twice
		// Checking if values are present

		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < A.length; j++){
				int k = indexOf(A, (A[i] * A[j]));
				if(k != -1 && k != i && k != j) return true;
			}
		}
	
		return false;


    }

	// A private function implementing binary search
	// O(log(n) time)
	private static int indexOf(Integer[] A, int key) {
		int low = 0;
		int high = A.length - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if ( key < mid) { high = mid - 1; }
			else if ( key > mid ) {low = mid + 1; }
			else{ return mid; }
		}

		return -1;
	}


    public static void main(String[] argv) {
	// Please write some code here for testing solve_3prod
		Integer[] testing_true = {10,9,8,7,6,5,4,3,2,1};
		System.out.println(solve_3prod(testing_true));

		Integer[] testing_false = {30,29,28,27,26,25,24,23,22,21};
		System.out.println(solve_3prod(testing_false));

		return;
    }
}
