package mem;

public class memberEx {

	public static void main(String[] args) {
		//줄(dao) -> 칸(member)
		
		MemberDao md = new MemberDao();
		
		md.addMember( new Member("홍길동", "1111") );
		md.addMember( new Member("김철수", "2222") );
		
		md.showInfo();
		
		md.deleteMember("김철수");
		
		md.showInfo();
	}

}











