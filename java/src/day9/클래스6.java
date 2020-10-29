package day9;

public class 클래스6 {

	public static void main(String[] args) {
		/* 그린 컴퓨터 아트 학원 수강생(전 지점)을 관리하기 위한 클래스를 만들어보세요.
		 * 맴버 변수 : 그린컴퓨터 학원수강생,전화번호 => String name, String phon 
		 * 매소드 : 이름출력, 전화번호출력
		 * 클래스명 : GreenComputerStudent*/
		
		GreenComputerStudent gcs = new GreenComputerStudent();
		gcs.getName();
		
	}
}

class GreenComputerStudent{
	
	private String name;
	private String phon;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhon() {
		return phon;
	}
	public void setPhon(String phon) {
		this.phon = phon;
	}
}
	