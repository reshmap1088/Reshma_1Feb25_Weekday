package Pack_Shape;

public class Rectangle implements Shape  {

	long areaOfRectangle,perimeterOfRectangle;
	int l=10,w=5;
	
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		areaOfRectangle = l * w;
		System.out.println("Area Of Rectangle : "+areaOfRectangle);
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		perimeterOfRectangle = (l + w) * 2;
		System.out.println("Perimete of Rectangle : "+perimeterOfRectangle);
	}

}
