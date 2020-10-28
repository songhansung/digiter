package day8;

public class 클래스1 {

	public static void main(String[] args) {
		/* 
		 * 설계도		- 클래스
		 * 제품		- 객체
		 * 기능		- 메소드
		 * 
		 * 클레스
		 * - 속성 (정보)- 멤버 변수
		 * - 기능 -메소드
		 * 
		 * 프린터
		 * - 크기, 제조사, 흑백/칼라 
		 * - 인쇄, 복사, 스캔
		 * 
		 * 멤버 변수의 위치는 메소드 밖, 클래스 안
		 * 멤버 변수는 클래스 안에서 모든 메소드에서 사용할 수 있다.
		 * 
		 * - 객체 선언
		 * 클래스명 객체명;
		 *
		 * - 객체 초기화
		 * 객체명 = new 클래스명();
		 * 
		 * - 맴버 메소드 사용 법
		 * 객체.메소드명();
		 * 
		 * - 같은 클래스 안에있는 메소드를 호출할 때(실행할 떄)는 그냥 사용가능
		 * - 다른 클래스 안에 있는 메소드를 호출할 때는 객채를 이용하여 사용가능
		 * */
		/* 접근제한자
		 * public : 모두 사용가능
		 * protected : 나 + 패키지 +자식클래스 만 사용가능
		 * (default) : 나 + 패키지 만 사용가능
		 * private	 : 나 만 사용 가능
		 * 
		 * -public
		 *  - 멤버 메소드와 멤버 변수에 붙일 때는 크게 문제없이 사용가능.
		 *  - 클래스는 클래스명과 클래스가 있는 파일명이 같은 경우에 public
		 *    을 붙일수 있다.
		 * -private으로 된 멤버 메소드의 변수는 다른 클래스에서 사용할 수 없다.
		 * 
		 * -일반적으로 멤버 변수는 private로하고, 멤버 메소드는 public으로 한다.
		 * -일반적으로 private으로 된 멤버 변수들은 getter와 setter를 만들어서
		 * 	해당 멤버 변수의 값을 변경가능하도록한다. 
		 * -private으로 된 멤버 변수는 public으로 된 멤버 메소드를 통해 접근한다.
		 * 
		 * */
		Point point = new Point();
		/* print라는 메소드는 point 클레스의 메소드이고, 현재 이코드가
		 * 실행되는 클래스는 클래스1이라는 다른 클래스이어서 객체를 이용하여 호출해야한다.
		 */
		point.print();
		point.move(4, 5);
		point.x = 10;
		point.y = 20;
		point.print();
		point.setX1(10);
		point.setY1(20);
		point.print();
	}
}
/* 일반적으로 클래스는 가장 밖에 만든다.
 * 접근제한자 class 클래스명{
 * 	접근제한자 자료명 변수명;
 * }
 * point 클래스 : 2차원 좌표평면의 점을 나타내기 위한 클래스
 * - 속성 : x축좌표, y축좌표
 * - 기능 : x,y좌표 출력기능, x,y좌표 이동기능
 * */
class Point{
	public int x;
	public int y;
	private int x1;
	private int y1;
	/* 기능 : x,y좌표 출력 메소드
	 * 매개변수 : 없음 - x,y좌표는 point 클래스가 스스로 알고 있기 때문에
	 * 			다른곳에서 알려줄 필요가 없다.
	 * 리턴타입 : 없다 (void)
	 * 메소드명 : print*/
	void print() {
		System.out.println("(" + x +"," + y +")");
	}
	/* 기능 : x1, y1좌표로 이동하는 메소드
	 * 매게변수 : 이동할 좌표 => int x1, int y1
	 * 리턴타입 : 없다 (void)
	 * 메소드명 : move
	 * */
	void move(int x1, int y1) {
		x = x1;
		y = y1;
		x1= x2;
		y1= y2;
	}
//	public int getX1() {
//		return x1;
//	}
//	public int getY1() {
//		return y1;
//	}
//	public void getX1(int x) {
//		x1 = x;
//	}
//	public void getY1(int y) {
//		y1 = y;
//	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	
}