//
// HX: For testing Quiz01_05
//

// Run from CS392X1
// javac -cp . quizzes/01/MySolution/Quiz01_05_test.java quizzes/01/MySolution/Quiz01_05.java  libraries/MyLibrary/FnList/*.java
// java -cp .:libraries:quizzes/01/MySolution Quiz01_05_test

import java.util.function.ToIntBiFunction;
import MyLibrary.FnList.*;


abstract public class Quiz01_05_test {
    public static void main (String args[]) {
	// Your testing code for Quiz01_05
        FnList<Integer> testing = FnListSUtil.nil();
        for(int i = 0; i < 500; i++){
            testing = FnListSUtil.cons(i*2 + 1, testing);
            testing = FnListSUtil.cons(i*2, testing);
        }
        testing = FnListSUtil.reverse(testing);

        ToIntBiFunction<Integer, Integer> equalsTo = (a, b) -> a - b;

        testing = Quiz01_05.someRevStableSort(testing, equalsTo);
        FnListSUtil.System$out$print(testing);

    }
}
