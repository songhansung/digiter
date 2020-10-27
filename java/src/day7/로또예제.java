package day7;

public class 로또예제 {

	public static void main(String[] args) {
		int [] lotto = new int[7];//당첨번호,6번지가 보너스번호
		int min=1,max=45;
		randomArray(lotto,min,max);
		printArray(lotto);
	}
	/*기능 : 원하는 범위의 랜덤 값을 알려주는 메소드
	 * 매게변수 : 원하는범위 => 정수 max값,min값 => int max, int min
	 * 리턴타입 : 랜덤값 => int
	 * 메소드명 : random
	 * */
	
	static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)((max - min + 1) * Math.random() + min);
		// if문을 안넣으면 밑에숫자가 1이안나옴
	}
	/* 기능 : 주어진 배열에 모든 번지에 있는 값을 랜덤으로 설정하는 메소드
	 * 매개변수 : 주어진 배열에 모든번지값 => int arr[], int min, int max
	 * 리턴타입 : 모든값 정해진거없음(랜덤) => void
	 * 메소드명 : randomArray
	 * */
	static void randomArray(int []arr,int min,int max) {
		if(max - min+1 <= arr.length) {
			System.out.println("정수의 범위가 배열의 크기보다 작습니다.");
			return ;
		}
		int cnt = 0;//현재까지 만들어진 중복되지않은 랜덤수의 갯수
		while(cnt < arr.length) {
			int r = random(min,max);
			if(!isContain(arr,r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	/*기능 : 주어진 정수 배열의 값들을 콘솔에 출력하는 메소드
	 * 매개변수 : 정수 배열 => int arr[] 
	 * 리턴타입 : 없음 = void
	 * 메소드명 : printArray
	 * */
	
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	/* 기능 : 배열에 특정 값이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 배열 , 특정 값 => int []arr, int num
	 * 리턴타입 : 있는지 없는지 => 참또는거짓 => boolean
	 * 매소드명 : isCotain
	 * */
	static boolean isContain(int []arr,int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
}
