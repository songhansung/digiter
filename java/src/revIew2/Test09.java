package revIew2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<String> wordList = new ArrayList<String>();
		ArrayList<String> meanList = new ArrayList<String>();
		
		System.out.print("입력할 단어의 갯수 : ");
		int size = scan.nextInt();
		while(wordList.size() < size) {
			System.out.print("단어 : ");
			String word = scan.next();
			System.out.print("의미 : ");
			String mean = scan.next();
			wordList.add(word);
			meanList.add(mean);
		}
		for(int i=0; i<wordList.size(); i++) {
			String word = wordList.get(i);
			String mean = meanList.get(i);
			System.out.println(word + " : " +mean);
		}
		scan.close();
	}

}
