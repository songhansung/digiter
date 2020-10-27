package day7;

public class 메소드1 {

	public static void main(String[] args) {
		/* 메소드 : 기능 
		 * 매개변수 : 메소드를 동작시키기위해 필요한 정보
		 * 리턴타입 : 메소드가 동작한 후 일을 시킨 사람에게 알려줘야하는 정보(자료형 표시)
		 * 메소드 선언 및 구현
		 * 리턴타입 메소드명(매게변수){
		 * 		구현;
		 * }
		 * */
		
		//int reault = sum(1,2);
		//System.out.println(reault);
		//sum2(3,4);
		//System.out.println(isPrime(6));
		/* isPrime 메소드를 이용하여 100이하의 소수를 출력하는 코드를
		 * 작성하세요
		 */
		for(int i = 2 ; i<=100; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");			
			}
		}
		System.out.println();
	}
	/* 기능 : 두 정수가 주어지면 두정수의 합을 알려주는 메소드
	 * 매게변수 : 두 정수 => int num1, int num2(자료형 변수명)
	 * 리턴타입 : 합 => 정수 => int
	 * 메소드명 : sum
	 * */
	static int sum(int num1, int num2) {
		int reault = num1 +num2;
		return reault;
	}
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 콘솔에 출력하는 메소드
	 * 매게변수 : int num1, int num2
	 * 리턴타입 : 없음 => void
	 * 메소드명 : sum2
	 */
	static void sum2(int num1,int num2) {
		int reault = num1 + num2;
		System.out.println(reault);
	}
	/* 기능 : 정수가 주어지면 정수가 소수인지 아닌지 알려주는 메소드
	 * 매게변수 : 정수 => int num
	 * 리턴타입 : 소수인지 아닌지 => 참또는 거짓 => boolean
	 * 메소드명 : isPrime
	 * */
	static boolean isPrime(int num) {
		int cnt =0;
		
		for(int i = 1 ; i <= num ; i++ ) {
			if(num % i == 0){
			cnt=cnt+1;
		 }
		}
		if(cnt==2) {
			return true;
		}else {
			return false;
		}
	}
	
}
