package setEx01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	private String userid;
	private String passwd;
	
	public Member(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}
	
	public void disp() {
		System.out.println("아이디 : "+userid+", 비밀번호 : " + passwd);
	}
}

public class SetEx03 {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		set.add( new Member("홍길동", "1111") );
		set.add( new Member("김철수", "2222") );
		set.add( new Member("이영희", "333") );
		
		for(Member mem : set) {
			mem.disp();
		}
		
		System.out.println("---------------");
		Iterator<Member> ir = set.iterator();
		while(ir.hasNext()) {
			ir.next().disp();
		}
		
	}

}








