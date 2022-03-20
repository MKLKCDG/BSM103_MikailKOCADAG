public class Point{
	int x;
	int y;
	
}



public class pointMain{
	public static void main(String[] args){
		
		Point point1 = new Point();
		point1.=5;
		point1.y=4;
		
		Point point2 = new Point();
		point2.=-3;
		point2.y=4;
		
		
		System.out.printl("("+point1.x","point1.y+")");
		double dist = Math.sqrt(point1.x*point1.x+point1.y*point1.y);
		System.out.printl("distance from orijin = "+dist);
		
		System.out.printl("("+point2.x","point2.y+")");
		double dist2 = Math.sqrt(point2.x*point2.x+point2.y*point2.y);
		System.out.printl("distance from orijin = "+dist2);
		
		point1.x +=10;
		point1.y +=6;
		point2.x +=1;
		point2.y +=7;
		System.out.printl("point1 =("+point1.x","point1.y+")");
		System.out.printl("point1 =("+point2.x","point2.y+")");
	}
}