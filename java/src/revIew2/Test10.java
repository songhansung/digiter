package revIew2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Word> list = new ArrayList<Word>();
		System.out.print("입력할 단어의 갯수 : ");
		int size = scan.nextInt();
		while(list.size() < size) {
			System.out.print("단어 : ");
			String word = scan.next();
			System.out.print("뜻 : ");
			String mean = scan.next();
			list.add(new Word(word,mean));
		}
		Collections.sort(list);
		for(Word tmp : list) {
			System.out.println(tmp);
		}
		/* 입력한 단어 중 하나를 검색하여 출력하는 코드를 작성 하세요.*/
		System.out.print("검색단어 : ");
		String search = scan.next();
		for(Word tmp:list) {
			if(tmp.equals(search)) {
				System.out.print("검색된 단어 : ");
				System.out.println(tmp);
			}
		}
		scan.close();
		
	}
}
class Word implements Comparable{
	private String word;
	private String mean;
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public int compareTo(Object o) {
		Word word = (Word)o;
		return this.word.compareTo(word.word);
	}
	@Override
	public String toString() {
		return "[" + word + ":" + mean + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof String) {
			return word.equals(obj);
		}
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
}
