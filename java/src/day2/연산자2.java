package day2;

public class 연산자2 {

	public static void main(String[] args) {
		/* 증감연산자 : 최종적으로 변수의 값을 1증/1감소
		 * ++(하나증가), --(하나빼기)
		 * 연산자 위치에 따라서 동작이 약간 다름
		 * 전위형 : ++변수, --변수, 증가를 하고 동작을한다 
		 * 후위형 : 변수++, 변수--, 동적을 하고 증가를한다
		 */
		
		int num1 = 10, num2 = 10, num3=10;
		System.out.println("증가전 num1="+num1+", num2="+num2+",num3="+num3);
		System.out.println("증가중 num1="+ ++num1+", num2="+num2++ +",num3="+num3);
		System.out.println("증가후 num1="+num1+", num2="+num2+",num3="+num3); 
		
		/* 비트연산자 : 변수또는 상수를 비트로 나열한 후 연산
		 *           &, |, -, ^, <<, >>
		 * A & B : A와 B를 비트로 나열한 후 둘다 1이면 1, 하나라도 0이면0
		 * A ^ B : A와 B가 다르면 1, 같으면 0
		 * A <<B : A를 2의B제곱으로 곱한결과
		 * A >>B : A를 2의B제곱으로 나눈결과
		 * 10 & 12
		 * 10: 00001010
		 * 12: 00001100
		 * 10&12:00001000 =>8
		 * 10|12:00001110 =>14
		 * 10^12:00000110 =>6
		 * ~10  :11110101 =>-11
		 * 10<<2:00101000 =>40
		 * 10>>2:00000010 =>2
		 */
		
		System.out.println("10&12:"+(10&12));
		System.out.println("10&12:"+(10|12));
		System.out.println("10&12:"+(10^12));
		System.out.println("10&12:"+(~10));
		System.out.println("10&12:"+(10<<2));
		System.out.println("10&12:"+(10>>2));
		
		/* 조건선택연산자 : (조건식) ? A:B;
		 *             조건식이 참이면A 거짓이면 B를선택 
		 * 조건식 : 결과가 참 또는 거짓으로 나오는 식, 비교, 논리연산자가 들어간 식
		 */
		// num가 2의 배수인지 아닌지를 조건선택연산자를 이용하여 확인하는 매체
		int num=10;
		boolean iseven =(num%2==0)? true : false;
		System.out.println(num+"는 짝수입니까?"+ iseven);
		
		//연산자 우선순위 : 우선순위는 ()가 제일높다
		
		//조건문 : 조건에 따라 결과가 달라지는 문법
		// if문
		// switch case문 
		
			
	}

}
