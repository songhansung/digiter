package day12;

public class string메소드1 {

	public static void main(String[] args) {
		String str = "Green Computer";
		//charAt(index) : index 번지에 있는 문자열
		System.out.println("------charAt------");
		System.out.println(str.charAt(0));//0번지에있는 문자열
		//compareTo(str) : str문자열과 비교하여 같으면 0, 본인을 기준으로
		//사전순으로 앞이면 -1,뒤면 1
		System.out.println("------compareTo------");
		System.out.println("b".compareTo("b"));
		System.out.println("b".compareTo("a"));
		System.out.println("b".compareTo("c"));
		//concat : 이어붙이기 더하기연산자와 같은 기능
		System.out.println("------concat------");
		System.out.println("Hello".concat("wolrd"));
		System.out.println("Hello" + "wolrd");
		//equals : 두 문자열이 같은지 아닌지를 확인
		System.out.println("------equals------");
		System.out.println("Hello".equals("Hello"));
		System.out.println("Hello".equals("hello"));
		System.out.println("------indexOf------");
		String str1 = "Hello world";
		char search1 = 'w';
		int index = -1;
		if((index = str1.indexOf(search1))>=0) {
			System.out.println(str1 + " 문자열에는 " + search1 +"가 " + index+ "번째 위치에 있습니다.");
		}
		//위에꺼랑같음
//		char search1 = 'w';
//		int index = str1.indexOf(search1);
//		if(index>=0) {
//			System.out.println(str1 + " 문자열에는 " + search1 +"가 " + index+ "번째 위치에 있습니다.");
		String search2 = "world";
		index = str1.indexOf(search2);
		if((index = str1.indexOf(search2))>=0) {
			System.out.println(str1 + " 문자열에는 " + search2 +"가 " + index+ "번째 위치에 있습니다.");
		}
		index = str1.indexOf(search1,7);
		if(index>=0) {
			System.out.println(str1 + " 문자열에는 " + search1 +"가 " + index+ "번째 위치에 있습니다.");
		}else {
			
		}	System.out.println(str1 + " 문자열에는 " + search1 +"가 " + "7번째이후로는 찾을 수 없습니다.");
		System.out.println("-------replace------");
		System.out.println("Hello World World".replace('W', 'w'));
		System.out.println("Hello world world".replace("world", "java"));
		System.out.println("------split------");
		String[] arr = "dog,cat,tiger".split(",");//쉼표를 기준으로 배열을 나눔 dog 0번지 cat 1번지 tiger 2번지
		for(String tmp : arr) {
			System.out.println(tmp);
		}
		System.out.println("------join------");
		System.out.println(String.join(",", arr));
		System.out.println("------sbstring------");
		String fileName = "String매소드.java";
		int index2 = fileName.lastIndexOf('.');
		String suffix = fileName.substring(index2);
		System.out.println(fileName+"의 확장자 : " + suffix);
		System.out.println("------trim------");
		System.out.println("    Hello      ".trim());
		System.out.println("------valueOf------");
		System.out.println(String.valueOf(1.23));
		String str3=""+123;
		int num1 = Integer.parseInt(str3);
		System.out.println(num1);
		int num2 = Integer.valueOf(str3);
		System.out.println(num2);
	}
}
