/*
HX-2026-02-05: 10 points
*/
public class Assign03_01 {
    //
    // HX-2025-09-15:
    // This implementation of f91
    // is not tail-recursive. Please
    // translate it into a version that
    // is tail-recursive
    //
    /*
    static int f91(int n) {
	if (n > 100)
	    return n-10;
	else
	    return f91(f91(n+11));
    }
    */
    static int f91(int n) {

        if (n > 100) {
            return n - 10;
        }
        else {
            return f91(n + 1);
        }

    }


    public static void main(String[] argv) {
	// Please write some testing code here
        System.out.println(f91(101));
        System.out.println(f91(110));
        System.out.println(f91(99));
        System.out.println(f91(90));
        System.out.println(f91(91));
    }
}
