public class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

	public static void main(String[] args) {
		Book book = new Book("�}�C�N���T�[�r�X�̍\�z", "John Thompson");
		System.out.println(book);
	}
}
