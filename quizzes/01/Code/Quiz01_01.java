//
// HX: 20 points
//
/*
import Library00.FnA1sz.*;
*/
import MyLibrary.FnList.*;
import MyLibrary.FnA1sz.*;

// Run from CS392X1
// javac -cp . quizzes/01/Code/Quiz01_01.java  libraries/MyLibrary/FnList/*.java  libraries/MyLibrary/FnA1sz/*.java
// // java -cp .:libraries:quizzes/01/Code Quiz01_01

public class Quiz01_01 {
    public static
	<T extends Comparable<T>>
	int FnA1szBinarySearch(FnA1sz<T> A, T key) {
	// HX-2026-03-03:
	// Please implement binary search on a sorted functional array (FnA1sz)
	// that returns the largest index i such that key >= A[i] if such i exists,
	// or the method returns -1. The comparison function should be the compareTo
	// method implemented by the class T.
	int low = 0;
	int high = A.length() - 1;
	while(low <= high) {
		int mid = low + (high - low) / 2;
		if ( key.compareTo( A.getAt(mid) ) < 0) { high = mid - 1; }
		else if ( key.compareTo( A.getAt(mid) ) > 0) {low = mid + 1; }
		else{ return mid; }
	}

	return -1;

    }
    public static void main (String[] args) {
	// HX-2026-03-04:
	// Please write minimal testing code for FnA1szBinarySearch
	// Should test for cases T = Integer and T = String

	// Creating sorted list of integers
	FnList<Integer> int_list = FnListSUtil.nil();
	for(int i = 0; i < 10; i++) int_list = FnListSUtil.cons(i + 1, int_list);
	int_list = FnListSUtil.reverse(int_list);

	FnA1sz int_testing = new FnA1sz(int_list);
	System.out.println( FnA1szBinarySearch(int_testing, 6) ); // Should print "5"


	// Creating sorted list of Strings
	FnList<String> str_list = FnListSUtil.nil();
	str_list = FnListSUtil.cons("e", str_list);
	str_list = FnListSUtil.cons("d", str_list);
	str_list = FnListSUtil.cons("c", str_list);
	str_list = FnListSUtil.cons("b", str_list);
	str_list = FnListSUtil.cons("a", str_list);

	FnA1sz str_testing = new FnA1sz(str_list);
	System.out.println( FnA1szBinarySearch(str_testing, "d") ); // Should print 3
	System.out.println( FnA1szBinarySearch(str_testing, "f") ); // Should print -1


	return /*void*/;
    }
}
