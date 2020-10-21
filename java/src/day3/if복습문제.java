package day3;

import java.util.Scanner;

public class if복습문제 {

	public static void main(String[] args) {
		/* 정보처리기사 과목에는 sw1(소프트웨어 설계), sw2(소프트웨어 개발)
		 * db(데이터베이스 구축), program(프로그래밍 언어활용), info
		 * (정보시스템 구축관리)로 구성되어 있다. 
		 * 1. 각 과목의 성적을 입력받고 입력받은 성적을 출력하는 코드를 작성하세요.
		 * 성적은 점수
		 * 2. 과목 중 한 과목이라도 40점 미만이 있으면 과락이라고 출력
		 * 3. 과목의 평균을 구하여서 평균이 60점미만이면 탈락이라고 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을입력하세요(sw1,sw2,db,porgram,info) : ");
		
		//과목점수 변수
		int sw1;
		int sw2;
		int db;
		int porgram;
		int info;
	
		//과목성적 입력코드
		sw1=scan.nextInt();
		sw2=scan.nextInt();
		db=scan.nextInt();
		porgram=scan.nextInt();
		info=scan.nextInt();
		//3.평균값구하는 변수
		int avrage;
		avrage = (sw1+sw2+db+porgram+info)/5;
		
		//2. 과목 중 한 과목이라도 40점 미만이 있으면 과락이라고 출력
		if(sw1<40 ||sw1<40|| db<40|| porgram<40|| info<40) {
			System.out.println("과락");
			}else if(avrage<60) {
				System.out.println("탈락");
			}else {
				System.out.println("합격");
			}
		
		//3. 다섯과목 평균변수값, 평균 구하는값
		
		
		
 		//선생님예시(평균값구하기)
		//double avr =(sw1+sw2+db+porgram+info) /5.0;
		
		
		//출력코드
	    //System.out.println(sw1+","+sw2+","+db+","+porgram+","+info);
	    
	
		scan.close();
				

	}

}
