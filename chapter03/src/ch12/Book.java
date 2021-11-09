package ch12;

public class Book {

	private int bookId;
	private String title;
	private String author;
	
	public Book(int bookId, String title, String author) {
		
		this.author = author;
		this.bookId = bookId;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return bookId +", " +  "[" + title + "]" + ", " + author;
	}
	
	// 책이름, 작가 까지 같아야 true
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book tempBook = (Book)obj;
			// 논리적 설계
			if(this.title == tempBook.title && this.author == tempBook.author) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book(1, "데미안", "홍길동");
		System.out.println(book1);
	} // end of main

}
