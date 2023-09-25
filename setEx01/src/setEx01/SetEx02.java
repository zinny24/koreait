package setEx01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		//String -> 출력 -> 삭제 -> 출력
		                       // hasNext() -> next()
		Set<String> set = new HashSet<>();
		set.add("U.S.A");
		set.add("Korea");
		set.add("Japan");
		
		System.out.println("-------for2-------");
		for(String str : set) {
			System.out.println(str);
		}
		
		set.clear();
		
		System.out.println("-------while------");		
		Iterator<String> ir = set.iterator(); //배열값을 객체에 저장
		while( ir.hasNext() ) { //저장된 객체를 출력
			System.out.println(ir.next());
		}
		
	}

}







