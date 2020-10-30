package day10;

public class 상속5 {

	public static void main(String[] args) {
		//만약 Child 클래스가 parent1, parernt2 모두 상속이가능하다면
		//아래처럼 prine()라는 메소드를 실행했을때 둘중 누구를 실행해야댈지 몰라서 
		//부모가 2명이상이될수없다`
//		Child c = new Child();
//		c.print();
	}

}

class Parent1{
	void print() {
		System.out.println("부모1입니다");
	}
	
}
class Parent2{
	void print() {
		System.out.println("부모2입니다");
	}
	
}
//class Child extends Parent1, Parent2{
//	
//}