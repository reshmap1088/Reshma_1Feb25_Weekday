package Pack_Shape;

public class CalculateShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle();
		c.calculateArea();
		c.calculatePerimeter();
		System.out.println("============");
		Rectangle r=new Rectangle();
		r.calculateArea();
		r.calculatePerimeter();
		System.out.println("============");
		Triangle t=new  Triangle();
		t.calculateArea();
		t.calculatePerimeter();
		
	}

}
