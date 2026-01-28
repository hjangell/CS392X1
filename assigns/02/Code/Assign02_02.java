import java.util.Arrays;

public class Assign02_02 {
    /*
      HX-2025-02-13: 10 points
      Recursion is a fundamental concept in programming.
      However, the support for recursion in Java is very limited.
      Nontheless, we will be making extensive use of recursion in
      this class.
     */

    /*
    // This is a so-called iterative implementation:
    public static <T extends Comparable<T> > int indexOf(T[] a, T key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            final int mid = lo + (hi - lo) / 2;
	    final int sign = key.compareTo(a[mid]);
            if      (sign < 0) hi = mid - 1;
            else if (sign > 0) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    */


    public static <T extends Comparable<T> > int indexOf(T[] a, T key) {
	// Please give a recursive implementation of 'indexOf' that is
	// equivalent to the above one
    
        int mid = a.length / 2;

        // Special Cases
        //
        // if x not present
        if (a.length == 0 || key.compareTo(a[a.length - 1]) > 0) {
            return -1;
        }

        // if a.length == 1
        if (a.length == 1 && a[0].compareTo(key) == 0) {
            return 0;
        }
        //
        //


        // Case 1 if x == a[mid]
        if (key.compareTo(a[mid]) == 0) {
            return mid;
        }

        // Case 2 if x > a[mid]
        else if (key.compareTo(a[mid]) > 0) {

            // Debugging
            int ret_val = indexOf( (T[]) Arrays.copyOfRange(a, mid + 1, a.length) , key);
            if(ret_val > 0) ret_val += mid + 1;
            //

            return ret_val;
        }

        // Case 3 if x < a[mid]
        else if (key.compareTo(a[mid]) < 0) {
            return indexOf( (T[]) Arrays.copyOfRange(a, 0, mid), key);
        }
        
        return -1;

    }

    public static void main(String[] argv) {
	// Please write some testing code for your implementation of 'indexOf'
    
        Integer[] testing = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i <= 11; i ++) System.out.println(indexOf(testing, i));
        
    }
}
