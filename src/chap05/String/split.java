package chap05.String;

public class split {
	public static void main(String[] args) {
		String str = "안녕하세요";
		String[] splitStr = str.split("");
		
		// [안][녕][하][세][요]
		for (int i = 0; i < splitStr.length; i++) {
			System.out.println("splitStr[" + i + "] : " + splitStr[i]);
		}
		System.out.println();
		
		// [철수][영희][박새로이][조이서]
		String str2 = "철수,영희,박새로이,조이서";
		String[] splitStr2 = str2.split(",");
		
		for (int i = 0; i < splitStr2.length; i++) {
			System.out.println("splitStr2[" + i + "] : " + splitStr2[i]);
		}
		
	}
}
