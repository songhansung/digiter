package day10;

public class 추상클래스 {

	public static void main(String[] args) {
		//추상 클래스를 이용하여 객체를 생성할수없다(오른쪽)
		//Animal2 a = new Animal2();
		Animal2 b = new Dog2();
		b.how1();
	}

}
abstract class Animal2{
	public String name;
	public String category;
	public void info() {
		System.out.println("----------");
		System.out.println("이름 : "+ name);
		System.out.println("분류 : "+ category);
		System.out.println("----------");
	}
	public abstract void how1();
	//추 상 클래스를 상속받은 클래스가 추상 클래스가 아니면
	//부모의 추상 메소드를 반드시 구현해야한다.(오버라이딩)
	
}
class Dog2 extends Animal2{

	@Override
	public void how1() {
		System.out.println("멍멍");
	}
	
}