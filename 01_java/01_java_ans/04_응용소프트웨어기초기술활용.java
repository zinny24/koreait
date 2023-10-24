/*
create database kordb;
use kordb;

create table kordb_member(
mem_id int not null auto_increment,
mem_name varchar(20) not null,
mem_pwd varchar(20) not null,
mem_date date,
mem_gender char(2),
mem_intro text,
primary key(mem_id)
);
 */

import java.io.IOError;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member {
    private int memID;
    private String memName;
    private String memPwd;
    private LocalDate memDate;
    private String memGender;
    private String memIntro;

    public int getMemID() {
        return memID;
    }

    public void setMemID(int memID) {
        this.memID = memID;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemPwd() {
        return memPwd;
    }

    public void setMemPwd(String memPwd) {
        this.memPwd = memPwd;
    }

    public LocalDate getMemDate() {
        return memDate;
    }

    public void setMemDate(LocalDate memDate) {
        this.memDate = memDate;
    }

    public String getMemGender() {
        return memGender;
    }

    public void setMemGender(String memGender) {
        this.memGender = memGender;
    }

    public String getMemIntro() {
        return memIntro;
    }

    public void setMemIntro(String memIntro) {
        this.memIntro = memIntro;
    }

    @Override
    public String toString() {
        return memID + "\t\t\t"+memName+"\t\t"+memPwd+"\t\t"+memGender+"\t\t"+memDate+"\t\t" + memIntro;
    }
}

class CrudDao {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    CrudDao cd = null;

    List<Member> aList = null;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/kordb";
            String id = "koreait";
            String pwd = "1234";

            conn = DriverManager.getConnection(url, id, pwd);
//            System.out.println("연결 성공");
        }catch(Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

    public void insertData(Member m) throws SQLException {
        cd = new CrudDao();
        conn = cd.getConnection();

        String SQL = "INSERT INTO kordb_member VALUES(NULL, ?, ?, NOW(), ?, ?);";
        pstmt = conn.prepareStatement(SQL);

        pstmt.setString(1, m.getMemName());
        pstmt.setString(2, m.getMemPwd());
        pstmt.setString(3, m.getMemGender());
        pstmt.setString(4, m.getMemIntro());
        
        int row = pstmt.executeUpdate();
        if(row > 0) {
            System.out.println("회원 등록이 완료 되었습니다.");
            System.out.println("");
        }else{
            System.out.println("관리자에게 문의하세요");
            System.out.println("");
        }
    }

    public List<Member> getList() throws SQLException {
        cd = new CrudDao();
        conn = cd.getConnection();
        aList = new ArrayList<>();

        String SQL = "SELECT * FROM kordb_member ORDER BY mem_id DESC;";
        pstmt = conn.prepareStatement(SQL);
        rs = pstmt.executeQuery();

        while(rs.next()) {
            Member m = new Member();
            m.setMemID(rs.getInt(1));
            m.setMemName(rs.getString(2));
            m.setMemPwd(rs.getString(3));
            m.setMemDate(rs.getDate(4).toLocalDate());
            m.setMemGender(rs.getString(5));
            m.setMemIntro(rs.getString(6));
            aList.add(m);
        }

        return aList;
    }
}

public class Ex11 {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        CrudDao cd = new CrudDao();
        boolean run = false;

        while(!run) {
            System.out.println("");
            System.out.println("1.출력 | 2.입력 | 3.종료");
            System.out.print("선택 > ");
            int menu = sc.nextInt();
            System.out.println("");

            switch(menu) {
                case 1:
                    List<Member> aList= cd.getList();
                    System.out.println("=========================================================================================");
                    System.out.println("회원번호\t\t회원이름\t\t비밀번호\t\t성별\t\t등록일\t\t\t자기소개");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    for(Member m : aList) {
                        System.out.println(m.toString());
                    }
                    break;

                case 2:
                    System.out.print("이름 : ");
                    String name = sc.next();

                    System.out.print("비밀번호 : ");
                    String pwd = sc.next();

                    System.out.print("성별 : ");
                    String gender = sc.next();

                    System.out.print("자기소개 : ");
                    sc.nextLine(); //띄어쓰기 입력을 위한 팁
                    String intro = sc.nextLine();

                    Member m = new Member();
                    m.setMemName(name);
                    m.setMemPwd(pwd);
                    m.setMemGender(gender);
                    m.setMemIntro(intro);

                    cd.insertData(m);
                    break;

                default:
                    System.exit(0);
                    break;
            }

        }

    }
}
