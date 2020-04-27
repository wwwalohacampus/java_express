package chap05.String;

public class equals {
	public static void main(String[] args) {
		String str = "안녕";
		String str2 = "하이";
		
		System.out.println(str == str2);
		System.out.println();
		
		str2 = "안녕";
		String[] s1 = str.split("");
		String[] s2 = str2.split("");
	
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
					System.out.println( s1[i] == s2[j] );
			}
		}
		System.out.println();
		System.out.println(str == str2);
		System.out.println();
		
		
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
					System.out.println( s1[i].equals(s2[j]) );
			}
		}
		System.out.println();
		
		System.out.println(str.equals(str2));
		
		
		
		
		
		
	}
	
}
