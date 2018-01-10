import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number of prime numbers you want: ");
		
		int primesWanted = scanner.nextInt();
		
		scanner.close();
		
		
		GeneratePrimes genP = new GeneratePrimes(primesWanted);
		genP.initialFill();
		genP.primesTable();

	}

}
