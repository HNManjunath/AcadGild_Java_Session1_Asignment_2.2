/**
 * 
 */
package assignment2_2;

/**
 * @author MANJUNATH, This class is to print diamond pattern of alphabet
 *
 */
public class Assignment2_2 {

	/**
	 * @param args,
	 *            number,i,j,k,c;
	 */
	// Pattern generating function
	public void printDiamondPattern(int number) {
		char c = 97; // ASCII value of a.
		int i, j, k;

		k = number / 2;

		for (i = 1; i <= number / 2 + 1; i++) { // loop to print upper triangle and the middle line
			c = 97;

			for (j = 1; j <= k; j++) { // loop to print the required spaces for the line
				System.out.print(" ");
			}

			for (j = k + 1; j <= (k + (2 * i - 1)); j++) { // loop to print the alphabets of the upper triangle
				if (j <= number / 2 + 1) { // prints alpha in increasing order till middle element
					System.out.print(c);
					c++; // incrementing ASCII value as b,c...
					if (j == (number / 2 + 1)) { // subtracts one, incremented in the previous loop when j becomes
													// middle element
						c--; // decrementing ASCII value as c,b,a
					}
				} else { // prints alpha in decreasing order after middle element
					c--; // decrementing ASCII value as c,b,a
					System.out.print(c);
				}
			}
			k--;
			System.out.println();
		}
		k = 1;

		for (i = number / 2 + 2; i <= number; i++) { // loop to print lower triangle
			c = 97;
			for (j = 1; j <= k; j++) { // loop to print the required spaces for the line
				System.out.print(" ");
			}

			for (j = k + 1; j <= ((2 * i - 1) - (3 * k)); j++) { // loop to print the alphabets of the lower triangle
				if (j <= number / 2 + 1) { // prints alpha in increasing order till middle element
					System.out.print(c);
					c++;
					if (j == (number / 2 + 1)) { // subtracts one, incremented in the previous loop when j becomes
													// middle element
						c--;
					}
				} else {
					c--;
					System.out.print(c); // prints alpha in decreasing order after middle element
				}
			}
			k++;
			System.out.println();

		}
	}

	public static void main(String[] args) {
		// Main method starts
		// TODO Auto-generated method stub
		Assignment2_2 pattern = new Assignment2_2();
		System.out.println("Required Pattern:: \n ");
		pattern.printDiamondPattern(5); // calling pattern function

	}

}
