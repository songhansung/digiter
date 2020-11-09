package day14;

import java.util.Scanner;

public class 로또프로그램 {

	public static void main(String[] args) {
		RottoManiger rm = new RottoManiger();
		char menu ='0';
		Scanner scan = new Scanner(System.in);
		do {
			rm.printMenu();
			menu = scan.next().charAt(0);
			switch(menu) {
			case'1':rm.randumRotto();break;
			case'2':rm.searchRotto();break;
			case'3':rm.checkRotto();break;
			case'4':rm.actionRotto();break;
			case'5':rm.sudongRotto();break;
			case'6':break;
			default:
				
			}
		}while(menu != '6');
		
		rm.printExit();
		scan.close();

	}

}
