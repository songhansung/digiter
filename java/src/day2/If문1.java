package day2;

public class If문1 {

	public static void main(String[] args) {
		// 조건식이 참이면 실행문을 실행해라
		// if(조건식){
		//   }
		
	    //  실행문;
		//~ 면 ...한다
		//~ : 조건식
		//...: 실행문
		/* num가 0이면 0이라고 출력
		 * 조건식 : num가 0이다
		 * 실행문 : 0이라고 출력 
		 */
		int num= 1;
		if(num== 0) {
			System.out.println("num는 0입니다");
		}
		
		/*num 가 0이 아니면 0이 아니라고 출력
		 * 조건식 : num가 0과 같지않다.
		 * 실행문 : 0이 아니라고 출력
		 */
		
		int num1= 1;
	    if(num1!=0) {
			System.out.println("num1는 0이아닙니다");
		}
	    /* num가 양수이면 양수라고 출력(0을 포함하지 않음)*/
	    
	    // num가 음수이면 음수라고 출력(0을 포함하지 않음)
		
	    
	    
		if(num>0) {
			System.out.println("num는 양수");
		}
		if(num<0) {
			System.out.println("num는 음수");
		}

	}

}
