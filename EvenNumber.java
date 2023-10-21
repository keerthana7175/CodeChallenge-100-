package EvenNumber.Switch;

import java.util.*;

public class EvenNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num = s.nextInt();
		switch (num % 2) {
		case 0:
			System.out.print("number is even");
			break;

		case 1:
			System.out.println("number is odd");
			break;
		}

	}

}
