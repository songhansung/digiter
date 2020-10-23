package day5;

import java.util.Scanner;

public class 숫자거꾸로문제 {

	public static void main(String[] args) {
		
		System.out.print("양의 정수를 입려하세요 : ");
		
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		int num2= num;
		
		System.out.println(num2+"를 거꾸로 하면");
		while(num != 0) {
			int tmp=num% 10;
			System.out.print(tmp);
			sum= sum+tmp;
			num= num/10;
		}
		System.out.println();
		System.out.println(num2 + "의 각 자리의값 : "+ sum);
		
		scan.close();
		
		

	}

}
