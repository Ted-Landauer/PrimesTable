public class GeneratePrimes {
    
	//initialize variables
	private int[] primes;
	private int numberOfPrimes;
	int starterCount = 0;
	private boolean isPrime;

	
	//constructor
	public GeneratePrimes (int n)
	{
		primes = new int[n];
		numberOfPrimes = n;
		
	}
	
	//fill the primes array
	public void initialFill()
	{
		
		System.out.println("Filling the array");
		
		int primesFound = 0;
		int i = 2;
				
		while(primesFound != numberOfPrimes)
		{
			
			if(isPrime(i))
			{
				primes[primesFound] = i;
				
				primesFound++;
				i++;
			}
			else
			{
				i++;
			}
			
		}
		
		System.out.println("Array is filled");
	}
	
	//check if a number is prime
	public boolean isPrime(int numberToCheck)
	{
		isPrime = true;
		if((numberToCheck != 2) && numberToCheck%2 == 0)
		{
			return false;
		}
		
		for(int i = 3; i <= numberToCheck/2; i+=2)
		{
			
			if(numberToCheck%i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
	
	//math for the times table for the given number of primes
	public void primesTable()
	{
		System.out.println("working on the primes table");
		
		
		int product;
		int xValue;
		int yValue;
		int j = 0;
		int k = 0;
		int primesTableSize = (numberOfPrimes * numberOfPrimes);
		boolean nextLine = false;
		

		//make sure the array has the correct first value in it and refill it if it doesn't
		if(primes[0] != 2)
		{
			initialFill();
		}
		
		//multiply our the primes to get the products for the inner cells of the table
		for(int i = 0; i < primesTableSize; i++)
		{
			
			xValue = primes[j];
			yValue = primes[k];
			
			product = xValue * yValue;
			
			printPrimesTable(product, starterCount, xValue, nextLine);
			
			nextLine = false;
			
			k++;
			
			if(k == numberOfPrimes)
			{
				nextLine = true;
				j++;
				k = 0;
			}
		}
	}

	//print out the values for the times table
	public void printPrimesTable(int finalProduct, int starter, int yValue, boolean nextLine )
	{
		//run if this is the first line of the table
		if(starter == 0)
		{
			//print out an X for the first cell then print the list of primes
			System.out.printf("%7s %1s", "X", "| ");
			
			for(int v: primes)
			{
				System.out.printf("%7d %1s ", v, "|");
			}
			
			starterCount=1;
			System.out.println("");
			System.out.printf("% 7d %1s ", yValue , "|");
		}
		
		//print the primes on the first column before the rest of the line is printed 
		if(nextLine)
		{
			System.out.println("");
			System.out.printf("% 7d %1s ", yValue , "|");
			
		}
		
		//print the products for the inner cells of the multiplication table
		System.out.printf("% 7d %1s ", finalProduct, "|");
		
	}
	
	public static void main(String[] args) {
				
		//GeneratePrimes test = new GeneratePrimes(5000);
		
		//test.initialFill();
		//test.primesTable();

	}

	//get the primes array. Only used for the unit tests
	public int[] getPrimes()
	{
		return primes;
	}
	
	
}
