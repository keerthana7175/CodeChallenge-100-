package EvenNumber.Hashset;

import java.util.*;

public class EvenNumber7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a num");
		int num = s.nextInt();
		HashSet<Integer> even = new HashSet<>();
		for (int i = 0; i <= 100; i += 2) {
			even.add(i);
		}
		if (even.contains(num)) {
			System.out.println("NUMBER IS EVEN");
		} else {
			System.out.println("NUMBER IS ODD");
		}
	}

}
