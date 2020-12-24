package revIew2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TestMap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<String, String>();
		System.out.print("입력할 단어의 갯수 : ");
		int size = scan.nextInt();
		while(map.size() < size) {
			System.out.print("단어 : ");
			String word = scan.next();
			System.out.print("의미 : ");
			String mean = scan.next();
			map.put(word, mean);
		}
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			String mean = map.get(word);
			System.out.println("단어 : " + word + ", 뜻 : "+ mean);
		}
		scan.close();
	}

}
