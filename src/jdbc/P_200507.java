package jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

class ChampConnectApp{
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/testingdb?characterEncoding=utf-8&serverTimezone=Asia/Seoul";
		String id = "root"; String pw = "mysql";
		return DriverManager.getConnection(url, id, pw);
	}
}


class ChampionDAO{
	public static ChampionDAO dao = new ChampionDAO();
	private ChampionDAO(){}
	public static ChampionDAO getInstance() {
		return dao;
	}
	
	public void selectId(int id) {
		String sql = "select * from lolchamp where id = ?";
		try(Connection conn = ChampConnectApp.getConnection();
				PreparedStatement pst = conn.prepareStatement(sql)){
			
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				ChampionDTO dto = new ChampionDTO(id, rs.getString("champion_name")
								, rs.getString("property")
								, rs.getDate("release_date").toLocalDate()
								, rs.getDouble("last_changed")
								, rs.getInt("blue_essence")
								, rs.getInt("rp")); 
				
				System.out.println(dto);
				System.out.println();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}


class ChampionDTO{
	int id;
	String Champion_name;
	String property;
	LocalDate release_date;
	Double last_changed;
	int blue_essence;
	int rp;
	
	
	public ChampionDTO(int id, String champion_name, String property, LocalDate release_date, Double last_changed,
			int blue_essence, int rp) {
		Champion_name = champion_name;
		this.id = id;
		this.property = property;
		this.release_date = release_date;
		this.last_changed = last_changed;
		this.blue_essence = blue_essence;
		this.rp = rp;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChampion_name() {
		return Champion_name;
	}
	public void setChampion_name(String champion_name) {
		Champion_name = champion_name;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public LocalDate getRelease_date() {
		return release_date;
	}
	public void setRelease_date(LocalDate release_date) {
		this.release_date = release_date;
	}
	public Double getLast_changed() {
		return last_changed;
	}
	public void setLast_changed(Double last_changed) {
		this.last_changed = last_changed;
	}
	public int getBlue_essence() {
		return blue_essence;
	}
	public void setBlue_essence(int blue_essence) {
		this.blue_essence = blue_essence;
	}
	public int getRp() {
		return rp;
	}
	public void setRp(int rp) {
		this.rp = rp;
	}

	@Override
	public String toString() {
		return "ID = " + id + "\nchampion Name = " + Champion_name + "\nproperty = " + property
				+ "\nrelease Date = " + release_date + "\nlast_changed = " + last_changed
				+ "\nblue_essence = " + blue_essence
				+ "\nrp = " + rp;
	}
	
	
	
}


public class P_200507 {
	public static void main(String[] args) {
		//id를 입력받아 해당 레코드의 정보를 출력(DTO 객체에 담아서 따로 다시 출력해야함)해주고(toString overriding),
		//수정할 column의 인덱스(보여주기)를 구분자와 함께 입력.
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 id를 입력하세요."); //select할 id
		int id = sc.nextInt();
		
		ChampionDAO dao = ChampionDAO.getInstance();
		dao.selectId(id);
		
		
		
		
		
		
		
	}
}
