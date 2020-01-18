class point {
	int x;
	int y;
	
	void setPoint(int a, int b) {
		x = a;
		y = b;
	}
	
	static double findDistance(point p1, point p2) {
		int x1 = p1.x;
		int y1 = p1.y;
		int x2 = p2.x;
		int y2 = p2.y;
		
		double distance = Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1), 0.5);
		return distance;
	}
	
}
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point p1 = new point();
		point p2 = new point();
		
		p1.setPoint(0,0);
		p2.setPoint(2,2);
		
		double distance = point.findDistance(p1,p2);
        System.out.println("Distance = "+distance);
	}

}
