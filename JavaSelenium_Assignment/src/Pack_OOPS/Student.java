package Pack_OOPS;

public class Student  implements CalculateResult  {

	String name;
	int rollno;
	float marksInEng,marksInMath,marksInHindi;
	float totalmarks;
	float percntage;
	
	public Student(String name,int rn,float marksInEng,float marksInMath,float marksInHindi) {
		// TODO Auto-generated constructor stub
		this.name=name;
		rollno=rn;
		this.marksInEng=marksInEng;
		this.marksInMath=marksInMath;
		this.marksInHindi=marksInHindi;
		
		
	}
	


	@Override
	public float calculateTotalMarks() {
		// TODO Auto-generated method stub
		totalmarks=this.marksInEng+this.marksInMath+this.marksInHindi;
	
		return totalmarks;
	}


	@Override
	public float calculatePercentage() {
		// TODO Auto-generated method stub
		percntage=((totalmarks/300)*100);
		
		return percntage;
	}
	

	
	public void displayDetails()
	{
		
		System.out.println("Name of the Student : "+name);
		System.out.println("Roll No : "+rollno);
	
		
		System.out.println("Total Marks :"+calculateTotalMarks());
		
		System.out.println("Percentage :"+calculatePercentage());
		
		
	}

	
}
