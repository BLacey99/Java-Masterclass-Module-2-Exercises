
public class calc {

	public double area(double radius) {
		double area;
		
		if(radius < 0) {
			System.out.println("-1.0");
			return -1.0;
		}
		else {
			area = radius * radius * Math.PI;
			System.out.println(area);
			return area;
		}
		
		
	}
	
	public double area(double x, double y) {
		double area;
		if( x < 0 ||  y < 0) {
			System.out.println("-1.0");
			return -1.0;
	
		}
		else {
			area = x * y;
			System.out.println(area);
			return area;
		}
	}
}
