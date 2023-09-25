package mem;

public class Member {
	private String userid;
	private String passwd;
	
	public Member() {}

	public Member(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}

	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public void disp() {
		System.out.println("아이디 : "+userid+", 비밀번호 : "+passwd);
	}
	
	
}




