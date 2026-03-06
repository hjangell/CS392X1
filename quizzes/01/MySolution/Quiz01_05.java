//
// HX: 30 points
//
/*
//
 Reverse-stable sorting is similar to stable sorting:
 The ordering of the equals are reversed in the sorted
 version. For instance, 1^1, 2^1, 3^1, 2^2, 3^2, 1^2
 becomes 1^2, 1^1, 2^2, 2^1, 3^2, 3^1 after sorted in
 the reverse-stable manner. If this is unclear to you,
 please seek clarification on Piazza.
//
 No use of external methods (e.g., those from Arrays)
 is allowed here.
//
*/

// Run from CS392X1
// javac -cp . quizzes/01/MySolution/Quiz01_05.java  libraries/MyLibrary/FnList/*.java

import java.util.function.ToIntBiFunction;
import MyLibrary.FnList.*;


abstract public class Quiz01_05 {
    public static<T> FnList<T> someSort (FnList<T> xs, ToIntBiFunction<T,T> cmp) {
	// HX-2025-10-15:
	// This one is abstract, that is, not implemented
		return FnListSUtil.insertion_sort(xs, cmp);
    }
	
    public static<T> FnList<T> someRevStableSort (FnList<T> xs, ToIntBiFunction<T,T> cmp) {
	// HX-2025-10-15:
	// Please implement a reverse-stable sorting method
	// based on someSort
		xs = someSort(xs, cmp); // Initially sorting

		if(xs.nilq()) return xs;

		FnList<T> rev_list = FnListSUtil.nil();
		T cur = null;
		while(xs.consq()){
			cur = xs.hd();

			FnList<T> partial_list = xs.tl();
			int num_val = 1; // Number of same values
			while(partial_list.consq() && cmp.applyAsInt(partial_list.hd(), cur) == 0) { // Get number of same values
				num_val++;
				partial_list = partial_list.tl();
			}

			FnList<T> temp_list = FnListSUtil.nil();
			for(int i = 0; i < num_val; i++){
				temp_list = FnListSUtil.cons(xs.hd(), temp_list);
				xs = xs.tl();
			}

			rev_list = FnListSUtil.append( rev_list, FnListSUtil.reverse(temp_list) );



		}

		return rev_list;

    }
}
 
////////////////////////////////////////////////////////////////////////.
//
// HX-2026-03-04:
//
// Please find a way to test someRevStableSort by
// implementing someSort as insertion-sort on FnList
// and then use someReStableSort to parity-sort the following
// list of 1K integers:
// 0, 1, 2, 3, 4, ..., 999
//
// Your testing code should be inside Quiz01_05_test.java!
//
// Note that you should not add a 'main' method into Quiz01_05
// directly; instead, try to create another class to test Quiz01_05
//
// Note that you should be able to call the insertion sort
// you did (Assign05_01); should not do another implementation of it
//
////////////////////////////////////////////////////////////////////////.
