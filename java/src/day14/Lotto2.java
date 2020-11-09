package day14;

import java.util.Arrays;
import java.util.Random;

public class Lotto2 {

	protected int [] numbers = new int [6];
	
	//1~45이의 정수를 생성하여 반환하는 메소드(유틸랜덤을사용)
	protected int random() {
		return new Random().nextInt(45)+1;//+1해줘야 45까지
	}
	//로또번호를 랜덤으로 1~45사이의 중복되지않는 번호 6개 생성하는 메소드
	protected void randomLotto() {
		init();//랜덤으로 만들기전에 초기화
		int cnt = 0;//cnt = 저장된 중복되지 않은 랜덤수의 갯수
		while(cnt<6) {
			int r = random();
			if(!contain(r)) {
				numbers[cnt]=r; 
				cnt++;
			}
		}
	}
	//로또 번호 배열에 num가 배열에있는지없는지 체크
	protected boolean contain(int num) throws RuntimeException {
		if(num <=0 || num > 45)//0보다 작은수가없어야하니까
			throw new RuntimeException("숫자는 1~45이여야 합니다.");
		for(int tmp : numbers) {
			if(tmp == num){
				return true;
			}
		}
		return false;
	}
	//로또 번호 배열을 초기화 하는 메소드
	protected void init() {
//		for(int i=0; i<numbers.length; i++)
//			numbers[i] = 0 ;
		numbers = new int[6];//초기화
	}
	//로또 당첨 번호 확인을 위한 번호를 문자열로 반환하는 메소드
	@Override
	public String toString() {
		return Arrays.toString(numbers).replace("[", "").replace("]","");
	}
	public void insertNumber(int []arr) {
		if(arr.length < numbers.length)
			throw new RuntimeException("저장하려는 배열의 숫자가 적습니다.");
//		for(int i = 0; i<numbers.length; i++) {
//			numbers[i] = arr[i];
//		}
		System.arraycopy(arr, 0, numbers, 0, numbers.length);
	}
	
}
