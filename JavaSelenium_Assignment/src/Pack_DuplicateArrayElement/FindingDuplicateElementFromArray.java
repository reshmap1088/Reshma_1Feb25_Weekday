package Pack_DuplicateArrayElement;

public class FindingDuplicateElementFromArray {

	public int duplicateElement()
	{
		int array1[]= {1,2,2,3,4,5};
		int temp=0;
		for(int index=0;index<array1.length-1;index++)
		{
			if(array1[index]==array1[index+1])
			{
				temp=array1[index];
			}
			
		}
		
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	FindingDuplicateElementFromArray a1=new FindingDuplicateElementFromArray();
	int result=a1.duplicateElement();
		
		System.out.println("Duplicate element in an Array1 : "+result);
		
		
	}

}
