class point {
	// initialize the the variables 
	int x;
	int y;
	
	void getdata(int a, int b) {
		// set the values of the variable
		x = a;
		y = b;
	}
	
	static double getdistance(point p1, point p2) {
		// get the points
		int x1 = p1.x;
		int y1 = p1.y;
		int x2 = p2.x;
		int y2 = p2.y;
		
		// find the distance from the given points
		double dist = Math.pow((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1),0.5);
		// return the value
		return dist;
	}	
}

class point_details {
	public static void main (String[] args) {
		// initialize
		point p1 = new point();
		point p2 = new point();
		
		// insert the value
		p1.getdata(0,0);
		p2.getdata(2,2);
		
		// calculate the distance
		double distance = point.getdistance(p1, p2);
		
		// print the distance 
		System.out.println("The the distance between the two co-ordinates is "+distance);
	}
}

/*

OUTPUT :- The distance between the two points is 2.8284271247461903
	
*/	
