package day12;

import java.util.Random;

public class 랜덤클래스 {

	public static void main(String[] args) {
		int random;
		for(int i = 0 ; i<10 ; i++) {
			//new Random().nextInt(a) : 현재 시간을 이용하여 Random 객체를 생성한 후
			//			   0~a-1사이의 정수를 랜덤으로 가져옴
			random = new Random().nextInt(6)+1;
			System.out.print(random+" ");
			//밑에꺼랑 같은코드
//			int min = 1, max = 6;
//			random = new Random().nextInt(max-min+1)+min;
//			System.out.print(random+" ");
		}

	}

}
