package revIew2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		/*	단어장 프로그램을 작성하세요.
		 * 1. 단어 등록
		 * 2. 단어 검색
		 * 3. 단어 수정
		 * 4. 단어 출력
		 * 5. 종료
		 * 
		 * */
		char menu = '0';
		Scanner scan = new Scanner(System.in);
		ArrayList<Word> rgs = new ArrayList<Word>();
		System.out.println("1.단어 등록");
		System.out.println("2.단어 검색");
		System.out.println("3.단어 수정");
		System.out.println("4.단어 출력");
		System.out.println("5.종료");
		System.out.println("----------------");
		
		System.out.print("메뉴를 선택하세요 :");
		menu = scan.next().charAt(0);
		
		switch (menu){
		case'1': Registration(rgs);
		case'2': System.out.println();
		case'3': System.out.println();
		case'4': System.out.println();
		case'5': System.out.println();
		}return;
	}
	public static void Registration(ArrayList<Word> rgs) {
		System.out.println("단어를 입력하세요 : ");
	}
}
