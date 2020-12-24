package revIew2;

import java.util.HashMap;
import java.util.Iterator;

public class Test07 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("2020160001", "홍길동");
		map.put("2020160002", "임꺽정");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("학번 : "+key+"이름 : "+value);
		}
	}
	/* 사전을 컬렉션프레임워크를 이용하여 생성하려한다 이때 적당한 컬렉션 프레임워크는?
	 * 1. List o
	 * 2. Set
	 * 3. Map
	 * - List : 단어를 순서대로 출력할 수 있어야 하기 때문에
	 * - 단어와 뜻을 멤버 변수로 갖는 Word클래스를 이용
	 * */

}
