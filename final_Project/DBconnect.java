package final_Project;

import javax.swing.*;
import java.sql.*;

public class DBconnect {

	public static void main(String[] args) {
		Connection conn;
		String url1="jdbc:mysql://localhost/sillamovieuserDB?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF8";
		
		String id1="root";
		String pw1="1234";
		
		try {
		
			conn = DriverManager.getConnection(url1,id1,pw1);
			//url1과 id1, pw1로 sillamovieuserDB데이터베이스와 연결
			
			System.out.println("sillamovieuserDB 연결완료");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		String url2="jdbc:mysql://localhost/sillamovieDB?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF8";
		
		String id2="root";
		String pw2="1234";
		
		try {
		
			conn = DriverManager.getConnection(url2,id2,pw2);
			//url2과 id2, pw2로 sillamovieDB데이터베이스와 연결
			
			System.out.println("sillamovieDB 연결완료");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	
	}

	public static Connection getConnection() {
		Connection conn = null;
		String url1="jdbc:mysql://localhost/sillamovieuserDB?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF8";
		
		String id1="root";
		String pw1="1234";
		
		try {
		
			conn = DriverManager.getConnection(url1,id1,pw1);
			//url1과 id1, pw1로 sillamovieuserDB데이터베이스와 연결
			
			System.out.println("sillamovieuserDB 연결완료");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;	
		}

}
