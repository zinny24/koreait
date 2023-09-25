package setEx01;

public class Register {
	private int id;
	private String userid;
	private String passwd;
	
	public Register(int id, String userid, String passwd) {
		this.id = id;
		this.userid = userid;
		this.passwd = passwd;
	}
	
	public String getUserid() {
		return userid;
	}
	
		
	public int getId() {
		return id;
	}


	public void disp() {
		System.out.println("회원번호 : "+id+", 회원아이디 : "+userid+", 회원비밀번호 : "+passwd);
	}
}







