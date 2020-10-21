package day3;

public class For문1 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * 종류 : for문, while문, do while문
		 * - for문과 while문은 문법은 다르지만 동작 방식은 같다.
		 * - do while문은 다르다
		 * for(1.초기화 ; 2.조건식 ; 4.증감연산식 ){
		 * 	   3.실행문;
		 * }
		 * 1. 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화, 반복문 실행시
		 * 			 처음만 실행된다. 생략이 가능하다.
		 * 2. 조건식 : 반복문이 반복을 경정하는 식으로 참이면 반복하고 거짓이면
		 * 			 그만한다. 생략가능(생략하면 무저권 참)
		 * 4. 증감연산식 : 조건문에서 사용하는 변수를 증가/감소시켜서 반복함수를 결정한다
		 * 				생략가능.
		 * */
		
		/* 1~10숫자를 출력
		 * 반복횟수 : num이 1부터 10까지 1씩증가
		 * - 초기화 : num 1
		 * - 조건식 : num 10까지 => num<=10
		 * - 증감연산식 : num 1씩증가 
		 * 규칙성(실행문) : num출력 
		 * 반복문 종료후 : 없음
		 * */
		int num;
		//num=num+1//num++//++num
		for(num = 1 ; num<=10 ; num=num+1 ) {
			System.out.print(num+" ");
		}
		System.out.println();
		/* 10부터 1까지 출력하는 예제
		 * 반복횟수:
		 * 규칙성
		 * 반복문 종료후 : 없음
		 */
        int num1;
		//num1 = num1-1 => num--
		for(num1 = 10 ; num1 >=1 ; num1=num1-1) {
			System.out.print(num1+" ");
		}
		System.out.println();
		/* 1부터 10사이의 모든 짝수를 출력하는 예제
		 * 반복횟수 : 2부터 10까지 2씩증가
		 * - 초기화 : num는 2부터
		 * - 조건식 : num는 10까지 
		 * - 증감연산 : num가 2씩증가
		 * 규칙성 : num를 증가
		 */
		
		for(num1 = 2 ; num1 <= 10 ;num1=num1+2 ) {
			System.out.print(num1+" ");
		}
		System.out.println();
		
		/* 1부터 10사이의 모든 짝수를 출력하는 예제
		 * 반복횟수 : 1부터 10까지 1씩증가
		 * - 초기화 : num는 1부터
		 * - 조건식 : num는 10까지 
		 * - 증감연산 : num가 1씩증가
		 * 규칙성 : num가 짝수이면 num를출력
		 */
		
		for(num1 = 1 ; num1 <= 10 ; num1++) {
			if(num1%2==0)
			System.out.print(num1+" ");
		}
		System.out.println();
		
		/*구구단 7단을 출력하는 예제
		 * */
		
		for(num1= 1 ; num1<= 9 ; num1++) {
			System.out.println("7 x "+ num1 +"="+7*num1);
		}
		System.out.println();
	
	}

}
