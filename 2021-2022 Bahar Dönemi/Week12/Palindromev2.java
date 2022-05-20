import java.util.Scanner;

public class Palindromev2{
	public static void main(String[] args){
		System.out.printl("Lütfen bir srting giriniz:");
		Scanner in = new Scanner(System.in);
		String inputString= in.nexLine();
		System.out.printl(isPalindrome(inputString));
	}
	
	public static boolean isPalindrome(String text){
		if(text==null){
			return false;
		}
		int left=0;
		int right=text.length()-1;
		while(left<right){
			if(text.charAt(left++) != text.charAt(right--)){
				return false;
			}
		}
		return true;
	}
}