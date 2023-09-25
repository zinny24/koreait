package mapEx;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		//Map - HashMap
		//101 -> 서울
		//102 -> 부산
		//103 -> 대구		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "서울");
		map.put(102, "부산");
		map.put(103, "대구");
		
		//System.out.println(map.toString());
		map.forEach( (k, v) -> {
			System.out.println("키는 "+k+", 값은 " + v);
		});
		
		System.out.println("------------------------");
		/*map
		userid01 -> 홍길동
		userid02 -> 김철수
		userid03 -> 이영희*/
		
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("user01", "홍길동");
		map2.put("user02", "김철수");
		map2.put("user03", "이영희");
		
		map2.put("user03", "코리아");
		
		map2.forEach((key, value) -> {
			System.out.println("key는 "+key+", value는 "+value);
		});
		
		//
		System.out.println(map2.containsValue("김철수2"));
		
		System.out.println(map2.containsKey("user07"));
		
	}
}







