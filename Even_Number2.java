package EvenNumber.BitwiseOperator;

import java.util.*;

public class EvenNumber2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num = s.nextInt();
		if ((num & 1) == 0) {
			System.out.println("even number");

		} else {
			System.out.println("odd number");
		}
	}

}
