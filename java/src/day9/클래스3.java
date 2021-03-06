package day9;

import day8.Card;
//import 가져오는역할을함
public class 클래스3 {

	public static void main(String[] args) {
		Card c = new Card();
		c.print();
		/*CardPack 클래스는 클래스2.java에서 접근제한자가 default로 
		 * 되어있어서 다른패키지인 클래스3.java에서는 사용할수가 없다*/
		//CardPack cp= new CardPack();
		
		/* c2는 새로운 객체를 생성하여 연결하고 , c3는 c2의 연결된 객체를 공유한다*/
		//card2 c2= new Card2();
		//Card2 c3 = c2;
		Card2 c2 = new Card2('♠',2);
		//c2.setNum(10);
		Card2 c3 = new Card2(c2);
		//Card2 c3 = c2;
		System.out.println(c2.getNum()+","+c3.getNum());
		c2.setNum(11);
		System.out.println(c2.getNum()+","+c3.getNum());
		
	}

}
/*클래스
 * -멤버 변수
 * -멤버 매소드
 * -생성자 : 멤버 변수의 초기화
 * 다음과 같은 품목들이 있을때 맴버 변수와 맴버 매소드를 구분하세요. 자동차클래스
 * - 바퀴의 수, 전원, 시동켜기, 시동끄기, 전진, 후진, 기어, 와이퍼, 와이퍼켜기, 와이퍼끄기
 * 	 속도, 엑셀밞기, 브레이크 밞기
 * 맴버 변수 : 바퀴의 수 ,기어, 와이퍼,속도 ,전원(상태)
 * 맴버 매소드 : 시동켜기, 시동끄기, 전진, 후진,와이퍼 켜기, 와이퍼끄기,엑셀밞기, 브레이크밞기
 * */
 class Card2{
	private int num;
	private char shape;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		//생각 : 왼쪽은 맴버변수, 오른쪽은 매개변수
		//실제 : 둘다 매개변수
		num = num;
		/* this를 꼭 사용해야 하는경우 매개변수의 이름과 멤버 변수의 이름이 같은
		 * 경우이다. 이러한 경우 멤버 변수와 매개변수의 구분이 필요할때 this를 쓴다.
		 * */
		this.num = num;
	}	
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		this.shape = shape;
	} 
	 /* 클래스의 멤버 메소드는 내가 호출하고 싶을 때 호출할 수 있다.
	  * 클래스의 생성자는 new 연산자를 통해 객체를 만들때만 자동으로 호출된다.
	  * */
	//기본 생성자
	public Card2() {
		shape= '◆';
		num = 1;
				
	}
	//생성자 오버로딩
	public Card2(char shape, int num) {
		this.shape =shape;
		this.num = num;
	}
	/*복사생성자(생성자 오버로딩)
	 * public 클래스명A(클래스명A 객채명){
	 * }
	 * */
	public Card2(Card2 card) {
		shape=card.shape;
		num=card.num;
		//디스없어도댐 
	}
	/* 생성자가 하나라도 없으면 기본 생성자가 만들어진다.
	 * */
 }