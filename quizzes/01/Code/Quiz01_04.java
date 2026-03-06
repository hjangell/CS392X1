//
// HX: 50 points
//


// Run from CS392X1
// javac -cp . quizzes/01/Code/Quiz01_04.java quizzes/01/Code/LnList.java
// java -cp .:quizzes/01/Code Quiz01_04

public class Quiz01_04 {
    public static <T extends Comparable<T>> LnList<T> LnListInsertSort(LnList<T> xs) {
		// HX-2025-10-12:
		// Please implement (stable) insertion sort on a
		// linked list (LnList).
		// Note that you are not allowed to modify the definition
		// of the LnList class. You can only use the public methods
		// provided by the LnList class; you cannot use any constructors
		// in LnList

		LnList<T> sorted = new LnList<>();
		LnList<T> tail = null; 

		while (xs.consq1()) {
			LnList<T> head = xs;
			xs = xs.tl1(); 
			head.unlink(); 

			if (sorted.nilq1()) {
				sorted = head; tail = head;
			}

			if ((head.hd1()).compareTo(tail.hd1()) >= 0) {
				tail.link(head); tail = head;
			}

			if ((head.hd1()).compareTo(sorted.hd1()) <= 0) {
				head.link(sorted);
				sorted = head;
			}

			LnList<T> temp = sorted;
			while (temp.consq1()) {
				LnList<T> next = temp.tl1();

				if (next.nilq1() || (head.hd1()).compareTo(next.hd1()) <= 0) {
					LnList<T> rem = temp.unlink();
					temp.link(head);
					head.link(rem);
					break; // oUt of while loop
				}
				temp = next;
			}
		}

		return sorted;
	

	}


    public static void main (String[] args) {
	// HX-2026-03-04:
	// Here you can use constructors in LnList.
	// Please write minimal testing code for LnListInsertSort
	// 1. Please sort a nearly sorted list of 1M elements
	// 2. Please do parity-sorting to test that LnListInsertSort is stable

		LnList<Integer> xs = new LnList<>();
		int length = 1000000;
		for(int i = (length / 2) - 1; i >= 0; i--){
			xs = new LnList<>(i*2 , xs);
			xs = new LnList<>(i*2 + 1 , xs);
		}
		LnList<Integer> sorted = LnListInsertSort(xs);


		//sorted.foritm1(System.out::println);



    }

}
