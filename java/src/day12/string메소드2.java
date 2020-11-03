package day12;

import java.util.Scanner;

public class string메소드2 {

	public static void main(String[] args) {
		/* 5개 짜리 문자열 배열을 생성한 후, 5개의 배열을 입력받는 코드를 입력하세요.
		 * 입력받은 파일 중에 이미지 파일들을 출력하는 코드를 작성하세요.*/
		
		String[] fileName = {"java의정석.txt","String메소드.java","java.png","텍스트.jpg","뒷표지.jpg"};
//		String arr[] = new String[5];
		Scanner scan =new Scanner(System.in);
		

//		for(int i=0; i<arr.length; i++) {
//			System.out.print((i+1)+"번째 파일명 입력 : ");
//			arr[i] = scan.next();
//		}
		String [] img = {"png" , "jpg"};
		System.out.println("--이미지 파일 리스트--");
		for(String tmpFileName : fileName) {
			int index = tmpFileName.lastIndexOf('.');
			String suffix=null;
			if(index == -1) {
				continue;
			}
			suffix = tmpFileName.substring(index+1);
			if(cotains(img, suffix)) {
				System.out.println(tmpFileName);
			}
		}
		
//		String fileName = "String매소드.java";
//		int index2 = fileName.lastIndexOf('.');
//		String suffix = fileName.substring(index2);
//		System.out.println(fileName+"의 확장자 : " + suffix);
		
		scan.close();
		
	}
	/* 기능 : 배열과 찾을 문자열이 주어지면 배열에서 찾을 문자열이 있는지 없는지 확인하여 알려주는메소드
	 * 매개변수 : String[]arr, String search
	 * 리턴타입 : boolean
	 * 메소드명 : cotains
	 * */
	public static boolean cotains(String[]arr, String search){
		if(arr == null || arr.length ==0)
			return false;
		if(search==null) {
			return false;
		}
		for(String tmp : arr) {
			if(search.equals(tmp)) {
				return true;
			}
		}
		return false;
	}
}
