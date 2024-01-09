package features_17;

public class TestRecord {

	public static void main(String[] args) {
		
		Book book=new Book("java", "james gosling", 250.50f);
		System.out.println(book);
		System.out.println("Book-name :"+book.name());
		System.out.println("Book-author :"+book.author());
		System.out.println("Book-price :"+book.price());
	}
}
