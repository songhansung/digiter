package day14;

import java.util.Random;

public class LottoE extends Lotto2 {
	private int bonus;
	
	@Override
	protected void init() {
		super.init();
		bonus = 0;
	}
	@Override
	public void randomLotto() {
		super.randomLotto();
		while(true) {
			int r = random();
			if(!contain(r)) {
				bonus=r;
				break;
			}
		}
	}
	@Override
	public String toString() {
		return super.toString() +", ["+ bonus + "]";
		
	}
	public void insertNumber(int []arr,int bonus) {
		
	}
	@Override
	public void insertNumber(int []arr) {
		if(arr.length <numbers.length+1)
			throw new RuntimeException("저장하는 배열의 숫자가적습니다.");
		super.insertNumber(arr);
		bonus = arr[numbers.length];
		
		
	}
	
}
