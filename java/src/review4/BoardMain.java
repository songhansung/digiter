package review4;

import java.util.*;

public class BoardMain {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 1. 게시글 등록//번호 제목 내용 작성자 작성일
		 * 2. 게시글 조회//특정 게시글 조회
		 * 3. 게시글 수정
		 * 4. 게시글 삭제
		 * 5. 게시글 목록// 번호 제목 작성자 작성일
		 * 6. 종료
		 * */
		ArrayList<Board> list = new ArrayList<Board>();
		int menu = 6;
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택(입력)
			menu = scan.nextInt();
			String title, contents, writer;
			Board tmpBoard;
			int num;
			int index = -1;
			int subMenu;
			int count = 0;//제목 / 내용 / 작성자에 의해 검색된 게시글의 갯수
			//선택(입력)된 메뉴에 따라 기능을 동작
			switch(menu) {
			case 1:
				//1. 게시글 등록 기능 수행
				addBoard(list);
				break;
			case 2:
				//2. 게시글 조회
				System.out.println("-------------------");
				System.out.println("1. 번호 조회");
				System.out.println("2. 제목 조회");
				System.out.println("3. 내용 조회");
				System.out.println("4. 작성자 조회");
				System.out.println("-------------------");
				System.out.print("조회 종류 선택 : ");
				subMenu = scan.nextInt();
				switch(subMenu) {
				case 1:
					//확인하고자하는 게시글의 번호를 입력
					System.out.println("-------------------");
					System.out.println("조회하려는 게시글 번호를 입력하세요");
					System.out.println("-------------------");
					System.out.print("번호 : ");
					num = scan.nextInt();
					//입력한 번호에 맞는 게시글이 있는지 리스트에서 확인
					printBoardByNum(list, num);
					//있으면 해당 게시글 출력
					break;
				case 2:
					printBorad(list,"제목");
					break;
				case 3:
					printBorad(list,"내용");
					break;
				case 4:
					printBorad(list,"작성자");
					break;
					default:System.out.println("잘못된메뉴입니다.");
				}
				break;
			case 3:
				//3. 게시글 수정
				//수정할 게시글번호 입력
				System.out.println("-------------------");
				System.out.println("수정하려는 게시글 번호를 입력하세요");
				System.out.println("-------------------");
				System.out.print("번호 : ");
				num = scan.nextInt();
				//해당번호 게시글이있으면 수정 한후 수정완료됬다고출력
				//해당번호 게시글이없으면 없다고출력
				modifyBoardByNum(list, num);
				break;
			case 4:
				//4. 게시글 삭제
				//삭제할 게시글번호 입력
				System.out.println("-------------------");
				System.out.println("삭제하려는 게시글 번호를 입력하세요");
				System.out.println("-------------------");
				System.out.print("번호 : ");
				num =scan.nextInt();
				//주어진 번호와 일치하는 게시글 삭제
				deleteBoardByNum(list, num);
				break;
			case 5:
				//5.게시글 목록
				for(Board tmp : list) {
					System.out.println(tmp);	
				}
				if(list.size() == 0) {
					System.out.println("-------------------");
					System.out.println("등록된 게시물이 없습니다.");
				}
				break;
			case 6:
				System.out.println("-------------------");
				System.out.println("프로그램이 종료되었습니다.");
				break;
				default:
					System.out.println("-------------------");
					System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 6);
		scan.close();
	}
	/* 기능 : 메뉴를 출력하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 => void
	 * 메소드명 : printMenu
	 * */
	public static void printMenu() {
		System.out.println("-------------------");
		System.out.println("1.게시글 등록");
		System.out.println("2.게시글 조회");
		System.out.println("3.게시글 수정");
		System.out.println("4.게시글 삭제");
		System.out.println("5.게시글 목록");
		System.out.println("6.프로그램 종료");
		System.out.println("-------------------");
		System.out.print("메뉴 선택 (1~6) : ");
		
	}
	/* 기능 : 리스트에 새 게시글을 추가하는 메소드
	 * 매개변수 : ArrayList<Board> list
	 * 리턴타입 : 없음
	 * 메소드명 : addBoard
	 * */
	public static void addBoard(ArrayList<Board> list){
		if(list == null) {
			throw new NullPointerException("게시글 리스트가 생성되지 않았습니다.");
		}
		//제목을 입력받아 String 객체에 저장
		System.out.println("-------------------");
		System.out.println("새로운 게시글 정보를 입력하세요");
		System.out.println("-------------------");
		System.out.print("제목 : ");
		scan.nextLine();
		String title = scan.nextLine();
		//내용을 입력받아 String 객체에 저장
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		//작성자를 입력받아 String 객체에 저장
		System.out.print("작성자 : ");
		String writer = scan.next();
		//Board클래스의 객체를 제목, 내용, 작성자를 이용하여 생성
		Board tmpBoard = new Board(title,contents,writer);	
		//리스트에 추가
		list.add(tmpBoard);
	}
	/* 기능 : 주어진 번호와 일치하는 게시글을 출력하는 기능
	 * 매개변수 : ArrayList<Board> list, int num //게시글 리스트, 확인할 게시글 번호
	 * 리턴타입 : 없음 =>void
	 * 메소드명 : printBoardByNum
	 * */
	public static void printBoardByNum(ArrayList<Board> list, int num){
		//Objects.equals를 이용하여 리스트에 있는 값과 매개변수의 값을 비교한수, 클래스가 같으면 Board.equals()를 호출
		int index = list.indexOf(new Board(num));
		if(index != -1) {
			//있으면 해당 게시글 출력
			Board tmpBoard = list.get(index);
			tmpBoard.print();
		}else{
			System.out.println("해당 번호와 일치하는 게시물이없습니다");
		}
	}
	/* 기능 : 주어진 번호와 일치하는 게시글을 삭제하는 기능
	 * 매개변수 : ArrayList<Board> list
	 * 리턴타입 :
	 * 메소드명 : deleteBoardByNum
	 * */
	public static void deleteBoardByNum(ArrayList<Board> list, int num) {
		//삭제할 게시글 번호와 일치하는 게시글이 있으면 삭제를하고
		int index = list.indexOf(new Board(num));
		if(index != -1) {
			list.remove(index);
			System.out.println("-------------------");
			System.out.println("게시글이 삭제되었습니다");
		}
		//없으면 삭제할 게시물이없다고 출력
		else {
			System.out.println("해당 번호와 일치하는 게시물이없습니다");
		}
	}
	/* 기능 : 주어진 번호의 게시글을 수정하는 메소드
	 * 매개변수 : ArrayList<Board> list,int num
	 * 리턴타입 : void
	 * 메소드명 : modifyBoardByNum
	 * */
	public static void modifyBoardByNum(ArrayList<Board> list,int num) {
		int index = list.indexOf(new Board(num));
		if(index != -1) {	
			System.out.println("-------------------");
			System.out.println("수정할 게시글 정보를 입력하세요");
			System.out.println("-------------------");
			System.out.print("제목 : ");
			scan.nextLine();
			String title = scan.nextLine();
			System.out.print("내용 : ");
			String contents = scan.nextLine();
			//수정할 내용을 입력
			//게시글을 수정
			Board tmpBoard = list.get(index);
			tmpBoard.setTitle(title);
			tmpBoard.setContents(contents);
		}else {
			System.out.println("해당 번호와 일치하는 게시물이없습니다");
		}
	}
	/* 기능 : 옵션(번호제외)에 따라 게시글을 출력하는 기능
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메소드명 : printBorad
	 * */
	public static void printBorad(ArrayList<Board> list,String option) {
		System.out.println("-------------------");
		System.out.println("조회하려는 게시글"+option+"을 입력하세요");
		System.out.println("-------------------");
		System.out.print(option+" : ");
		scan.nextLine();//서브메뉴 입력후 엔터처리
		String str = scan.nextLine();
		int count=0;
		//반복문을 이용하여 일치하는 게시글이 없을때까지 반복
		for(Board tmp : list) {
			// 일치하는 글이 있으면 글을 출력하고 count 증가
			if(tmp.equalsByOption(str, option)) {
				System.out.println(tmp);
				count++;
			}
		}
		//일치하는 글이 없으면 없다고 출력
		if(count == 0) {
			System.out.println("일치하는 게시물이없습니다");
		}
	}
}





