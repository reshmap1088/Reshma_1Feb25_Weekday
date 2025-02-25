package Pack_MaxMinNo;

public class MaxMinNo {

	
	public  static void getMaxValue(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println("a is Max No");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is Max No");
		}
		else
		{
			
			System.out.println("c is Max No");
		}
		
	}
	
	public  static void getMinValue(int a,int b,int c)
	{
		if(a<b && a<c)
		{
			System.out.println("a is Min No");
		}
		else if(b<a && b<c)
		{
			System.out.println("b is Min No");
		}
		else
		{
			
			System.out.println("c is Min No");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getMaxValue(10, 50, 30);
		getMinValue(10, 50, 30);
	}

}
