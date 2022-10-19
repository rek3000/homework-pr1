public class Library {
	Book[] books;	

	public Library() {
		books = new Book[3];
		books[0] = new Book("Caculus", "David");
		books[1] = new Book("Caculus", "David");
		books[2] = new Book("Caculus", "David");
	}

	public void list() {
		System.out.println("***** LIBRARY *****");
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].title + " -author: " + books[i].author);
		}
	}
	public void lend() {}
}
