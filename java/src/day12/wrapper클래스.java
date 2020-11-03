package day12;

public class wrapper클래스 {

	public static void main(String[] args) {
		/* wrapper 클래스는 기본 자료형을 클래스로 변환한것
		 * 차이점 
		 * - 래퍼클래스는 null을 허용, 기본 자료형은 null을 허용하지않음
		 * - 래퍼클래스는 기능(메서드)을 제공*/
		//null은 참조변수만 사용가능 
//		int num1 = null; =>기본 자료형은 null을 사용할 수없음
		Integer num2 = null;
		num2 = Integer.parseInt("1234"); //문자열 1234를 정수로만들어주는 메소드
		System.out.println(num2);
		num2 = Integer.valueOf("5678");
		System.out.println(num2);
		num2 = Integer.valueOf("FF",16);//16진수 FF
		System.out.println(num2);
		int num3 = num2; // 언박싱
		System.out.println(num3);
		num2 = 23; //오토박싱
	}

}
