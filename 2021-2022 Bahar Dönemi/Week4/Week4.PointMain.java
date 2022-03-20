public class Point{
	private int x;
	private int y;
	
	public Point(int initialX, int initialY){
		setLocation(initialX,initialY);
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public double distanceFromOrigin(){
		return Math.sqrt(x*x+y*y);
	}
	public void translate(int dx, int dy){
		setLocation(x+dx,y+dy);
	}
	public void setLocation(int newX,int newy){
		x=newX;
		y=newY;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
}



public class PointMain{
	public static void main(String[] args){
		Point p1= new Point(7,2);
		Point p2= new Point(4,3);
		
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orijine uzaklığı :" +p1.distanceFromOrigin());
		
		System.out.println("p2("+p2.getX()+","+p2.getY()+")");
		System.out.println("orijine uzaklığı :" +p2.distanceFromOrigin());
		
		p1.translate(11,6);
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orijine uzaklığı :" +p1.distanceFromOrigin());
		
		System.out.println("p1= "+p1);
		
		Point p3=new Point(7,2);
		Point p4=new Point(7,2);
		
		
	}
}