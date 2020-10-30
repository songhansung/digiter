package day10;

public class 클래스6 {

	public static void main(String[] args) {
		GreenComputerStudent []std = new GreenComputerStudent[10];
		std[0] = new GreenComputerStudent("홍길동", "2002-05-01", 19, "010-1234-5678", "청주");
		std[0].printInfo();
		std[0].printCompany();
		std[0].printcourse();
		std[0].insertCourse("디지털 컨버전스 JAVA 양성과정", "2020.10.19-2021.04.01");
		std[0].printcourse();
		std[1] = new GreenComputerStudent("임꺽정", "의정부");
		std[2] = new GreenComputerStudent("유관순", "청주");
		std[3] = new GreenComputerStudent("이순신", "인천");
		//학생들 중에 이순신 학생이 있는지 검색
		String searchName = "이순신";
		for(GreenComputerStudent tmp : std) {
							/*문자열은 == 로 비교할수없다. 참조변수이니까
							/*참조 변수를 == 로 비교하면 주소가 일치하면 참, 일치하지 않으면 거짓으로 판별한다
							/*안에 있는 값이 서로 같더라도 주소가 다르면 다른것으로 판별한다.
							/*그래서 &&씀 =>하나의 객체를 두개의 참조변수가 공유할때나참
							 *참조변수는 두 참조변수가 같다는걸 확인하기 위한 equals메소드를 만들어야 한다(오버라이딩)
							 */				
			if(tmp != null && tmp.getName().equals(searchName)){
				System.out.println("------------");
				tmp.printInfo();
				System.out.println("------------");
			}
		}
		//학생들 중에 청주사람이있는지
		String searchBranch = "청주";
		for(GreenComputerStudent tmp : std) {
			if(tmp != null && tmp.getBranch().equals(searchBranch)){
				System.out.println("------------");
				tmp.printInfo();
				System.out.println("------------");
			}
		}
	}

}
/* - 학생기본정보 : 학생이름 ,생년월일, 나이, 전화번호
 * - 학원 정보 : 학원 이름, 지점
 * - 학생 수강 정보 : 수강과목, 기간
 * - 학생 기본 정보 출력 
 * - 학생의 학원 정보 출력 기능
 * - 학생 수강 정보 출력 기능
 * - 학생 추가 정보 추가 기능
 * - 생성자
 * */
class GreenComputerStudent{
	private String name;
	private String birthday;
	private int age;// 나이 숫자 
	private String phoneNumber;//0105555<<맨앞에0이붙어서 문자열 string씀
	final static public String company = "그린 컴퓨터 아트학원";//학원이름 안바꿔도대니까 final statci
	private String branch;//지점 - 
	private String []course;//과목
	private String []period;//기간
	private int courseCount;//배열의 갯수
	
	//생성자 Alt+Shift+s using Fields
	public GreenComputerStudent(String name, String birthday, int age, String phoneNumber, String branch) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.branch = branch;
		this.course = new String[10];//과목최대 10개
		this.period = new String[10];//기간 배열을추가해야 출력가능
	}
	
	
	public GreenComputerStudent(String name, String branch) {
		this(name, null, 0, null, branch);//this에 괄호들어가면 생성자
		//참조변수는 null(몰름 최대값)로 초기화많이함.-30번째줄 
	}
	//개인정보 출력기능
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phoneNumber);
		System.out.println("나이 : " + age);
		System.out.println("생일 : " + birthday);
		
	}
	//학원 및 지점명 출력기능
	public void printCompany() {
		System.out.println("학원명 : "+company);
		System.out.println("지점명 : "+branch);
	}
	
	//수강 및 기간 출력기능
	public void printcourse() {
		if(course == null || course.length ==0 || courseCount ==0) {
			System.out.println("수강 이력이 없습니다.");
			return;//리턴쓰면 위에명령어가 실행되면 밑에로갈일이없다
		}
		for(int i = 0; i<courseCount; i++) {
			System.out.println("과정 : " + course[i]);
			System.out.println("기간 : " + period[i]);
		}
	}
	
	public void insertCourse(String course, String period) {
		this.course[courseCount] = course;
		this.period[courseCount] = period;
		courseCount++;//하나등록했으니 하나증가
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}