package day3;

import java.util.Scanner;

public class 약수문제 {

	public static void main(String[] args) {
		/* num를 입력받아 num의 약수들을 출력하는예제
		 * 약수 : 나누어 떨어지는 수
		 * 12의 약수 : 1 2 3 4 6 12
		 * 수    : 1 2 3 4 5 6 7 8 9 10 11 12
		 * 나머지 : 0 0 0 0 2 0 5 4 3 2  1  0
		 * 반복횟수 : i는 1부터 num까지 1씩 증가
		 * - 초기화 : i는 1부터
		 * - 조건식 : i는 num까지
		 * - 증감연산식 : i는 1씩 증가
		 * 규칙성 : i가 num의 짝수이면 i를 출력
		 *       => num를 i로 나누었을때 나머지가 0과 같다면 i를출력
		 */
        Scanner scan=new Scanner(System.in);
        
        int i, num;
        System.out.print("12의 약수 : ");
		num = scan.nextInt();
		
		for(i = 1 ; i <=num ; i++) {
			if(num%i==0) {
		System.out.print(i+" ");
			}
		}
		System.out.println();
		scan.close();
	}

}
