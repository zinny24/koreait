package custPrj;

import java.sql.SQLException;
import java.util.List;

public class CustomerEx {

	public static void main(String[] args) throws SQLException {
		CustomerDao dao = new CustomerDao();
		dao.setCustomer();
		
		List<Customer> list = dao.getCustomers(); //3줄
		
		if( list.isEmpty() ) { //값이 null인 경우
			System.out.println("등록된 고객이 없습니다.");
		
		}else {
			for(Customer c : list) {
				System.out.println(c.toString());
			}
		}
		
	}

}





