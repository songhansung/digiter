package revIew3;

public class Board implements Comparable<Board>{
	public static int count = 0;
	private int num;
	private String title;
	private String content;
	private String name;
	private String day;
	
	public Board(int num,String title, String content, String name) {
		super();
		this.title = title;
		this.content = content;
		this.name = name;
		this.num = ++count;
	}
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Board.count = count;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public String toString() {
		return "[" +num+ "]" + "제목 : " + title + ", 내용 : " + content + ", 작성자 : " + name + ", 날짜 : " + day;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (num != other.num)
			return false;
		return true;
	}
	@Override
	public int compareTo(Board o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
