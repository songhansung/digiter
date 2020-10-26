package day6;

public class 배열7 {

	public static void main(String[] args) {
		/*5개짜리 배열에 랜덤으로 값을 생성하여 저장한 후 출력하는 예제(예제5-9,p 200
		 * 10~20사이의 랜덤한수 */
		
		int min = 10;
		int max = 20;
		
		
		int size = 5;
		int arr[]= new int[size];
		
		
		for(int i=0; i<arr.length ; i++) {
			arr[i]= (int)((max - min + 1) * Math.random() + min);
			System.out.print(arr[i]+ " ");
		}
		
		
		
		
		

	}

}
