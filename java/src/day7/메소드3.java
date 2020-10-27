package day7;

public class 메소드3 {

	public static void main(String[] args) {
		printMulti(4);
		System.out.println(random(1,10));
	}
	/*기능 : 구구단 한단을 출력하는 메소드
	 * 매게변수 : 구구단 => 한단 => 정수 int num 
	 * 리턴타입 : 없음 =>
	 * 매소드명 : printMulti
	 * */
	static void printMulti(int num) {
		for(int i=1; i<=9; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
		
	}
	/*기능 : 원하는 범위의 랜덤 값을 알려주는 메소드
	 * 매게변수 : 원하는범위 => 정수 max값,min값 => int max, int min
	 * 리턴타입 : 랜덤값 => int
	 * 메소드명 : random
	 * */
	
	static int random(int max, int min) {
		return (int)((max - min + 1) * Math.random() + min);
		
	}
}
