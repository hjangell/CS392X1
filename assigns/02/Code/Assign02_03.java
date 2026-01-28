public class Assign02_03 {
    public static boolean solve_3sum(Integer[] A) {
	// Please give a soft qudratic time implementation
	// that solves the 3-sum problem. The function call
	// solve_3sum(A) returns true if and only if there exist
	// distinct indices i, j, and k satisfying A[i]+A[j] = A[k].
	// Why is your implementation soft O(n^2)?

	for(int i = 0; i < A.length - 1; i++){
		for(int j = i + 1; j < A.length; j++){
			int k = Assign02_02.indexOf(A, (A[i] + A[j]));
			if(k != -1 && k != i) return true;
		}
	}

	return false;

    }


    public static void main(String[] argv) {
	// Please write some code here for testing solve_3sum
		Integer[] testing_true = {1,22,35,43,50,60,70,80,93,100};
		System.out.println(solve_3sum(testing_true));

		Integer[] testing_false = {1,22,35,43,50,60,70,80,94,100};
		System.out.println(solve_3sum(testing_false));

    }
}
