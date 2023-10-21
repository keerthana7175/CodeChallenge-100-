package EvenNumber.WhileForLoop;

import java.util.*;

public class EvenMumber5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num = s.nextInt();
		while (num > 0) { 
			num -= 2;
		}
		for(int i=0;i<num;i++) {
			num-=2;
		}
			if (num == 0) {
				System.out.println("even number");
			} else {
				System.out.println("odd number");
			
		}
	}

}
