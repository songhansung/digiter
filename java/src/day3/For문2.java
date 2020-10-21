package day3;

public class For문2 {

	public static void main(String[] args) {
		/* 1부터 10까지 합
		 * 반복횟수 : i는 1부터 10까지 1씩증가
		 * - 초기화 : i는 1부터
		 * - 조건식 : i는 10까지 => i 10보다 작거다 같다
		 * - 증감연산식 : i는 1씩 증가
		 * 규칙성 : sum=sum+i
		 *  sum=0
		 *  i=1, sum0 =0+1
		 *  i=2, sum1 =0+1+2
		 *  i=10, sum2 = 0+1+2+. .... +9+10
		 * 반복문 종료 후: sum을 출력
		 * */
		
		int i, sum;
		
		for(i=1,sum=0 ; i<=10 ;i++) {
			sum=sum+i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		
		/*1부터10까지의 홀수의합*/
		for(i=1,sum=0 ; i<=10 ;i=i+2) {
			sum=sum+i;
		}
		System.out.println("홀수의합 : "+sum);
			
		
		
	}

}
