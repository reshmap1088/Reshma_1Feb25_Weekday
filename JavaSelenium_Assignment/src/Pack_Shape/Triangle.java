package Pack_Shape;

public class Triangle implements Shape 
{
	long areaOfTriangle,perimeterOfTriangle;
	int b=10,h=10,c=10,a=10;
	
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		areaOfTriangle  = (long) ((0.5) *(b * h)); 
		System.out.println("Area of Triangle : "+areaOfTriangle);
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		perimeterOfTriangle = (a + b + c);
		System.out.println("Perimeter of Triangle : "+perimeterOfTriangle);
	}

}
