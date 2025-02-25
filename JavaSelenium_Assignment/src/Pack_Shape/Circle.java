package Pack_Shape;

public class Circle implements Shape  {

	long areaOfCircle,perimeterOfCircle;
	int r=3;
	float PI=3.14f;
	
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		areaOfCircle = (long) (PI * ( r*r));
		System.out.println("Area of Circle : "+areaOfCircle);
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		perimeterOfCircle=(long) (2*PI*r);
		System.out.println("Perimeter of Circle : "+perimeterOfCircle);
	}

}
