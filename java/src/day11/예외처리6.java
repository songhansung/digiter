package day11;

public class 예외처리6 {

	public static void main(String[] args) {
		int min = 1, max = 10;
		int []arr ;
		int size = 5;
		int []arr2= new int[5];
		try {
			arr = CreateRandumArr(size, min, max);
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			CreateRandumArr(arr2, min, max);
			for(int i=0; i<arr2.length; i++) {
				System.out.print(arr2[i]+" ");
			}
			System.out.println();
		}catch(Exception e){
			System.out.println("예외발생 : "+e.getMessage());
		}

	}
	/* 기능 : 배열의 길이가 주어지면 주어진 배열의 길이만큼 배열을 생성하여 값을 랜덤으로 
	 * 		 초기화 하여 배열을 반환하는 매소드
	 * 		 단, 배열의 길이는 0보다 크다.(0보다 작으면 예외처리)
	 * 매개변수 : 배열 = int size, 제일작은값 int min, 제일큰값 int max
	 * 리턴타입 : 배열값 = int []
	 * 매소드명 : CreateRandumArr */
	public static int[] CreateRandumArr(int size,int min,int max) throws Exception {
		if(size < 0) {
			throw new Exception("예외발생 : 배열의 길이는 0보다 크거나 같아야됩니다.");
		}
		int []tmp = new int[size];
		for(int i=0; i<size; i++) {
			tmp[i] = (int)(Math.random()*(max-min+1)) +min;
		}
		return tmp;
	}
	/* 기능 : 배열이 주어지면 주어진 배열에 모든값을 랜덤으로
	 * 		 초기화하는 메소드
	 * 		 단, 배열의 길이는 0보다 크다.(0보다 작으면 예외처리)
	 * 매개변수 : 배열 = int []arr, 제일작은값 int min, 제일큰값 int max
	 * 리턴타입 : 배열값 = void
	 * 매소드명 : CreateRandumArr */
	public static void CreateRandumArr(int []arr, int min, int max) throws Exception {
		if(arr==null) {
			throw new Exception("Null을 이용하여 저장할 수 없습니다.");
		}
		if(arr.length==0) {
			throw new Exception("배월의 길이가 0이여서 초기화 할 수 없습니다");
		}
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*(max-min+1)) +min;
		}
	}
}
