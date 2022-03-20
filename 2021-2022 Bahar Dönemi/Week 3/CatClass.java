public class Cat{
	int age;
	String name;
	String color;
	
	public Cat(){
		this.age=0;
		this.color ="renk girilmedi";
		this.name ="isim girilmedi"
	}
	
	public Cat(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public Cat(String name,String color ,int age){
		this.name=name;
		this.age=age;
		this.color=color;
	}
}



public class main{
	public static void main(String[] args){
		
		Cat kedi1=new Cat();
		
		kedi1.colo="sari";
		System.out.println(kedi1.age+","+kedi1.color+","kedi1.name);
		
		Cat kedi2 = new Cat("Tarcin",2);
		System.out.println(kedi2.age+","+kedi2.color+","kedi2.name);
	}
}