package Pack_LargestNo;

public class FindLargestNo {

	public void getMaxValueFromArray()
	{
		
		int[] array= {11,2,44,6,5,23 };
		
		int largest=array[0];
		
		for(int index=0;index<array.length-1;index++)
		{
			if(array[index]>largest)
			{
				
				largest=array[index];
			}
		}
		
		System.out.println("Largest Element in an Array : "+largest);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindLargestNo large=new FindLargestNo();
		large.getMaxValueFromArray();
	}

}
