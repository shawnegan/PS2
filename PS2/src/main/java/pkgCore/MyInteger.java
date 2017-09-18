package pkgCore;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {

		this.iValue = iValue;
	}
	
	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		return (getiValue()%2 == 0);
	}
	
	public boolean isOdd() {
		return !isEven();
	}
	
	public boolean isPrime() {
		int a = 3;
		if (isEven() || getiValue() == 1) {
			return false;
		} else {
			for (; a < getiValue()/2; a = a + 2) {
				if (getiValue()%a == 0) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean isEven(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isEven();
	}
	
	public static boolean isOdd(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isOdd();
	}
	
	public static boolean isPrime(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isPrime();
	}
	
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}
	
	public boolean isEquals(int comp) {
		return (this.getiValue() == comp);
	}
	
	public boolean isEquals(MyInteger myInt) {
		return (this.getiValue() == myInt.getiValue());
	}
}
