package day1;

public class 오버플로우 {

	public static void main(String[] args) {
		//정수 값이 정해진 범위를 넘어가는 경우 를 오버플로우라고한다
		//Intager.MAX_VALUE : int의 최대값
		int num = Integer.MAX_VALUE;
		//System.out.println(): 콘솔에 원하는값을 출력하는 메소드(기능)이다.
		System.out.println(num);
		num = num + 1;
		
		
		
		

	}

}
