package setEx01;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		//HashSet 정수 저장
		//HashSet 문자열 저장
		//삭제, 출력
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		//값을 배열 형태로..		
		
		System.out.println(set.toString());
		System.out.println(set.size());
		
		set.remove(100);
		System.out.println(set.toString());
		System.out.println(set.size());
	}
}










