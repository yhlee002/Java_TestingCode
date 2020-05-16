package Java_testing_code;


import java.time.LocalDate;
import java.util.Scanner;
import java.sql.*;

//Connection만들어주는 클래스 생성 후 해당 클래스를 사용해 select, insert, update, delete
class MyConnect{
	public static Connection Connect() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String userId = "root";
		String userPw = "mysql";
		String url = "jdbc:mysql://localhost:3306/testingdb?characterEncoding=utf-8&serverTimezone=Asia/Seoul";
		return DriverManager.getConnection(url, userId, userPw);
	}
}
public class Practice_200504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = MyConnect.Connect();
			
//			INSERT문(1)
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO lolchamp(id, champion_name, property, release_date, last_changed, "
					+ "blue_essence, rp) VALUES (4, 'Anivia','Battlemage', '2009-07-10', 10.6, 3150, 790)");
			System.out.println("삽입 성공");
			
			
			
//			INSERT문(2)
//			String sql = "INSERT INTO lolchamp(champion_name, property, release_date, last_changed, "
//					+ "blue_essence, rp) VALUES (?, ?, ?, ?, ?, ?)";
//			pst = conn.prepareStatement(sql);
//			System.out.println("Input champion name"); String name = sc.nextLine();
//			System.out.println("Input champion property"); String property = sc.nextLine();
//			System.out.println("Input champion release date"); 
//			String[] str = (sc.nextLine()).split("-");
//			LocalDate release_date = LocalDate.of(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
//			System.out.println("Input version last changed"); Double lastchanged = sc.nextDouble();
//			System.out.println("Input blue_essence"); int blue_ess = sc.nextInt(); sc.nextLine();
//			System.out.println("Input rp"); int rp = sc.nextInt(); sc.nextLine();
//			
//			pst.setString(1, name);
//			pst.setString(2, property);
//			pst.setDate(3, Date.valueOf(release_date)); //Date.valueOf(LocalDate) : date로 바꿔줌
//			pst.setDouble(4, lastchanged);
//			pst.setInt(5, blue_ess);
//			pst.setInt(6, rp);
//			
//			pst.executeUpdate();
//			System.out.println("삽입 완료");

			
			
//			SELECT문
//			String sql = "select * from lolchamp where id = ?";
//			pst = conn.prepareStatement(sql);
//			System.out.println("검색할 index 입력");
//			int id = sc.nextInt();
//			pst.setInt(1, id);
//			ResultSet rs = pst.executeQuery(); //처리한 row 수 반환
//			//여기에 sql을 인자로 넣을 경우 물음표가 세팅되지 않은 채로 들어가기 때문에 비워준다.
//			ResultSetMetaData rsmd = pst.getMetaData();
//			while(rs.next()) {
//				for(int i = 1; i <= rsmd.getColumnCount(); i++) {
//					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i));					
//				}
//			}
			
			
			
//			UPDATE문
//			String sql = "update lolchamp set champion_name=?, property=?, release_date=?, last_changed=?, blue_essence=?, rp=? where id=?";
//			pst = conn.prepareStatement(sql);
//			
//			System.out.println("수정할 id를 입력하세요."); int id = sc.nextInt(); sc.nextLine();
//			System.out.println("Input champion name"); String name = sc.nextLine();
//			System.out.println("Input champion property"); String property = sc.nextLine();
//			System.out.println("Input champion release date"); 
//			String[] str = (sc.nextLine()).split("-");
//			LocalDate release_date = LocalDate.of(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
//			System.out.println("Input version last changed"); Double lastchanged = sc.nextDouble();
//			System.out.println("Input blue_essence"); int blue_ess = sc.nextInt(); sc.nextLine();
//			System.out.println("Input rp"); int rp = sc.nextInt(); sc.nextLine();
//			
//			pst.setString(1, name);
//			pst.setString(2, property);
//			pst.setDate(3, Date.valueOf(release_date)); 
//			pst.setDouble(4, lastchanged);
//			pst.setInt(5, blue_ess);
//			pst.setInt(6, rp);
//			pst.setInt(7, id);
//			
//			int rows = pst.executeUpdate();
//			if(rows > 0) {
//				System.out.println("수정 완료");	
//			}
			
			
			
//			DELETE문
//			String sql = "DELETE FROM lolchamp WHERE id=?";
//			pst = conn.prepareStatement(sql);
//			System.out.println("삭제할 레코드의 id를 입력하세요.");
//			int id = sc.nextInt();
//			pst.setInt(1, id);
//			int rows = pst.executeUpdate();
//			if(rows>0) {
//				System.out.println("삭제 성공");
//			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("실패");
			e.printStackTrace();
		}finally {
				try {
					if(pst != null) {
					pst.close();
					
					}
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		sc.close();
	}

}
