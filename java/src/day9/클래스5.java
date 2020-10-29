package day9;

import day8.Card;

public class 클래스5 {

	public static void main(String[] args) {
		/* final은 클래스, 변수, 맴버 매소드에 붙일 수 있다.
		 * final : 수정할 수 없다.
		 * final 변수 : 상수
		 * final 맴버 메소드 : 메소드 오버라이딩을 할 수 없다.
		 * final 클래스 : 상속할 수 없다. =>부모 클래스가 될 수 없다.
		 * */

		final int STUDENT_COUNT = 10;
		//STUDENT_COUNT에 static이 없으면 객체 맴버 변수이므로 클래스 맴버 매소드인 main에서 사용할 수없다.
		System.out.println(STUDENT_COUNT);
		//STUDENT_COUNT = 20;//불가능
		Card c1 = new Card();
		final Card c2 = c1;
		//c2 = null; //불가능
		System.out.println(Math.PI);

	}

}
