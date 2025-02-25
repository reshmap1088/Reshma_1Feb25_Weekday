package Pack_SumOfNaturalNos;

public class SumOfNaturalNos {

	public void getSum()
	{
		int sum=0;
		 for(int i=1;i<=10;i++)
		 {
			 sum=sum+i;
		 }
		 
		 System.out.println("Sum of  1 to 10 Natual Nos : "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfNaturalNos sumall=new SumOfNaturalNos();
		sumall.getSum();
	}

}
