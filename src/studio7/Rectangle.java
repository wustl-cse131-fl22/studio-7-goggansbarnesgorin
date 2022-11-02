package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	private String name;
	
	public Rectangle(int isLength, int isWidth) {
		length = isLength;
		width = isWidth;
	}
	
	public int Area() 
	{
		return length*width;
	}
	
	public int Perimeter()
	{
		return 2*length + 2*width;
	}
	
	public boolean isSquare()
	{
		return length == width;
	}
	
	public boolean compareArea(Rectangle r) 
	{
		return Area()>r.Area();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(7, 8);
		Rectangle r2 = new Rectangle(9, 9);
		System.out.print(r1.compareArea(r2));
		
		
	}

}
