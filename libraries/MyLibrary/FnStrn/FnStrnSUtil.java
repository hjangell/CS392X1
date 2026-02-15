package MyLibrary.FnStrn;

import MyLibrary.FnStrn.*;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
/*
import java.util.function.ToIntBiFunction;
*/

public class FnStrnSUtil {
//

    // HX: This should be O(1)
	// Returns length
    public static int length(FnStrn cs) {
		return cs.length();
    }

    // HX: This should be O(1)
	// Returns true if null
    public static boolean nilq(FnStrn cs) {
		return (cs.length() == 0);
    }

    // HX: This should be O(1)
	// returns true if not null
    public static boolean consq(FnStrn cs) {
		return (cs.length() >= 1);
    }

//

    public static FnStrn reverse(FnStrn cs) {
		char res[];
		int ln = cs.length();
		res = new char[ln];
		/*
				for (int i = 0; i < ln; i += 1) {
				res[i] = cs.getAt(ln-1-i);
			}
		*/
		iforitm(cs,
			(i, c1) -> { res[ln-1-i] = c1; }
		);
		return new FnStrn(res);
    }
//
    public static void foritm(FnStrn cs, Consumer<? super Character> work) {
		for (int i = 0; i < cs.length(); i += 1) work.accept(cs.getAt(i));
		return;
    }
//
    public static boolean forall(FnStrn cs, Predicate<? super Character> pred) {
		for (int i = 0; i < cs.length(); i += 1) {
			if (!pred.test(cs.getAt(i))) return false;
		}
		return true;
    }
//
    public static void iforitm(FnStrn cs, BiConsumer<Integer, ? super Character> work) {
		for (int i = 0; i < cs.length(); i += 1) work.accept(i, cs.getAt(i));
		return;
    }
    public static boolean iforall(FnStrn cs, BiPredicate<Integer, ? super Character> pred) {
		for (int i = 0; i < cs.length(); i += 1) {
			if (!pred.test(i, cs.getAt(i))) return false;
		}
		return true;
    }


	// Beginning of personal functions

	public static FnStrn concat(FnStrn str1, FnStrn str2){
		int str1len = str1.length();
		char newstr[] = new char[str1len + str2.length()];

		for(int i = 0; i < str1len; i++) newstr[i] = str1.getAt(i);
		for (int i = 0; i < str2.length(); i++) newstr[str1len + i] = str2.getAt(i);
		
		return new FnStrn(newstr);
	}

	public static void print(FnStrn str) {
		iforitm(str, 
			(i, ch) -> { System.out.print(ch); }
		);
		System.out.print("\n");

	}


//
} // end of [public class FnStrnSUtil{...}]
