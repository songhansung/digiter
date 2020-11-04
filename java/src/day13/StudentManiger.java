package day13;

import java.util.Scanner;

public class StudentManiger implements Program {
	private Student [] std = new Student[10];
	private int studentCount;
	@Override
	public void printStudent() {
		for(int i = 0 ; i<studentCount; i++) {
			System.out.println("----학생정보----");
			System.out.println(std[i]);
			System.out.println("--------------");
			System.out.println("----수강정보----");
			std[i].print();
			System.out.println("--------------");
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		/* 학생 1명의 정보를 입력받아 객체에저장 
		 * 저장된 객체를 배열에 추가*/
		
		System.out.println("---------------");
		System.out.println("학생정보를 입력하세요");
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주민번호 : ");
		String rNum = scan.next();
		System.out.print("학번 : ");
		String sNum = scan.next();
		System.out.print("학부 : ");
		String faculty = scan.next();
		System.out.print("학과 : ");
		String major = scan.next();
		System.out.print("학기 : ");
		int term  = scan.nextInt();
		System.out.println("--------------");
		Student s = new Student(name, rNum, sNum, faculty, major, term);
		//저장된 객체를 배열에 추가
		if(std.length==studentCount) {
			
		}else {
			std[studentCount]=s;
			studentCount++;
		}
		

	}

	@Override
	public void searchStudent() {
		// 학생정보검색
		// 학생수강정보검색

	}

	@Override
	public void registerSubject() {
		// 수강신청

	}

	@Override
	public void deleteSubject() {
		// 수강철회 

	}
	public void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1.학생등록");
		System.out.println("2.학생확인");
		System.out.println("3.학생검색");
		System.out.println("4.수강신청");
		System.out.println("5.수강철회");
		System.out.println("6.종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");
	}
	public void printAlert() {
		System.out.println("-------------");
		System.out.println("잘못된 메뉴입니다.");
		System.out.println("-------------");
	}
	public void printExit() {
		System.out.println("-------------");
		System.out.println("프로그램 종료");
		System.out.println("-------------");
	}

}
