class Animal{{
	void eat(){
	System.out.println("Animal is eating.");
	}
}
class dog extends Animal{
	void bark(){
	System.out.println("Dog is Barking .");
	}
}
public class InApp{
	public static void main(String args[]){
	dog d = new dog();
	d.eat();
	d.bark();
	
	}

}

