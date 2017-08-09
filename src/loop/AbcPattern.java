/*
 * 
 * Program to print the following pattern:

  a
  a b a
a b c b a
  a b a
    a

 * 
 */

package loop;

import java.util.Scanner;

public class AbcPattern {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Limit :");
		int limit = scanner.nextInt(); // Getting input from user to make the
										// program generic
		System.out.println("Output");
		// outerLoop1 loop is used to print the first upper half of the pattern
		for (int outerLoop1 = 1; outerLoop1 <= limit; outerLoop1++) {
			char outerLoop1Char1 = 'a';
			char outerLoop1Char2 = outerLoop1Char1;
			int counter = 0;
			for (int innerLoop1 = 1; innerLoop1 <= limit; innerLoop1++) {
				if ((outerLoop1 + innerLoop1) < limit + 1) {
					System.out.print(" ");
				}
				if ((outerLoop1 + innerLoop1) >= (limit + 1)) {
					System.out.print(outerLoop1Char1);
					outerLoop1Char2 = outerLoop1Char1;
					outerLoop1Char1++;

				}

			}

			for (int innerLoop2 = 1; innerLoop2 < outerLoop1; innerLoop2++) {
				outerLoop1Char2--;
				System.out.print(outerLoop1Char2);

			}
			System.out.println();

		}
		// outerLoop2 loop is used to print the bottom half of the pattern

		for (int outerLoop2 = 1; outerLoop2 <= limit - 1; outerLoop2++) {
			char outerLoop2Char1 = 'a';
			char outerLoop2Char2 = outerLoop2Char1;
			for (int innerLoop1 = 1; innerLoop1 <= outerLoop2; innerLoop1++) {
				if (outerLoop2 >= innerLoop1) {
					System.out.print(" ");
				}
			}

			for (int innerLoop2 = limit - 1; innerLoop2 >= outerLoop2; innerLoop2--) {
				System.out.print(outerLoop2Char1);
				outerLoop2Char2 = outerLoop2Char1;
				outerLoop2Char1++;
			}
			for (int innerLoop3 = limit - 2; innerLoop3 >= outerLoop2; innerLoop3--) {
				outerLoop2Char2--;
				System.out.print(outerLoop2Char2);

			}
			System.out.println();
		}

	}

}
