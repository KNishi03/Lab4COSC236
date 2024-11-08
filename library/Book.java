package lab4.library;
 
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private boolean isAvailable;
	private String author;

	
	// TODO: implement Book functionality 
	public Book(String title, String author){
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public boolean isAvailable(){
		return isAvailable;
	}
	public boolean borrowBook(){
		if(isAvailable){
			this.isAvailable = !isAvailable;
			return true;
		}else{
			return false;
		}
		
	}
	public boolean returnBook(){
		isAvailable=true;
	}
	
}
