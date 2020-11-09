package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		/* 한 학생의 성적을 관리하는 프로그램을 작성하세요
		 * 메뉴
		 * 1. 학생 성적 추가
		 * 2. 학생 성적 조회(전체)
		 * 3. 학생 성적 조회(과목)
		 * 4. 학생 성적 수정
		 * 5. 프로그램 종료
		 * */
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		int score = 0;
		String subject = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	//5번 메뉴를 선택하기 위하여 반복
	Scanner scan = new Scanner(System.in);
	do {
		System.out.println("-----메뉴-----");
		System.out.println("1.학생 성적 추가");
		System.out.println("2.학생 성적 조회(전체)");
		System.out.println("3.학생 성적 조회(과목)");
		System.out.println("4.학생 성적 수정");
		System.out.println("5.프로그램 종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");
		menu = scan.nextInt();
		switch(menu) {
		case'1':input(scan);break;
		case'2':all(scan);break;
		case'3':one(scan);break;
		case'4':reset(scan);break;
		case'5':break;
		default:
			
		}
	}while(menu != '5');
	
	//메뉴 출력
	
	//메뉴를 선택 입력
	
	
	//입력받은 메뉴에 따라 기능 처리
		
	}
	//성적추가
	public static void input(Scanner scan) {
		System.out.println("성적 추가할 학생이름 :");
		scan.next();
		
	}
	//성적조회(전체
	public static void all(Scanner scan) {
		System.out.println("학생 성적 조회(전체)할 이름 : ");
		scan.next();
	}
	//학생 성적조회 (과목
	public static void one(Scanner scan) {
		System.out.println("학생 성적 조회(과목)할 이름 : ");
		scan.next();
	}
	//학생 성적 수정
	public static void reset(Scanner scan) {
		System.out.println("성적수정할 학생이름 : ");
		scan.next();
	}
	
	

}

