public class Point2{
	int x;
	int y;
	
	public double distanceFromOrigin(){
		return Math.sqrt(x*x+y*y);
	}
	
	public void translate(int dx,int dy){
		x+=dx;
		y+=dy;
	}
}


public class pointMain2{
	public static void main(String[] args){
		
		Point2 pnt = new Point2();
		pnt.x=3;
		pnt.y=8;
		
		pnt.translate(2,-1);
		System.out.println("point1=("+pnt.x+","+pnt.y+")");
		
		System.out.println("point1=("+pnt.x+","+pnt.y+")");
		System.out.println("distance From Origin =" + pnt.distanceFromOrigin());
	}
}