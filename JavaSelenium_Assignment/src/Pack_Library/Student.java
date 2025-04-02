package Pack_Library;

public class Student {

	String name;
	int rollNo;
	Book issueBook;
	boolean isBookIssued;
	
public Student(String name,int rollNo,Book issueBook) 
{
	
	this.name=name;
	this.rollNo=rollNo;
	this.issueBook=issueBook;
	
}	
	public void issueBook()
	{
		//issueBook=book;
		System.out.println("Issued Book Id :"+issueBook.bookID);
		System.out.println("Issued Book Author :"+issueBook.author);
		System.out.println("Issued Book Title :"+issueBook.title);
		
		
		if(isBookIssued==true)
		{
			System.out.println("Return the current book ");
		
		}
		else
		{
			System.out.println("Book issued "+issueBook.title);
			isBookIssued=true;
		}
			
	}
	
	public void returnBook()
	{
		System.out.println("Book returned :"+issueBook.title);
		//return issueBook;
		isBookIssued=false;
	}
	
	public void displayDetails()
	{
		System.out.println("Student Name:"+name);
		System.out.println("RollNo :"+rollNo);
		//System.out.print(issueBook());
	  //  issueBook=	returnBook();
		//System.out.println("Book Details :"+issueBook );
		//System.out.println("Return Book :" + returnBook());
		
	}
}
