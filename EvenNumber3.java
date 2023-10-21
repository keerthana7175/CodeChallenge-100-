package EvenNumber.TernaryOperator;

import java.util.Scanner;

public class EvenNumber3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num = s.nextInt();

		String output = (num % 2 == 0) ? "Number is even" : "Number is odd";
		System.out.println(output);
	}

}
