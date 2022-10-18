import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Library {
	private int isbnno;
	private String bookName, author;
	private ArrayList<Book> bookList = new ArrayList<Book>();
	public Library(int isbnno, String bookName, String author, ArrayList bookList) {
		super();
		this.isbnno = isbnno;
		this.bookName = bookName;
		this.author = author;
		this.bookList = bookList;
	}
	
	public int getIsbnno() {
		return isbnno;
	}
	public void setIsbnno(int isbnno) {
		this.isbnno = isbnno;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public ArrayList<Book> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	
	void addBook(Book bobj) {
		bookList.add(bobj);
	}
	
	boolean isEmpty() {
		return bookList.isEmpty();
	}
	
	ArrayList<Book> viewAllBooks() {
		
		return bookList;
	}
	
	ArrayList<Book> viewBooksByAuthor(String author) {
	
		for (int i=0 ; i < bookList.size(); i++) {
			System.out.println("Name :" + bookList.get(i).);
		}
	}
	
	int countnoofbook(String bname) {
		return 
	}
	
}

public class library{
	public static void main (String[] args) {
		
		System.out.println("\n 1. Book "
				+ "\n 2.Display all book details "
				+ "\n 3. Search Book by author "
				+ "\n 4. Count number of books - by book"
				+ "\n 5. Exit ");
		
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();
		
		System.out.print("Enter your choice : ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: System.out.println("Enter the isbn no : ");
		int isbnno = sc.nextInt();	
		lib.setIsbnno(isbnno);
		
		System.out.println("Enter the book name : ");
		String bookname = sc.next();
		lib.setBookName(bookname);
		break;
		
		case 2: System.out.println("Displaying Book Details");
		
		break;
		
		case 3: System.out.println("Enter the author name : ");
		String auth_name = sc.next();
		lib.setAuthor(auth_name);
		break;
		
		case 4: System.out.println("Number of Books : "+ lib.countnoofbook(bookname));
		break;
		
		case 5: System.exit(0);
		break;}
}
}