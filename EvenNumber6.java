package EvenNumber.recursion;

import java.util.*;

public class EvenNumber6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num = s.nextInt();
		boolean iseven = iseven(num);
		if (iseven) {
			System.out.println("even number");

		} else {
			System.out.println("odd number");
		}
	}

	public static boolean iseven(int num) {
		if (num == 0) {
			return true;

		} else if (num == 1) {
			return false;

		} else {
			return iseven(num - 2);
		}

	}

}
