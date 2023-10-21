package EvenNumber.ModuloOperator;

import java.util.*;

public class Even_Number {

	public static void main(String[] args) {
		// int num=10;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a num");
		int num = s.nextInt();
		if (num % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("the number is odd");
		}
	}

}
