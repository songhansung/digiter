package day5;

public class 별문제2 {

	public static void main(String[] args) {
		/*for(초기화; 조건식 ; 증감연산식){
		 * 	  실행문; 
		 * }
		 * */
		int i;
		for( i=1; i<=5; i++); {
			System.out.println(i);
		}
		
		/* 일반변수 vs 참조변수
		 * 일반변수는 변수타입(자료형:int.....)을 이용한 변수들로 값을 저장
		 * 참조변수는 주소를 저장하는 변수로, 객체, 배열 등이 있다.
		 * 
		 * 지역변수 : 특정지역에서 사용하는 변수 int i;(중괄호안에서사용가능)
		 * */
		for(int j=1; j<=5; j++) {
			System.out.println(j);
		}
		
		/*      *      i:1
		 *     ** *     i:2
		 *    *** **    i:3
		 *   **** ***   i:4
		 *  ***** ****  i:5
		 * */
		int j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(j=1; j<=i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * */
		
		for(i=1; i<=5; i++){
			for(j=1; j<=5-i; j++) {
				System.out.print(" ");
			}for(j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* ***** **** i=1 
		 *  **** ***  i=2
		 *   *** **   i=3
		 *    ** *    i=4
		 *     *      i=5
		 * */
		
		for(i=1; i<=5; i++) {
			//앞에공백 갯수
			for(j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			//별 갯수
			for(j=1; j<=2*(5-i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
