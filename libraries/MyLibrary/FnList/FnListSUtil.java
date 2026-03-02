package MyLibrary.FnList;

import MyLibrary.FnList.*;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntBiFunction;

/*
import java.util.function.ToIntBiFunction;
*/

public class FnListSUtil {
//
    public static<T> FnList<T> nil() {
		return new FnList<T>();
    }

    public static<T> FnList<T> cons(T x0, FnList<T> xs) {
		return new FnList<T>(x0, xs);
    }
//
    // HX: [length] is O(n)
    public static<T> int length(FnList<T> xs) {
		int res = 0;
		while (true) {
			if (xs.nilq()) break;
			res += 1; 
			xs = xs.tl();
		}
		return res;
    }
//
    public static<T> FnList<T> reverse(FnList<T> xs) {
		FnList<T> ys;
		ys = nil();
		while (!xs.nilq()) {
			ys = cons(xs.hd(), ys); 
			xs = xs.tl();
		}
		return ys;
    }    

    public static<T> FnList<T> append(FnList<T> xs, FnList<T> ys) {
		if (xs.nilq()) {
			return ys;
		} else {
			return cons(xs.hd(), append(xs.tl(), ys));
		}
    }

    public static<T> void foritm(FnList<T> xs, Consumer<? super T> work) {
		while (xs.consq()) {
			work.accept(xs.hd()); xs = xs.tl();
		}
		return;
    }

    public static<T> boolean forall(FnList<T> xs, Predicate<? super T> pred) {
		while (true) {
			if (xs.nilq()) break;
			else {
				if ( pred.test(xs.hd()) ) {
					xs = xs.tl(); 
					continue;
				} else {
					return false; // HX: counterexample found!
				}
			}
		}
		return true;
    }

    public static<T> void iforitm(FnList<T> xs, BiConsumer<Integer, ? super T> work) {
		int i = 0;
		while (xs.consq()) {
			work.accept(i, xs.hd()); 
			i += 1; 
			xs = xs.tl();
		}
		return;
    }

    public static<T> boolean iforall(FnList<T> xs, BiPredicate<Integer, ? super T> pred) {
		int i = 0;
		while (true) {
			if (xs.nilq()) break;
			else {
				if (pred.test(i, xs.hd())) {
					i += 1; 
					xs = xs.tl(); 
					continue;
				} else {
					return false; // HX: counterexample found!
				}
			}
		}
		return true;
    }

    public static<T> void System$out$print(FnList<T> xs) {
    	System.out.print("FnList(");
		iforitm(xs,
			(i, itm) ->
			{
				if (i > 0) System.out.print(",");
				System.out.print(itm.toString());
			}
		);
		System.out.print(")");
    }

	//
	
    public static<T> FnList<T> insertSort(FnList<T> xs, ToIntBiFunction<T,T> cmp) {
		if (xs.nilq()) {
			return xs;
		} else {
			return insertSort_insert(insertSort(xs.tl(), cmp), xs.hd(), cmp);
		}
    }

    private static<T> FnList<T> insertSort_insert(FnList<T> xs, T x0, ToIntBiFunction<T,T> cmp) {
		if (xs.nilq()) return cons(x0, xs);
		else {
			final T hd = xs.hd();
			final int sgn = cmp.applyAsInt(x0, hd);
			if (sgn <= 0) { // HX: for stableness
				return cons(x0, xs); // [x0] is returned
			} else {
				return cons(hd, insertSort_insert(xs.tl(), x0, cmp));
			}
		}
    }

//


	// Beginning of Personal functions

	// Push function (Stack function) 
	// Adds new element as head
	public static<T> FnList<T> push(T x0, FnList<T> xs) {
		xs = new FnList<T>(x0,xs);
		return xs;
	}

	// Pop function (stack)
	// Removes and returns head from FnList
	public static<T> T pop(FnList<T> xs) {
		T head = xs.hd();
		if(head != null) xs = xs.tl();
		return head;
	}

	//

	public static<T> T insertion_sort(FnList<T> xs, ToIntBiFunction<T,T> cmp) {
		// Personal implementation of insertion sort
			// For cmp, an example for an Int_list would be 
				// BiPredicate<Integer, Integer> equalsTo = (a, b) -> { return a - b == 0 ; };
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

	

} // end of [public class FnListSUtil{...}]
