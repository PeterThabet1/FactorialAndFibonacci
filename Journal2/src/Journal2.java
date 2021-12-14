/**
 * The class has factorial and fibonacci methods.
 * 
 * @author Peter Thabet
 *
 */
public class Journal2 { // begin of class

	/**
	 * this method returns the factorial of positive integers and throws 
	 * IllegalArgumentException if provided a negative number.
	 * It uses the recursion method to implement it, which is a bad way to use.
	 * 
	 * @param number the number to get the factorial of.
	 * @return int the factorial of the number.
	 * @throws IllegalArgumentException if the number is negative.
	 */
	static public int factorial(int number) throws IllegalArgumentException {

		if (number < 0) { //negative numbers not allowed.
			throw new IllegalArgumentException("The number is supposed to be a positive integer");
		}
		else if(number == 0) {
			return 1;
		}
		else {
			return number * factorial (number - 1);
		}
	}



	/**
	 * this method implements the fibonacci of a number using recursion.
	 * It's also not the preferred way to implement fibonacci.
	 * 
	 * @param number
	 * @return int the fibonacci of the number
	 * @throws IllegalArgumentException
	 */
	static public int fibonacci(int number) throws IllegalArgumentException {

		if (number < 0) { // negative numbers not allowed
			throw new IllegalArgumentException("The number is supposed to be a positive integer");
		}

		else if(number == 0 || number == 1) {
			return 1;
		}

		else {
			return fibonacci(number - 2) + fibonacci(number - 1);
		}
	}


	public static void main(String[] args) { //begin of main

		System.out.println(factorial(6));
		System.out.println(fibonacci(6));

	} // end of main

} // end of class
