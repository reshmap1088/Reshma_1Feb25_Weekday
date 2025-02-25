package Pack_Prime;

import java.util.Scanner;

public class CheckPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.print("Enter input to check No is Prime or Not : ");
		int no=input.nextInt();
		
		int flag=0;
		
		for(int i=2;i<no;i++)
		{
			if(no%2==0)
			{
			
				flag++;
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("No  is  prime");
		}
		else
		{
			System.out.println("No is not Prime");
		}
		
	}

}
