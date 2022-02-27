package com.message.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	private int cnt;
	private String sql;
	
        // 연결
	public void connect() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";
			
			conn = DriverManager.getConnection(url, id, pw);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void close() {
		
		try {
			if(rs != null) { rs.close(); }
			if(psmt != null) { psmt.close(); }
			if(conn != null) { conn.close(); }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int memberjoin(MemberDTO member) {
		
		connect();
		
		sql = "insert into web_member values(?,?,?,?)";
		
		
		try {
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getM_email());
			psmt.setString(2, member.getM_pw());
			psmt.setString(3, member.getM_tel());
			psmt.setString(4, member.getM_address());
			
			
			cnt = psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return cnt;
		
	}
	
	public MemberDTO memberlogin(String emil, String pw) {
		
		
		MemberDTO dto = null;
		
		connect();
		
		sql = "select * from web_member where m_email = ? and m_pw = ?";
		
		try {
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, emil);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();
			
			
			if(rs.next()) {//회원가입된 정보가 DB에 있는 경우
				
				dto = new MemberDTO(emil, null, rs.getString("m_tel"), rs.getString("m_address"));
				
				/*
				 * dto = new MemberDTO(); dto.setM_email(rs.getString("m_email"));
				 * dto.setM_email(rs.getString("m_tel"));
				 * dto.setM_email(rs.getString("m_address"));
				 */
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return dto;
		
	}

	public int memberupdate(MemberDTO memberDTO) {

		connect();
		
		sql = "update web_member set m_pw = ?, m_tel = ?, m_address = ? where m_email = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, memberDTO.getM_pw());
			psmt.setString(2, memberDTO.getM_tel());
			psmt.setString(3, memberDTO.getM_address());
			psmt.setString(4, memberDTO.getM_email());
			
			cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		
		return cnt;
	}

	public ArrayList<MemberDTO> memberSelectAll() {
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		connect();
		
		sql = "select m_email, m_tel, m_address from web_member";
		
		try {
			
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				if(!rs.getString(1).equals("admin")) {
				MemberDTO dto = new MemberDTO(rs.getString(1), null, rs.getString(2), rs.getString(3));
				list.add(dto);
			}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return list;
	}
	
}
