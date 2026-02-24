/*
HX-2026-02-05: 10 points
*/
import Library00.FnList.FnList;
import Library00.FnList.FnListSUtil;

public class Assign03_02 {
    static boolean balencedq(String text) {
		//
		// There are only '(', ')', '[', ']', '{', and '}'
		// appearing in [text]. This method should return
		// true if and only if the parentheses/brackets/braces
		// in [text] are balenced.
		// Your solution must make proper use of MyStack!
		//
		
		FnList<Character> text_list = FnListSUtil.nil();
		for(int i = 0; i < text.length(); i++) {
			char cur_char = text.charAt(i);


			if( cur_char == '(' || cur_char == '[' || cur_char == '{' ) {
				text_list = FnListSUtil.cons(cur_char, text_list);
			}
			else {
				// If no open bracket
				if(text_list.nilq()) return false;

				// Checking if matching character
				char prev = text_list.hd();

				// All possible wrong answers
				if( ( cur_char == ')' && prev != '(' )
				|| ( cur_char == ']' && prev != '[')
				|| (cur_char == '}' && prev != '{') ) {
						return false;
				}

				// Remove previous value from list 
				text_list = text_list.tl();
				
			}
		

		}

		// If no inbalances come up then true
		return text_list.nilq();

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
}
