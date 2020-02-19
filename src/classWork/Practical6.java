package classWork;


class MyPoint {
	int x, y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class MyCircle {
	MyPoint center = new MyPoint(0,0);
	int radius = 1;
	
	MyCircle() {
		
	}
	
	MyCircle(int x, int y, int radius) {
		this.center.x = x;
		this.center.y = y;
		this.radius = radius;
	}
	
	MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	
	
	
	int getRadius() {
		return radius;
	}
	
	void setRadius(int radius) {
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
	public int getCenterX() {
		return center.x;
	}

	public void setCenterX(int x) {
		this.center.x = x;
	}
	
	public int getCenterY() {
		return center.y;
	}

	public void setCenterY(int y) {
		this.center.y = y;
	}
	

	public int[] getCenterXY() {
		int[] center = new int[] {this.center.x,this.center.y};
		return center;
	}

	public void setCenterXY(int x,int y) {
		this.center.x = x;
		this.center.y = y;
	}

	@Override
	public String toString() {
		return "MyCircle [center=" + center + ", radius=" + radius + "]";
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	double getCircumference() {
		return 2 * Math.PI * radius; 
	}
	
//	double distance(MyCircle another) {
//		
//	}
	
		
	
	
	
}


public class Practical6 {

}
