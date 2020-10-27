package day7;

public class 메소드2 {

	public static void main(String[] args) {
		System.out.println(gcd(8,12));
		System.out.println(lcm(3,8));
		System.out.println(lcm2(4,12));

	}
	/* 기능 : 최대 공약수 구하는 메소드
	 * 매게변수 : 두정수 = int num1,int num2
	 * 리턴타입 : 최대 공약수 = int
	 * 메소드명 : gcd
	 */
	static int gcd(int num1,int num2) {
		int res = 1;
		for(int i = 1 ; i<=num1 ; i++) {
			if(num1%i==0 && num2%i==0){
				res=i;
			}
		}
		return res;
	}
	/* 기능 : 최대 공배수 구하는 메소드
	 * 매게변수 : 두정수 = int num1,int num2
	 * 리턴타입 : 최대 공배수 = int
	 * 메소드명 : lcm
	 */
	static int lcm(int num1,int num2) {
		
		for(int i=num1 ;  ; i+=num1) {
			if(i%num2==0) {
				return i;
				
			}
		}
	}
	//최대약수를 이용한 최소공배수 구하기
	static int lcm2(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
	
}
