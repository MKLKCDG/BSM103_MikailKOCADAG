public class Account {

	String isim;
	int para;
	
	public Account(String isim, int para) {
		this.isim=isim;
		this.para=para;
		
	}
	public String toString() {
		return isim+ ":$" +para;
		
	}
}

public class AccountMain {

	public static void main(String[] args) {
     
		String isim = "Janet";
		int para = 25;
		Account a =new Account ( isim,  para);
		 
		mystery(isim, para, a);
		System.out.println(isim +"," + para + "," + a);
		
		para = para + 10;
		a.isim= "Billy";
		
		
		mystery(isim, para,a);
		System.out.println(isim +"," + para + "," + a);
				
	}
	public static void mystery(String isim, int para, Account a) {
		a.para++;
		isim = "Susan";
		System.out.println(isim +"," + para + "," + a);

		
	}

}