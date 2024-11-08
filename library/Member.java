package lab4.library;

import java.util.ArrayList;
import java.util.List;

public class Member {

	public String memberID;
	public String name;
	List<Book> borrowedBooks = new ArrayList<>();
	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	public Member(String memberID, String name){
		this.memberID = memberID;
		this.name = name;
	}

	private void borrowBooks(Book newBook){
		borrowedBooks.add(newBook);
	}

	private void returnBooks(Book returnedBook){
		borrowedBooks.remove(returnedBook);
	}

	public String getName(){
		return name;
	}

	public List<Book> getBorrowedBooks(){
		return borrowedBooks;
	}
	// TODO: implement collection of borrowed books
	
	// TODO: implement functionality of Member class

}