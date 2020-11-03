package day12;

import java.util.Objects;

public class Objects클래스 {

	public static void main(String[] args) {
		Integer num1 = null;
		System.out.println("num1은 null이 아닌가?"+Objects.nonNull(num1));//nonNull=> 널이아닌지 체크
		System.out.println("num1은 null인가?"+Objects.isNull(num1));//isNull=> 널인지 체크
		Integer num2 = 30;
		System.out.println("num1과 num2가 같은가?"+Objects.equals(num1, num2));//
		System.out.println("num1과 num2가 같은가?"+num1.equals(num2));
	}

}
