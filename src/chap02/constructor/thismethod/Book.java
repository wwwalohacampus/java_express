package chap02.constructor.thismethod;

public class Book {
	String title;
	String author;
	
	// 생성자
	public Book() {
		this("","");
		System.out.println("Book() - 생성자 호출");
	}
	
	// this() 	: 생성자에서 다른 생성자를 호출하는 메소드
	public Book(String title) {
		this(title, "작자미상");
	}
	
	// 생성자(메소드) 오버로딩
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		
		Book loveStory = new Book("춘향전");
		System.out.println(loveStory.title + " " + loveStory.author);
		
	}
}
