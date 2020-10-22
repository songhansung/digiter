package day4;

import java.util.Scanner;

public class 최대공약수 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2를 입력받고 두 정수의 최대 공약수를 출력하는 예제
		 * 공약수 : 두정수의 공통으로 있는약수
		 * 최대 공약수 : 두정수의 공약수중 가장큰수
		 * 8과 12의 공약수 : 1 2 4
		 * 8과 12의 최대공약수 : 4
		 * - 반복횟수 : i는 1부터 num1까지
		 * - 규칙성 : i가 num1과 num2의 공약수이면 gcd에 i를저장
		 * => num1을 i로나누었을때 
		 * => num2를 i로나누었을때
		 * 반복문 종료 후 : gcd에 출력
		 * */
		
		Scanner scan=new Scanner(System.in);
		int num1;
		int num2;
		int i;
		int gcd=0;
		System.out.print("정수를입력하세요 :");
		
		num1=scan.nextInt();
		num2=scan.nextInt();
	
		for(i = 1 ; i<=num1 ; i++) {
			if(num1%i==0 && num2%i==0){
				gcd=i;
			}
		}
		System.out.println(gcd);
		/* 두 정수 num1과 num2를 입력받고 두 정수의 최대 공약수를 출력하는 예제
		 * 공약수 : 두정수의 공통으로 있는약수
		 * 최대 공약수 : 두정수의 공약수중 가장큰수
		 * 8과 12의 공약수 : 4 2 1
		 * 8과 12의 최대공약수 : 4
		 * - 반복횟수 : i는 num1부터 1까지 1감소
		 * - 규칙성 : i가 num1과 num2의 공약수이면 i를 출력후 반복문 종료
		 * => num1을 i로나누었을때 
		 * => num2를 i로나누었을때
		 * 반복문 종료 후 : 없음
		 * */
		
		for(i=num1 ; num1>= 1 ; i--) {
			if(num1%i==0 && num2%i==0) {
			System.out.println(num1+"과"+num2+"의 최대 공약수 : " + i);
			break;
			}
		}
		
		
		scan.close();
				
	}

}
