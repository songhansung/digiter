package day9;

public class 메소드6 {

	public static void main(String[] args) {
		
		System.out.println(calc(1,'+',2));
		System.out.println(calc(1,'-',2));
		System.out.println(calc(1,'*',2));
		System.out.println(calc(1,'/',2));
		System.out.println(calc(1,'%',2));
		System.out.println(rnb(0.5,'+',1.5));
		System.out.println(rnb(0.5,'-',1.5));
		System.out.println(rnb(0.5,'*',1.5));
		System.out.println(rnb(0.5,'/',1.5));
		System.out.println(rnb(0.5,'%',1.5));
	}
	/* 기능 : 두정수와 산술연산자(+,-,*,/,%)가 주어졌을때 산술 연산 결과를
	 * 		 알려주는 메소드
	 * 매게변수 : 두정수 연산자 => int num1 ,char op , int num3
	 * 리턴타입 : 산술연산결과 => 실수 => double
	 * 메소드명 : calc
	 */
	public static double calc(int num1, char op, int num2) {
		switch(op) {
		case '+' : return num1+num2;
		case '-' : return num1-num2;
		case '*' : return num1*num2;
		case '/' : return (double)num1/num2;
		case '%' : return num1%num2;
		}
		return 0;
	}
	/* 기능 : 두실수와 산술연산자(+,-,*,/,%)가 주어졌을때 산술 연산 결과를
	 * 		 알려주는 메소드
	 * 매게변수 : 두실수 연산자 => double num1, char op, double num2
	 * 리턴타입 : double
	 * 메소드명 : rnb ( calc )
	 * */
	public static double rnb(double num1, char op, double num2) {
		switch(op) {
		case '+' : return num1+num2;
		case '-' : return num1-num2;
		case '*' : return num1*num2;
		case '/' : return num1/num2;
		case '%' : return num1%num2;
		}
		return 0;
	}
}
	

