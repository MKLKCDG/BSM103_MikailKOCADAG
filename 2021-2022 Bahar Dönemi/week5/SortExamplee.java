import java.util.ArrayList;
import java.util.Collections;

public class SortExamplee {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bart�n");
		words.add("kitap");
		
		System.out.println("s�ralamadan �nce:" +words);
		System.out.println(words.get(0));
		
		Collections.sort(words);
		System.out.println("s�ralamadan sonra:" +words);
 
	}

}

