import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgCore.MyInteger;

public class TestInteger {
	MyInteger myInt1 = new MyInteger(1);
	MyInteger myInt2 = new MyInteger(2);
	MyInteger myInt3 = new MyInteger(3);
	MyInteger myInt4 = new MyInteger(4);
	MyInteger myInt5 = new MyInteger(5);
	MyInteger myInt7 = new MyInteger(7);
	MyInteger myInt9 = new MyInteger(9);
	MyInteger myInt31 = new MyInteger(31);
	MyInteger myInt48 = new MyInteger(48);
	MyInteger myInt31num2 = new MyInteger(31);
	MyInteger myInt48num2 = new MyInteger(49);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestPrime() {
		
		assertFalse(myInt1.isPrime());
		assertFalse(myInt2.isPrime());
		assertTrue(myInt3.isPrime());
		assertFalse(myInt4.isPrime());
		assertTrue(myInt5.isPrime());
		assertTrue(myInt7.isPrime());
		assertFalse(myInt9.isPrime());
		assertTrue(myInt31.isPrime());
		assertFalse(myInt48.isPrime());
	}
	@Test
	public void TestEven() {
		assertFalse(myInt1.isEven());
		assertTrue(myInt2.isEven());
	}
	@Test
	public void TestOdd() {
		assertTrue(myInt1.isOdd());
		assertFalse(myInt2.isOdd());
	}
	@Test
	public void TestValue() {
		assertEquals(myInt48.getiValue(),48);
	}
	@Test
	public void TestEvenInt() {
		assertTrue(MyInteger.isEven(88));
		assertFalse(MyInteger.isEven(19));
	}
	@Test
	public void TestOddInt() {
		assertTrue(MyInteger.isOdd(175));
		assertFalse(MyInteger.isOdd(890));
	}
	@Test
	public void TestPrimeInt() {
		assertTrue(MyInteger.isPrime(257));
		assertTrue(MyInteger.isPrime(311));
		assertFalse(MyInteger.isPrime(88));
		assertFalse(MyInteger.isPrime(255));
		assertFalse(MyInteger.isPrime(261));
	}
	@Test
	public void TestPrimeObj() {
		assertFalse(MyInteger.isPrime(myInt1));
		assertTrue(MyInteger.isPrime(myInt3));
		assertFalse(MyInteger.isPrime(myInt4));
		assertFalse(MyInteger.isPrime(myInt48));
		assertTrue(MyInteger.isPrime(myInt31));
	}
	@Test
	public void TestEvenObj() {
		assertFalse(MyInteger.isEven(myInt1));
		assertTrue(MyInteger.isEven(myInt2));
	}
	@Test
	public void TestOddObj() {
		assertFalse(MyInteger.isOdd(myInt2));
		assertTrue(MyInteger.isOdd(myInt1));
	}
	@Test
	public void TestEqualsInt() {
		assertTrue(myInt7.isEquals(7));
		assertFalse(myInt9.isEquals(10));
		assertTrue(myInt31.isEquals(31));
		assertFalse(myInt48.isEquals(500));
	}
	@Test
	public void TestEqualsObj() {
		assertTrue(myInt7.isEquals(myInt7));
		assertFalse(myInt9.isEquals(myInt7));
		assertTrue(myInt31.isEquals(myInt31num2));
		assertFalse(myInt48.isEquals(myInt48num2));
	}
}
