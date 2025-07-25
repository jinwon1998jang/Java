package sub2;

import java.awt.desktop.UserSessionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 날짜: 2025. 7. 25.
 * 이름: 장진원
 * 내용: 자바 Delete 실습하기
 */



public class DeleteTest {

	public static void main(String[] args) {
		
		//DB정보
		final String host="jdbc:oracle:thin:@localhost:1521:xe";
		final String user="jinwonj96";
		final String pass="1234";
		
		//조회 결과 반환용 리스트 생성
		List<User1VO> users = new ArrayList<User1VO>();
		
		try {
			//데이터베이스 접속
			Connection conn= DriverManager.getConnection(host, user, pass);
			
			//SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			//SQL 실행
			String sql="SELECT * FROM USER1";
			ResultSet rs = stmt.executeQuery(sql); //SELECT문의 executeQuery()으로 실행하고 ResultSet 반환 !!!
			
			//결과처리(일반적으로 리스트 생성)
			while (rs.next()) { //커서를 다음 ROW로 이동시킴, 이동할 ROW가 없으면 false
				
				//커서가 가리키는 Row의 각 칼럼값을 추출해서 VO객체 초기화
				User1VO vo = new User1VO();
				vo.setUser_id( rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				//리스트 삽입
				users.add(vo);
			}
			
			//데이터베이스 종료
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//리스트 출력
		for(User1VO user1 : users) {
			System.out.println(user1);
			
		}
		
		System.out.println("Delete 완료...");

	}

}
