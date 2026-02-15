/*
HX-2026-02-13: 20 points
*/

// IMPORTANT:
// IN ORDER TO COMPILE AND RUN YOU MUST BE IN CS392X1 DIRECTORY AND INPUT FOLLOWING LINES
// javac -cp . assigns/04/Code/Assign04_02.java       libraries/MyLibrary/FnList/*.java       libraries/MyLibrary/FnStrn/*.java
// java -cp "assigns/04/Code;libraries" Assign04_02

import MyLibrary.FnList.*;
import MyLibrary.FnStrn.*;


public class Assign04_02 {
    static FnStrn FnList$FnStrn_concate(FnList<FnStrn> xs) {
	// Given a list of strings, this method return the
	// concatenation of these string. For instance, given
	// ("a", "bc", "def"), the returned string is "abcdef"
	// You implementation is NOT allowed to use loops or
	// reccursion. Try to use the 'foritm' method in FnList
	// and FnStrn to accomplish this task.

		FnStrn[] ans = new FnStrn[1];
		ans[0] = new FnStrn("");

		FnListSUtil.foritm(xs, str -> { ans[0] = FnStrnSUtil.concat(ans[0], str); } );

		return ans[0];

    }

    public static void main(String[] argv) {
	// Please write some testing code for your 'FnList$FnStrn_concate"

		FnList<FnStrn> testing = FnListSUtil.nil();
		testing = FnListSUtil.cons( new FnStrn("ghi") , testing);
		testing = FnListSUtil.cons( new FnStrn("def") , testing);
		testing = FnListSUtil.cons( new FnStrn("abc") , testing);
		// testing = ("abc", "def", "ghi")

		FnStrn testing_str = FnList$FnStrn_concate(testing);
		FnStrnSUtil.print(testing_str); // Should print "abcdefghi"


		return;
    }
} // end of [public class Assign04_02{...}]
