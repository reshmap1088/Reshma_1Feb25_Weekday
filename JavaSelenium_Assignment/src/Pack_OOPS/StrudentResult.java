package Pack_OOPS;

public class StrudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Student s1=new Student("Reshma", 101, 99f, 80f, 69f);
		Student s2=new Student("Sachin", 103, 92f, 87f, 89f);
		Student s3=new Student("Rachit", 102, 67f, 68f, 79f);

		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
		
		System.out.println("====================");
	//	Student[] s=new Student[3];
		Student[] s= {s1,s2,s3};
		
		for(int i=0;i<s.length;i++)
		{
			//System.out.print(s[i]);
			s[i].displayDetails();
		}
	}

}
