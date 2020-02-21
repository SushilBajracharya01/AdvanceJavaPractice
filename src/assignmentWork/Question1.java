package assignmentWork;
import java.util.*;



public class Question1 {
	
	static int primeCount (int start, int end) {
		int primeCount = 0;
		int count;
		
		if ( start <= 1 ) {
			start = 2;
		}
		if ( start > end ) {
			System.out.println("Start must be smaller than end.");
		}
		for (int i=start; i <= end; i++) {
			count=0;
			for (int j=2; j <= i/2; j++) {
				if( i % j == 0 ) {
					count=1;
					break;
				}
			}
			if( count == 0 ) {
				primeCount++;
			}
		}
		return primeCount;
	}
	
	public static void main(String args[]) {
		int start, end;
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter Start number- ");
		start= sc.nextInt();
		
		System.out.print("Enter End number- ");
		end= sc.nextInt();
		
		
		System.out.println("There are " + primeCount(start,end) + " Prime numbers between " + start + " and " + end);
		sc.close();
	}

}
