package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx3s {

	public static void main(String[] args) {
		/* 한 학생의 성적을 관리하는 프로그램을 작성하세요
		 * 메뉴
		 * 1. 학생 성적 추가
		 * 2. 학생 성적 조회(전체)
		 * 3. 학생 성적 조회(과목)
		 * 4. 학생 성적 수정
		 * 5. 프로그램 종료
		 * */
		/*5 번 메뉴를 선택하기 전까지 반복
		 * -반복문
		 * - 변수 :메뉴 */
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		do {
			//메뉴 출력
			printMenu();
			//메뉴입력
			menu = scan.nextInt();
			//입력받은 메뉴에 따른 기능처리 : swihch
			// case 1~5, default : 잘못된기능
			switch(menu) {
			case 1: 
				//1번 기능 : 학생 과목과 성적을 입력받고, 입력받은 정보를 mep에 추가
				/*1. 과목과 성적을 입력
				 * - 과목과 성적을 저장하기 위한 변수
				 * - 과목과 성적을 Scanner로 입력
				 *2. mep 추가
				 * - mep을 생성
				 * - mep을 검색
				 * - 없으면 map추가
				 * 
				 * */
				insert(scan, map);
				break;
			case 2: 
				/*2번기능 : map의 정보를 출력
				 * - Iterator를 이용하여 출력
				 * - Map의 key(subject)값을 set으로 만든후 이용하는 set의 Iterator를 가져옴*/
				print(map);
				break;
			case 3: 
				/* 3번기능 과목을입력받고 , 입력받은 과목의성적을출력
				 * - 과목 입력
				 * - 입력한 과목의 성적 출력
				 * - 단, 해당 과목이 없으면 없다고 출력
				 * Map에서 과목에 대한성적조회*/
				print(scan, map);
				break;
			case 4: 
				/* 과목과 성적을 입력받고, 입력받은 성적으로 수정
				 * - 과목과 성적을 일력
				 * - 과목으로 검색을 해서 없으면 수정할 수 없다고 출력
				 * - 있으면 수정*/
				modify(scan, map);
				break;
			case 5: 
				break;
			default:
				System.out.println("잘못된메뉴");
			}
		}while(menu !=5);
		System.out.println("프로그램 종료");
		scan.close();
	}
	public static void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 학생 성적 추가");
		System.out.println("2. 학생 성적 조회(전체)");
		System.out.println("3. 학생 성적 조회(과목)");
		System.out.println("4. 학생 성적 수정");
		System.out.println("5. 프로그램 종료");
		System.out.println("-----메뉴-----");
		System.out.print("메뉴 선택 : ");
	}
	public static void insert(Scanner scan, HashMap<String, Integer>map) {
		System.out.print("과목 성적을 일렵하세요(예: 영어 100) : ");
		String subject = scan.next();
		int score = scan.nextInt();
		if(map.get(subject) == null) {
			map.put(subject, score);
		}else {
		System.out.println(subject + "는(은) 이미 추가한 과목");
		}
	}
	public static void print(HashMap<String, Integer>map) {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp + " : " + map.get(tmp));
		}
	}
	//오버로딩함 - 객체변수가 달름 
	public static void print(Scanner scan, HashMap<String, Integer>map) {
		System.out.print("조회할 과목 입력 : ");
		String subject = scan.next();
		Integer tmp = map.get(subject);
		if(tmp == null) {
		System.out.println("없는 과목");
		}else {
			System.out.println(subject + " : " + tmp);
		}
	}
	public static void modify(Scanner scan, HashMap<String, Integer>map) {
		System.out.print("과목 성적을 일렵하세요(예: 영어 100) : ");
		String subject = scan.next();
		int score = scan.nextInt();
		Integer tmp2 = map.get(subject);
		if(tmp2 == null) {
			System.out.println(subject + "는(은) 없는 과목이라 수정할 수 없음");
		}else {
			map.put(subject, score);
			System.out.println(subject+"성적이 수정됨");
		}
	}
}
