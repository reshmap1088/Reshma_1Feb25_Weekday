package Pack_Calci;

public class Calculator {

	public void add(int a,int b)
	{
		System.out.println("a+b="+(a+b));
		
	}
	
	public void add(double a,double b)
	{
		System.out.println("a+b="+(a+b));
	}
	
	public void substract(int a,int b)
	{
		System.out.println("a-b="+(a-b));
	}
	
	public void substract(double a,double b)
	{
		System.out.println("a-b="+(a-b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c=new Calculator();
		c.add(10, 10);
		c.add(20.40, 10.30);
		c.substract(50, 20);
		c.substract(50.1, 10.0);
	}

}
