abstract class Animal{
	abstract void eat();
}
class Tiger extends Animal{
	void eat(){
		System.out.println("Tiger eats flesh");
	}
}
class AbstractDemo{
	public static void main(String args[]){
		Tiger t=new Tiger();
		t.eat();
	}
}