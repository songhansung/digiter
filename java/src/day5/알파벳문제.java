package day5;

public class 알파벳문제 {

	public static void main(String[] args) {
		/*A~Z까지 반복문을 이용하여 출력하는 예제
		 * */
		for(char ch='A' ; ch<='Z' ; ch++ ) {
			System.out.print(ch+" ");
		}
		/*다음과 같이 출력하도록 코드를 작성하세요
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * ......
		 * ABCD...XYZ
		 * */
		for(char ch='A'; ch<='Z'; ch++) {
			for(char hh='A'; hh<=ch; hh++) {
				System.out.print(hh+" ");
		   }	System.out.println();
		}
		
		
	
	}

}
