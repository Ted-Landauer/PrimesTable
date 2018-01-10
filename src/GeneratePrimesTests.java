import static org.junit.Assert.*;

import org.junit.*;

public class GeneratePrimesTests {

	@Test
	public void testThatGetPrimeMethodReturnsAnArray()
	{
		GeneratePrimes genP = new GeneratePrimes(3);
		
		int[] primesTest = genP.getPrimes();
		
		assertTrue(primesTest.equals(genP.getPrimes()));
		
	}
	
	@Test
	public void testThatGetPrimeMethodReturnsCorrectArrayValues()
	{
		GeneratePrimes genP = new GeneratePrimes(3);
		genP.initialFill();
		
		int[] primesTest = genP.getPrimes();
		
		assertEquals(2, primesTest[0]);
		assertEquals(3, primesTest[1]);
		assertEquals(5, primesTest[2]);
		
	}
	
	@Test
	public void testIfIsPrimeReturnsTrueOnAPrimeNumber()
	{
		GeneratePrimes genP = new GeneratePrimes(3);
		//****
		assertTrue(genP.isPrime(2)); 
		
	}
	
	@Test
	public void testIfIsPrimeReturnsFalseOnANonPrimeNumber()
	{
		GeneratePrimes genP = new GeneratePrimes(3);
		//****
		assertFalse(genP.isPrime(4));
	}
	
	@Test
	public void testIfThePrimeNumberArrayIsInitiallyFilledCorrectly()
	{
		GeneratePrimes genP = new GeneratePrimes(3);
		int[] testPrimes = genP.getPrimes();
		
		genP.initialFill();
		
		//****
		assertEquals(2, testPrimes[0]);
		assertEquals(3, testPrimes[1]);
		assertEquals(5, testPrimes[2]);
	}
	
	@Test
	public void testThatTheProgramHandlesAnEmptyPrimesArrayCorrectly()
	{
		GeneratePrimes genP = new GeneratePrimes(3);
		
		genP.primesTable();
		int[] primesTest = genP.getPrimes();
		
		assertEquals(2, primesTest[0]);
		assertEquals(3, primesTest[1]);
		assertEquals(5, primesTest[2]);
		
	}
	
	@Test
	public void testArrayGetsCreatedWithTheRightSize()
	{
		GeneratePrimes genP = new GeneratePrimes(3);
		
		int[] primesTest = genP.getPrimes();
		
		assertEquals(3, primesTest.length);
	}
}
