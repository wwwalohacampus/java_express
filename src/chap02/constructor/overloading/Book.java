package chap02.constructor.overloading;

public class Book {
	String title;
	String author;
	
	// 생성자
	// * 생성자의 목적은 개체가 생성될 때, 필요한 초기화 작업을 하기 위함이다.
	public Book(String title) {
		this.title = title;
		author = "작자미상";
	}

	// 생성자(메소드) 오버로딩
	// this	:	객체(인스턴스) 자기 자신을 가리키는 레퍼런스
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		
		Book loveStory = new Book("춘향전");
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}

