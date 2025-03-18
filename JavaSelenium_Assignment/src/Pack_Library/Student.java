package Pack_Library;

public class Student {

	String name;
	int rollNo;
	Book issueBook;
	
public Student(String name,int rollNo,Book issueBook) 
{
	this.name=name;
	this.rollNo=rollNo;
	this.issueBook=issueBook;
	
}	
	public void issueBook(Book book)
	{
		issueBook=book;
		
	}
	
	public Book returnBook()
	{
		issueBook(issueBook);
		return issueBook;
	}
	
	public void displayDetails()
	{
		System.out.println("Student Name:"+name);
		System.out.println("RollNo :"+rollNo);
		System.out.println("Book Details :"+ returnBook());
		
	}
}
