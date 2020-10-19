package day1;

public class 자료형변화 {

	public static void main(String[] args) {
		int num1 = (int)1.23;
		/* 자료형변환은 변수 A에 값 B를 저장할때
		 * A와 B의 자료형(변수타입)이 다를 경우 자료형
		 * 변환을 통해 저장해야한다.
		 * 
		 * 자동 자료형변환 : 자료형변환시 생략해도 문제가 없는경우
		 * 없는경우
		 * - 정수형 값을 실수형 변수에 저장할때
		 * - 1바이트 정수값을 int에 저장할때
		 * 명시적 자료형변환 :에러가 발생하거나 필요에 의해 자료형 변환이 필요한경우
		 */
		//자동 자료형변환 
		double num2= 10;
		byte num3 =1;
		int num4 = num3;
		
		//명시적 자료형변환
		int num5=(int)1.23;
		
		
		

	}

}
