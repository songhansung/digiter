package day2;

public class 연산자1 {

	public static void main(String[] args) {
		//비교 연산자 : >, <, >=(크거나같다), <=(작거나같다), ==(같다), !=(비교)
		//비교 연산자는 결과가 참 또는 거짓으로나옴
		// ==와 =을 구별할수 있어야한다
		// A는 B이면 -> A는 B와 같다면
		int num1 = 10, num2 = 20;
		System.out.println("--비교연산값 예제--");
		System.out.println(num1 > num2); 
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		//논리 연산자 : && , ||, !
		// A&&B : A가 참이고, B가 참이면 참 => 하나라도 거짓이면 거짓        
		//학생 성적이 90점이면 A
		//학생 성적이 90점이상이고, 100점이하이면 A
		//학생 성적이 80점이상이고, 90점미만이면 B
		
		//A||B : A가 참이거나 B가참이면 참 => 둘다거짓이면 거짓
		//출석체크를 카드로하거나 비콘으로 하면 출석인정 < 카드만족 비콘만족 (참)
		//!A : A가 참이면 거짓, 거짓이면 참 (거꾸로, 하나만있어도댐)
		
		int score = 90;
		// 성적이 90점이상(이고=&&) 100점이하 표현한것
		System.out.println("--논리연산값 예제--");
		System.out.println(score>=90&& score<=100);
		// 성적이 80점이상(이고=&&) 90점미만 표현한것
		System.out.println(score>=80&& score<90);
		//성적이 0점 미만(이거나),100점 초가이면 잘못된 성적
		//score < 0 || score >100
		
		System.out.println(score > 0 || score>100);
		
		//num3 가 2의배수인것을 확인하시오
		int num3=11;
		System.out.println(num3+"는 2의 배수인가?"+(num3%2==0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
