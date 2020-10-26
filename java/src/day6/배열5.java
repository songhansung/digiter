package day6;

import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {
		/*3명의 국어 점수를 입력받아 배열에 저장하고, 3명의 국어점수의 평점과 평균을 
		 * 구하는 예제
		 */
		
		
		
		
		int sum;
		int size = 3;
		int arr1[]=new int[size];
		double aver;
		Scanner scan=new Scanner(System.in);
		System.out.println("3명의 국어점수를 입력하세요 : ");
		arr1[0] =scan.nextInt();
		arr1[1] =scan.nextInt();
		arr1[2] =scan.nextInt();
		
		
		sum=arr1[0]+arr1[1]+arr1[2];
		
		aver=(double)sum / arr1.length;
		
		System.out.println("평점 : "+sum);
		System.out.println("평균 : "+aver);
		System.out.println("----------------");
		
		sum = 0;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(i+1+"번 학생의 국어 성적 : ");
			arr1[i]=scan.nextInt();
			sum = sum+ arr1[i];
		}
		aver=(double)sum / arr1.length;
		
		System.out.println("평점 : "+sum);
		System.out.println("평균 : "+aver);
		
		scan.close();
	}

}
