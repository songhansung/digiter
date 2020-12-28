package revIew3;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
	
	public static Scanner scan = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		/* 1. 게시글 등록//번호 제목 내용 작성자 작성일
		 * 2. 게시글 조회//특정 게시글 조회
		 * 3. 게시글 수정
		 * 4. 게시글 삭제
		 * 5. 게시글 목록// 번호 제목 작성자 작성일
		 * 6. 종료
		 * */
		int menu;
		ArrayList<Board> list = new ArrayList<Board>();
		
		do {
			printMenu();
			System.out.print("메뉴를 선택하세요(1~6) : ");
			Board tmpBoard;
			menu = scan.nextInt();
			switch(menu) {
			case 1 : 
				Registration(list);
			break;
			case 2 : 
				tmpBoard = InputSearch();
				SearchBoard(list, tmpBoard);
			break;
			case 3 : System.out.println("3. 게시글 수정");
			break;
			case 4 : System.out.println("4. 게시글 삭제");
			break;
			case 5 : BoardList(list);
			break;
			case 6 : System.out.println("6. 종료");
			break;
			default:
				System.out.println("-----------------");
				System.out.println("잘못된 메뉴");
			}
		}while(menu != 6);
	}
	private static void printMenu() {
		System.out.println("-----------------");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 게시글 수정");
		System.out.println("4. 게시글 삭제");
		System.out.println("5. 게시글 목록");
		System.out.println("6. 종료");
		System.out.println("-----------------");
	}
	/* 기능 : 게시글을 게시판에 등록 (번호, 제목, 내용, 작성자)
	 * 매게변수 : ArrayList<Board> list
	 * 리턴타입 : 등록만하면댐 없음 void
	 * 메소드명 : Registration
	 * */
	private static void Registration(ArrayList<Board> list) {
		Board tmp = new Board(0, null, null, null);
		System.out.println("----------------");
		System.out.println("     게시글 등록 ");
		System.out.println("----------------");
		System.out.print("제목 : ");
		tmp.setTitle(scan.next());
		System.out.print("내용 : ");
		tmp.setContent(scan.next());
		System.out.print("작성자 : ");
		tmp.setName(scan.next());
		System.out.print("날짜 : ");
		tmp.setDay(scan.next());
		list.add(tmp);
	}
	/* 기능 : 게시판 조회
	 * 매개변수 : 없다 = Scanner scan 위에만듬
	 * 리턴타입 : 고유번호를가져오면 내용을확인할수있음 있으면참 없으면거짓
	 * 메소드명 : BoardSearch
	 * */
	private static Board InputSearch() {
		System.out.println("----------------");
		System.out.println("     게시판 조회 ");
		System.out.println("----------------");
		Board tmp = new Board(0,null,null,null);
		System.out.print("게시판번호를 입력하세요 : ");
		tmp.setCount(scan.nextInt());
		return tmp;
	}
	private static void SearchBoard(ArrayList<Board> list, Board num) {
		for(Board tmp: list) {
			if(tmp.equals(num)){
				System.out.println("-----검색결과-----");
				System.out.println(tmp);
				return;
			}
		}
		System.out.println("해당번호가 없습니다.");
	}
	/* 기능 : 게시글제목 수정
	 * 매개변수 : ArrayList<Board> list
	 * 리턴타입 : 수정할 제목,내용 => Borad
	 * 메소드명 : BoardModify
	 * */
	private static Board BoardModify() {
		return null;
	}
	/* 기능 : 게시글 삭제
	 * 매개변수 : ArrayList<Board> list
	 * 리턴타입 : 없다
	 * 메소드명 : BoardDelete
	 **/
	private static void BoardDelete() {
		
	}
	/* 기능 : 게시판 전체 목록
	 * 매개변수 : ArrayList<Board> list
	 * 리턴타입 : 없음
	 * 메소드명 : BoardList
	 * */
	private static void BoardList(ArrayList<Board> list) {
		System.out.println("----------------");
		System.out.println("    게시판목록");
		for(Board tmp : list) {
			System.out.println(tmp)	;
		}
	}
}
