package revIew1;

public class Test01 {

	public static void main(String[] args) {
		/* '':문자, "" : 문자열 */
		System.out.println("hello world!");
		/* 변수이름이 num이고 정수 10을 num에 저장하고, 콘솔에 출력하세요
		 * */
		int num = 10;
		System.out.println(num);
		/* 문자열 str1에 Hello를 문자열 str2에 hi를 저장한 후
		 * 두 문자열이 같은 문자열인지 비교하는 코드를 작성하세요
		 * */
		//str1 : 주소를저장함
		String str1 = "hello";
		String str2 = "hi";
		//.equals() :문자열비교 , compareTo()==0
		if(str1.equals(str2)) {
			System.out.println("두 문자열이 같습니다");
		}else {
			System.out.println("두 문자열이 같지않습니다.");
		};
	}

}
