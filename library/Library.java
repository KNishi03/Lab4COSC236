package lab4.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available


	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)

	// DONE: implement functionality of Member class
	private List<Book> catalog;
	private List<Member> members;

	public Library() {
		this.catalog = new ArrayList<>();
		this.members = new ArrayList<>();
	}

	// Creator principle: responsible for creating and adding new books
	public void addBook(Book book) {
		catalog.add(book);
	}


	// Creator Principle: responsible for creating and adding new members
	public void registerMember(Member member) {
		members.add(member);
	}


	//remove book
	public void removeBook(String title) {
		Book book = findBookByTitle(title);
		if (book != null) {
			catalog.remove(book);
		} else {
			System.out.println("Book not found: " + title);
		}
	}

	//remove member
	public void removeMember(String name) {
		Member member = findMemberById(name);
		if (member != null) {
			members.remove(member);
		} else {
			System.out.println("Member not found: " + name);
		}
	}


	// Information Expert principle: finding a member by name
	public Member findMemberById(String name) {
		for (int i = 0; i < members.size(); i++) {
		    Member member = members.get(i);
		    if (member.getName().equals(name)) {
		        return member;
		    }
		}
		return null;
	}

	// Information Expert Principle: finding a book by title
	public Book  findBookByTitle(String title) {
		for (int i = 0; i < catalog.size(); i++) {
		    Book book = catalog.get(i);
		    if (book.getTitle().equals(title)) {
		        return book;
		    }
		}
		return null;
	}

	public List<Book> getCatalog() {
		return catalog;
	}

	public List<Member> getMembers() {
		return members;
	}
}
