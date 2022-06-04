import java.util.*;
import java.util.function.*;

public class MathTutor{
	public static void main(String[] args){
		Scanner console=new Scanner(System.in);
		giveProblems(console,3,"*",(x,y)->x*y);
	}
	public static void giveProblems(Scanner console,int numProblems,String text, IntBınaryOperator operator){
		Random r = new Random();
		int numRight=0;
		for(int i=0;i<numProblems;i++){
			int x=r.nextInt(12)+1;
			int y=r.nextInt(12)+1;
			System.out.println(x+" "+text+" "+y+"=");
			int ansewer=operator.applyAsInt(x,y);
			int response=console.nextInt();
			if(response==ansewer){
				System.out.println("dogru");
				numRight++;
			}else{
				System.out.println("yanlış cevap" + ansewer);
			}
			System.out.println(numProblems+"cevaptan dogru sayısı" +numRight);
		}
	}
}