package day3;

import java.util.Scanner;

public class 스위치문1 {

	public static void main(String[] args) {
		/* 모든 조건문은 if문으로 처리할 수 있다
		 * 그 중에서 일부는 switch문을 이용하면 깔끔하게 처리할 수 있다.
		 * 기본문법 : switch(식/변수){
		 * 			case 값1:
		 *            실행문1;
		 *            break;
		 *         case 값2 :
		 *            실행문2;
		 *         break ;
		 *         default :
		 *            실행문3;
		 * }
		 * -----switch 문 if문으로변경하면-----
		 * if(식/변수 == 값1){
		 * 		실행문1;
		 * }else if(식/변수 == 값2){
		 * 		실행문2;
		 * }else{
		 * 		실행문3;
		 * }           
		 * */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num%2 ==0) {
			System.out.println(num+"는 짝수");
		}else {
			System.out.println(num+"는 홀수");
		}
		
		switch(num%2) {
		case 0:
			System.out.println(num+"는 짝수");
			break;
		case 1:
			System.out.println(num+"는 홀수");
			break;
		}
		
		/*	switch(num%2) {
		case 0:
			System.out.println(num+"는 짝수");
			break;
		default:
			System.out.println(num+"는 홀수");
		} 위에값이랑 같음*/
		scan.close();
				

	}

}
