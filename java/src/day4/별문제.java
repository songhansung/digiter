package day4;

public class 별문제 {

	public static void main(String[] args) {
		/*이중 반복문을 이용해서 아래와 같이 출력하도록 작성하세요
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * */
		
		int i,j;
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
			System.out.print("*");	
			} System.out.println();
		}
		System.out.println();
		/*이중 반복문을 이용해서 아래와 같이 출력하도록 작성하세요
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
			System.out.print("*");
			} System.out.println();
		}
		System.out.println();
		
		/*이중 반복문을 이용해서 아래와 같이 출력하도록 작성하세요
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
	    
		for(i=1; i<=5; i++) {
			for(j=1; j<=5-i; j++) {
				System.out.print(" ");
			}for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
