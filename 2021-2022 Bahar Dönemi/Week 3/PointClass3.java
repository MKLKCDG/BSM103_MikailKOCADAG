public class Point3{
	int x;
	int y;
	
	public Point3(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public double distanceFromOrigin(){
		return Math.sqrt(x*x+y*y);
	}
	
	public void translate(int dx,int dy){
		x+=dx;
		y+=dy;
	}
}

public class Point{
	public static void main(String[] args){
		
		Point3 pnt = new Point3(4,3);
		
		System.out.printl("point =(+"pnt.x+","+pnt.y+")");
		System.out.printl(pnt.distanceFromOrigin());
	}
}