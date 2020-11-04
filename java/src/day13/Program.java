package day13;

import java.util.Scanner;

/* - 모든 학생 정보 출력기능
 * - 학생 등록기능
 * - 학생 검색기능
 * - 수강 등록기능
 * - 수강 처리기능*/

public interface Program {
	
	void printStudent();
	void insertStudent(Scanner scan);
	void searchStudent();
	void registerSubject();
	void deleteSubject();
}
