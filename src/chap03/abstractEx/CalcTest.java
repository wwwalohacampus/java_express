package chap03.abstractEx;

public class CalcTest {
	public static void main(String[] args) {
		GoodCalc gc = new GoodCalc();
		int [] arr = {1,2,3,4,5};
		System.out.println(gc.add(10, 20));
		System.out.println(gc.substract(30, 40));
		System.out.println(gc.average(arr));
		
	}
}
