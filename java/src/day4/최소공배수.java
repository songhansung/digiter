package day4;

import java.util.Scanner;

public class 최소공배수 {

	public static void main(String[] args) {
		/*두 정수 num1과 num2를 입력받아 두정수의 최소 공배수를 출력하는 예재
		 * 공배수는 두정수의 공통으로 있는 배수
		 * 최소 공배수는 공배수중 가장 작은 배수
		 * 10의배수 : 10 20 30 40 50 60 70 80 90 ....
		 * 15의배수 : 15 30 45 60 75 90 100 120....
		 * 10과 15의 공배수 : 30 60 90...
		 * 10과 15의 최소 공배수 : 30
		 * -반복횟수 : i는 num1부터 시작해서 계속하고, i는 nmu1만큼증가
		 * -규칙성 : i num1의 배수이고, i가 num2의 배수이면 i를 출력 후 반복문종료
		 * -*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("두 공배수를 입력하시오 : ");
		int num1,num2,i;
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		for(i=num1 ;  ; i+=num1) {
			if(i%num1==0 && i%num2==0) {
				System.out.println(num1+" 과 "+num2+" 의 최소공배수는 "+i);
				break;
			}
		}
		
		
		
		scan.close();

	}

}
