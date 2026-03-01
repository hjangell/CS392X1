import MyLibrary.FnList.*;

import java.util.function.BiPredicate;
import java.util.function.ToIntBiFunction;

// Run from CS392X1
// javac -cp . assigns/05/MySolution/Assign05_01.java       libraries/MyLibrary/FnList/*.java
// java -cp .:libraries:assigns/05/MySolution Assign05_01

public class Assign05_01 {

    public static<T> FnList<T> insertSort(FnList<T> xs, ToIntBiFunction<T,T> cmp) {
	// HX-2026-02-26: Please implement this method
	// You can use while-loops but cannot make recursive
	// calls.
		FnList<T> sorted = FnListSUtil.nil();
		FnList<T> cur = xs;

		while(cur.consq()) {
			T ins = cur.hd();

			if(sorted.nilq() || cmp.applyAsInt(ins, sorted.hd()) <= 0) {
				sorted = FnListSUtil.cons(ins, sorted);
			} else {

				FnList<T> before = FnListSUtil.nil();
				while(sorted.consq() && cmp.applyAsInt(ins, sorted.hd()) >= 0) {
					before = FnListSUtil.cons(sorted.hd(), before);
					sorted = sorted.tl();
				}

				sorted = FnListSUtil.cons(ins, sorted);
				while(before.consq()) {
					sorted = FnListSUtil.cons(before.hd(), sorted);
					before = before.tl();
				}

			}

			cur = cur.tl();
			
		}

		return sorted;

    }


    public static void main(String[] args) {
	// Please write some testing code that applies
	// insertSort to the following list of 1M numbers:
	// 1, 0, 3, 2, 5, 4, 7, 6, 9, 8, 11, 10, ..., 999999, 999998.

		// Comparing integers function
		ToIntBiFunction<Integer, Integer> sub = (a, b) -> {return a - b;};

		// For Testing purposes
		BiPredicate<Integer, Integer> equalsTo = (a, b) -> { return a - b == 0 ; };
		
		// Creating list
		FnList<Integer> int_list = FnListSUtil.nil();
		int test_len = 9999;
		for(int i = test_len; i >= 0; i -= 2) {
			int_list = FnListSUtil.cons(i - 1, int_list);
			int_list = FnListSUtil.cons(i, int_list);
		}

		// Sorting List
		int_list = insertSort(int_list, sub);

		// Checking if list sorted
		if(FnListSUtil.iforall(int_list, equalsTo)) {
			System.out.println("Sorted!");
		} else {
			System.out.println("Not Sorted!");
		}
		
    }

} // end of [public class Assign05_01{...}]
