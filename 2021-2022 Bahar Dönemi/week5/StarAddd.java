import java.util.ArrayList;

public class StarAddddd {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bart�n");
		words.add("kitap");
		System.out.println("d�ng� �ncesi:" +words);
		
		for(int index=0; index < words.size(); index+=2) {
			words.add(index, "*");
		}
		System.out.println("d�ng� sonras�:" +words);
		System.out.println("liste uzunlu�u:" +words.size());
		
		for(int index=words.size()-2; index >=0; index-=2) {
			words.remove(index);
		}
		System.out.println("silme sonras�:" +words);
		System.out.println ("silme liste uzunlu�u:" + words.size());
 }
   }