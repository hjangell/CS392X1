/*
HX-2026-02-13: 10 points
*/

// IMPORTANT:
// IN ORDER TO COMPILE AND RUN YOU MUST BE IN CS392X1 DIRECTORY AND INPUT FOLLOWING LINES
// javac -cp . assigns/04/Code/Assign04_01.java       libraries/MyLibrary/FnList/*.java       libraries/MyLibrary/FnStrn/*.java
// java -cp "assigns/04/Code;libraries" Assign04_01

import MyLibrary.FnList.FnList;
import MyLibrary.FnList.FnListSUtil;
import MyLibrary.FnStrn.FnStrn;
import MyLibrary.FnStrn.FnStrnSUtil;

import java.util.function.Predicate;

public class Assign04_01 {
    static boolean balencedq(String text) {
	//
	// There are only '(', ')', '[', ']', '{', and '}'
	// appearing in [text]. This method should return
	// true if and only if the parentheses/brackets/braces
	// in [text] are balenced.
	// Your solution must make proper use of FnList (as a stack)!
	//
		FnStrn new_text = new FnStrn(text);

		@SuppressWarnings("unchecked") // Creates raw array type because we know that only FnList<characters> can be in text_list
		FnList<Character>[] text_list = (FnList<Character>[]) new FnList[1];
		text_list[0] = FnListSUtil.nil();


		Predicate<Character> work = 
			(c) -> 
			// If Open
			( c == '(' && ( ( text_list[0] = FnListSUtil.push(c, text_list[0]) ) != null ) ) 
			||
			( c == '[' && ( ( text_list[0] = FnListSUtil.push(c, text_list[0]) ) != null ) ) 
			||
			( c == '{' && ( ( text_list[0] = FnListSUtil.push(c, text_list[0]) ) != null ) ) 

			// If Closed
			|| 
			( c == ')' && FnListSUtil.pop(text_list[0]) != null &&
				FnListSUtil.pop(text_list[0]) == '(' && 
				(text_list[0] = text_list[0].tl()) != null )
			||
			( c == ']' && FnListSUtil.pop(text_list[0]) != null &&
				FnListSUtil.pop(text_list[0]) == '[' && 
				(text_list[0] = text_list[0].tl()) != null )
			||
			( c == '}' && FnListSUtil.pop(text_list[0]) != null &&
				FnListSUtil.pop(text_list[0]) == '{' && 
				(text_list[0] = text_list[0].tl()) != null );




		return FnStrnSUtil.forall(new_text, work) && text_list[0].length() == 0;

    }

    public static void main(String[] argv) {
	// Please write some testing code for your 'balencedq"
	
		// True
		System.out.println( balencedq("({()[({})]})") );

		// False
		System.out.println( balencedq("({()[({})])}") );

		// True
		System.out.println( balencedq("()") );

		// False
		System.out.println( balencedq("}") );

		// False
		System.out.println( balencedq("{") );

    }
} // end of [public class Assign04_01{...}]
