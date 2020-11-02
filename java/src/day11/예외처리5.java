package day11;

public class 예외처리5 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		/*RuntimeException이 아닌 예외들은 try catch로 */
		try{
			System.out.println(num1+" / "+num2+"="+div(num1,num2));
			num2 = 0;
			System.out.println(num1+" / "+num2+"="+div(num1,num2));
		}catch(Exception e) {
			System.out.println("예외발생 : "+e.getMessage());
		}
	}
	/* 기능 : 두정수 num1과 num2가 주어졌을 때 num1/num2의 결과를 알려주는 메소드
	 * 		 단, num2가 0일때 예외처리를 하세요
	 * 대체변수 : 정수 = num1 ,num2
	 * 리턴타입 : double = num1/num2결과
	 * 메소드명 : div
	 * */
	public static double div (int num1,int num2){
		if(num2==0) {
			throw new RuntimeException(num2+" 은 예외처리");
		}
		return (double)num1/num2;
	}
}
