public class Assign02_01 {
    /*
      HX-2025-02-13: 10 points
      The 'int' type in Java is for integers of some fixed precision.
      More precisely, each integer of the type int is represented as a sequence of bits
      of some fixed length. Please write a program that finds this length. Your program
      is expected return the correct answer instantly. Note that you can only use arithmetic
      operations here. In particular, NO BIT-WISE OPERATIONS ARE ALLOWED.
     */

    // Had to be changed from public void main to 
    // public static void main in order to run properly
    public static void main(String[] argv) {
	// Please give your implementation here
        // Relies on the fact that once an integer reaches past its max value,
        // it becomes negative. 

        int max_int = 1;
        int number_of_bits = 1;

        while(max_int > 0){
            // Doubles the testing value until int overflows and becomes negative
            max_int *= 2;
            number_of_bits++;
        }

        

        System.out.println("Bit length of the integer class: " + number_of_bits);
        
    }
}
