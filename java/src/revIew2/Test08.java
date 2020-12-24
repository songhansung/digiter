package revIew2;


import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		/* - 정수 n을 입력받고 입력받은 수많큼 단어와 뜻을
		 * 	 입력받아 저장하고 출력하는 코드를 작성하세요.
		 * */
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String[] str = new String [num];
		String[] name = new String [num];
		System.out.println("정수를 입력하세요 : ");
		num = scan.nextInt();
		for(int i = 0 ; i<str.length ; i++) {
			for(int j=0 ; j<name.length; j++) {
				System.out.print("단어를입력하세요 : ");
				num = str.length;
				str[i] = scan.next();
				System.out.print("뜻을 입력하세요 : ");
				num = name.length;
				name[j] = scan.next();
				System.out.println(str[i] +":"+name[j]);
			}
		}
		
	}

}
