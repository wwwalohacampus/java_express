package chap03.abstractEx;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	@Override
	public int substract(int a, int b) {
		int sum = a - b;
		return sum;
	}

	@Override
	public double average(int[] a) {
		double avg = 0.0;
		int sum = 0;
		
		for (int i : a) {
//			sum = sum + i;				//   i  == (  a[i] )
			sum += i;
		}
		avg = sum / a.length;
		return avg;
	}
	
}












