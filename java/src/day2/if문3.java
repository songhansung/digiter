package day2;

import java.util.Scanner;

public class if문3 {

	public static void main(String[] args) {
		/* 조건식1이 참이면 실행문1을 실행하고
		 * 조건식1이 거짓이고 조건식2가 참이면 실행문2를 실행하고
		 * 조건식1과 조건식2가 거짓이면 실행문 3을 실행해라
		 * if(조건식1){
		 * 		실행문1;
		 * }eles if(조건식2){
		 * 		실행문2;
		 * }eles{
		 * 		실행문3;
		 * }
		 * */
		/* 정수를 입력받아 입력받은 정수가 양수이면 양수라고 출력하고
		 * 0이면 0이라고 출력하고 음수이면 음수라고 출력하세요
		 * */
		Scanner scan=new Scanner(System.in);
		
		int num;
		System.out.print("정수를 입력하세요 : ");
		num =scan.nextInt();
	
		if(num>0) {
			System.out.println(num+"양수");
		}else if(num<0) { 
			System.out.println(num+"음수");
		}else {
			System.out.println(num);
		}
		
		System.out.println();
		
		/* 성적(정수)을 입력받아 입력받은 성적에 맞는 학점을 출력하세요
		 * 90~100 : A
		 * 80~89  : B
		 * 70~79  : C
		 * 60~69  : D
		 * 0~59   : F
		 * 0미만, 100초과 :잘못된성적
		 */
		
		int socr;
		System.out.print("학점을 입력하세요 : ");
		socr = scan.nextInt();
		
		if(socr>100 || socr<0) {
			System.out.println("잘못된성적");
		}else if(socr>=90) {
			System.out.println(socr+"A");
		}else if(socr>=80) {
			System.out.println(socr+"B");
		}else if(socr>=70) {
			System.out.println(socr+"C");
		}else if(socr>=60) {
			System.out.println(socr+"D");
		}else {
			System.out.println(socr+"F");
		}
		
		/*
		 * if(socr>=90&& socr <= 100) {
			System.out.println(socr+"A");
		}else if(socr>=80&& socr< 90) {
			System.out.println(socr+"B");
		}else if(socr>=70&& socr< 80) {
			System.out.println(socr+"C");
		}else if(socr>=0 && socr< 70) {
			System.out.println(socr+"D");
		}else if{
			System.out.println(socr+"F");
		}else   {
		    System.out.println("잘못된성적");
		}
		*/
			
		scan.close(); 
		
		
		
		

	}

}
