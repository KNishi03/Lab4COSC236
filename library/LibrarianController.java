package lab4.library;

import java.util.List;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.

	// DONE: implement functionality of Member class

	private Library library;

	public LibrarianController(Libaray library) {
		this.library = library;
	}

	public String borrowBook(String memberId, String bookTitle) {
		Member member = library.findMemberById(memberId);
		if (member == null) {
			return "No member found.";
		}

		Book book = library.findBookByTitle(bookTitle);
		if (book == null) {
			return "No book found.";
		}

		if (!book.isAvailable()) {
			return "Book is unavailable.";
		}

		book.setAvailable(false);
		member.borrowBook(book);
		return "Book borrowed.";
	}

	public String returnBook(String memberId, String bookTitle) {
		Member member = library.findMemberById(memberId);

		if (member == null) {
			return "No member found.";
		}

		Book book = library.findBookByTitle(bookTitle);
		if (book == null) {
			return "No book found.";
		}

		if (!member.getBorrowedBooks().contains(book)) {
			return "This book was not borrowed by this member.";
		}

		book.setAvailable(true);
		member.returnBook(book);
		return "Book returned.";
	}

	public List<Book> listBorrowedBooks(String memberId) {
		Member member = library.findMemberById(memberId);
		if (member != null) {
			return member.getBorrowedBooks();
		}
		return null;
	}
}

