package day11;

import javax.management.RuntimeErrorException;

public class 예외처리1 {

	public static void main(String[] args) {
		try {
		
		System.out.println(calc(1,2,'+'));
		System.out.println(calc(1,0,'-'));
		System.out.println(calc(1,0,'/'));
		System.out.println(calc(1,2,'*'));
		System.out.println(calc(1,2,'%'));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	/* -예외처리방법
	 * 1. 예외가 발생한 메소드가 직접 처리
	 * 	  try~catch문
	 * 2. 예외가 발생한 메소드가 직접 처리하지 않고 해당 메소드를 호출한 메소드에게 시키는방법
	 * 	  throw
	 * -예외 종류 중 
	 *	RuntimeException
	 * - finally
	 * */

	}
	/* 기능 : 두 정수와 산술 연산자가 주어지면 주어진 산술연산결과를 알려주는 메소드
	 * 매개변수 : 두정수 int 산술 연산자 char
	 * 리턴타입 : double 산술연산결과 정수 및 실수(나누기)
	 * 매소드명 : calc
	 * calc 메소드에 static을 붙이는 이유
	 * - 안붙이면 객체 맴버 메소드가 되는데, 객체 맴버 메소드는 클래스 맴버 매소드인
	 *   main에서 호출 할수 없기 때문에 static을 붙여서 클래스 멤버 메소드로 만들어야
	 *   한다.
	 * */
	/* 메소드에서 throw를 하면 메소드 선언부에 throws를 이용하여 발생할 수 있는
	 * 예외를 적어주어야 한다. 단, RuntimeException를 상속받는 클래스는 제외*/
	public static double calc(int num1,int num2,char ch) {
		if((ch=='/'|| ch=='%') && num2==0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다");
		}
		
		switch(ch) {
		case '+' : return num1+num2;
		case '-' : return num1-num2;
		case '/' : return (double)num1/num2;
		case '*' : return num1*num2;
		case '%' : return num1%num2;
		default: throw new RuntimeException(ch+"는 산술연산자가 아닙니다.");
		}
	}

}
