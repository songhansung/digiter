package day7;

public class 메소드4 {

	public static void main(String[] args) {
		int arr[]= new int[] {1,3,5,7,9,2,4,6,8,10,11};
		printArray(arr);
		//sortArray(arr);
		arr = sortArray2(arr);
		printArray(arr);
		arr = createArray(5);
		printArray(arr);
	}
	/*기능 : 주어진 정수 배열의 값들을 콘솔에 출력하는 메소드
	 * 매개변수 : 정수 배열 => int arr[] 
	 * 리턴타입 : 없음 = void
	 * 메소드명 : printArray
	 * */
	
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			//5번째씩 한줄에 출력하기 위한 코드
			if(i % 5 == 0) {
				System.out.println();
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	/*기능 : 주어진 정수 배열을 정렬하는 메소드
	 * 매개변수 : 주어진 정수 => 배열 => int arr[]
 	 * 리턴타입 : 1. 없음 => void 2. 정렬된배열 => int []
	 * 메소드명 : sortArray
	 * */
	static void sortArray(int arr[]) {
		for(int i= 0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]> arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}	
	}
	static int[] sortArray2(int arr[]) {
		for(int i= 0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]> arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	/* 기능 : 새로운 정수배열을 만들어서 돌려주는 메소드
	 * 매개변수 : 만들어야할 배열,배열의길이 => int[]arr, int size
	 * 리턴타입 : 새로 만든 정수 배열 =>int[]
	 * 메소드명 : createArray
	 * */
	static int[] createArray(int size) {
		return new int[size];
	}
	
}
