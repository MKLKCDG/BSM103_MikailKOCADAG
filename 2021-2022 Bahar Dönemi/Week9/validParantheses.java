import java.util.*;

public class validParantheses {
	public static void main (String[]args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Kontrol etmek istedi�iniz ifadeyi giriniz");
		
		String exp = input.next();
		if(validParantheses(exp)) 
             System.out.println("Dengelidir");
		else
			System.out.println("Dengeli De�ilidr");
	}

	public static boolean validParantheses( String str) {
		
		Stack<Character> s = new Stack<Character>();
		
		for(char x: str.toCharArray()) {
			if (x=='{' || x == '[' || x == '(') {
				s.push(x);
			}
			else if(!s.isEmpty() &&(x== ']' && s.peek() == '[' || x== '}' && s.peek() == '{' || x == ')'&& s.peek() == '(')) {
				s.pop();
				
			}
			else {
				
				return false;
			}
			
		}
		return s.isEmpty();
	}
}