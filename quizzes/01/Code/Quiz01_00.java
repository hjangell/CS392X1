//
// HX: 10 points
//
/*
import MyLibrary.FnList.*;
// Add for imports as you see fit
*/

import MyLibrary.FnA1sz.*;
import MyLibrary.FnList.*;
import MyLibrary.FnStrn.*;
import MyLibrary.MyQueue.*;
import MyLibrary.MyStack.*;

// Run from CS392X1
// javac -cp . quizzes/01/Code/Quiz01_00.java  libraries/MyLibrary/FnA1sz/*.java  libraries/MyLibrary/FnList/*.java  libraries/MyLibrary/FnStrn/*.java  libraries/MyLibrary/MyQueue/*.java    libraries/MyLibrary/MyStack/*.java
// java -cp .:libraries:quizzes/01/Code Quiz01_00

public class Quiz01_00 {
    /*
     Please give a description of your MyLibrary
     What classes have you implemented? For each class
     you have implemented in MyLibrary, please create an
     object of that class as follows:
     */
    public static void main (String[] args) {
	// For instance, 
	// FnList<Integer> FnList_Integer_obj = new FnList<Integer>();

    // FnList
    // Creates a list of generic and comparable type T that is iterable and sortable
    FnList<Character> FnList_Example = FnListSUtil.nil();

    // FnA1sz
    // Creates new FnA1sz
    FnA1szSUtil FnA1sz_Example = new FnA1szSUtil();

    // FnStrn
    // Creates a functional string that is iterable
    FnStrn FnStrn_Example = new FnStrn("Example");

    // MyQueueList
    // Creates a linked list with queue functions
    MyQueueList<Character> QList_Example = new MyQueueList();

    // MyQueueArray
    // Creates an array with queue functions
    MyQueueArray<Integer> QArray_Example = new MyQueueArray(1);

    // MyStackList
    // Creates a linked list with stack functions
    MyStackList<Character> SList_Example = new MyStackList();

    // MyStackArray
    // Creates an array with stack functions
    MyStackArray<Integer> SArray_Example = new MyStackArray<Integer>(1);


	return /*void*/;
    }
}
