package day10;


public class 상속2 {

	/* 오버라이딩 : 부모클래스에게 물려받은 메소드를 재정의하는 것
	 * - 부모 클래스의 매소드와 일치해야한다
	 * - 접근제한자는 같거나 넒은 접근제한자를 써야한다.
	 * 	 =>범위를 축소할 수 없다.
	 * */
	public static void main(String[] args) {
		Tiger t1= new Tiger();
		t1.info();
		t1.how1();
		Dog d1= new Dog();
		d1.info();
		d1.how1();

	}

}
class Animal{
	private String name;
	private String category;
	public void info() {
		System.out.println("----------");
		System.out.println("이름 : "+ name);
		System.out.println("분류 : "+ category);
		System.out.println("----------");
	}
	public void how1() {
		System.out.println("울음소리");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Animal(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}
	public Animal() {}
}
class Tiger extends Animal{
	public Tiger() {
		/* super 부모를 가르키는 참조변수, super()는 부모 클래스의 생성자*/
		super("호랑이","고양이과");
		//setCategory("고양이과");
		//setName("호랑이");
	}
	@Override
	public void how1() {
		System.out.println("울음소리 : 어흥");
	}
}
class Dog extends Animal{
	public Dog() {
		super("개","개과");
		
	}
	@Override
	public void how1() {
		super.how1();//super 부모클래스 how1을 호출한다음에 추가된 코드가실행됨
		System.out.println("울음소리 : 멍멍");
	}
}