package MyLibrary.FnStrn;

public class FnStrn {

    // String root;
    char root[];

	// Construct Empty Strn
    public FnStrn() {
		root = null;
    }

	// Construct Strn from char array
    public FnStrn(char[] cs) {
		// root = cs;
		int ln = cs.length;
		root = new char[ln];
		for (int i = 0; i < ln; i += 1) root[i] = cs[i];
    }

	// Construct Strn from String
    public FnStrn(String cs) {
		int ln = cs.length();
		root = new char[ln];
		for (int i = 0; i < ln; i += 1) root[i] = cs.charAt(i);
    }

	//

    public int length() {
		return root.length;
    }

    public char getAt(int index) {
		return root[index];
    }

	
} // end of [public class FnStrn{...}]
