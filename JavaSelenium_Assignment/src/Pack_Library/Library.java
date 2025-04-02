package Pack_Library;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1=new Book(101, "AB", "RP");
		Book b2=new Book(102, "BC", "SK");
		Student s1=new Student("Reshma", 10, b1);
		Student s2=new Student("Sachin", 11, b2);
		
	
		s1.displayDetails();
		s1.issueBook();
		s1.returnBook();
		
		s2.displayDetails();
		s2.issueBook();
		s2.returnBook();
		
	}

}
