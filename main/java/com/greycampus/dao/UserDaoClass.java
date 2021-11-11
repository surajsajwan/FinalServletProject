package com.greycampus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.greycampus.getset.GetterSetter;

public class UserDaoClass {
	public void addDao(GetterSetter gs) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bms",
					"abc"); PreparedStatement ps = connection.prepareStatement("insert into emp_tbl values(?,?,?)");) {
				ps.setInt(1, gs.getEno());
				ps.setString(2, gs.getName());
				ps.setDouble(3, gs.getSalary());
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<GetterSetter> searchDao(String eno) {
		String sql = "select * from emp_tbl";
		if (eno != null && !eno.equals("")) {
			sql += " where eno=?";
		}
		ArrayList<GetterSetter> arrayList = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bms",
					"abc"); PreparedStatement ps = connection.prepareStatement(sql)) {
				if (eno != null && !eno.equals("")) {
					ps.setInt(1, Integer.parseInt(eno));
				}
				try (ResultSet executeQuery = ps.executeQuery();) {

					while (executeQuery.next()) {
						GetterSetter getterSetter1 = new GetterSetter();
						getterSetter1.setEno(executeQuery.getInt(1));
						getterSetter1.setName(executeQuery.getString(2));
						getterSetter1.setSalary(executeQuery.getDouble(3));
						arrayList.add(getterSetter1);

					}

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return arrayList;
	}

	public int deleteDao(String eno) {
		int executeUpdate = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bms",
					"abc"); PreparedStatement ps = connection.prepareStatement("delete from emp_tbl where eno=?");) {
				if (eno != null && !eno.equals("")) {
					ps.setInt(1, Integer.parseInt(eno));
				}
				executeUpdate = ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return executeUpdate;

	}

	public int updateDao(GetterSetter gs, String eno) {
		int executeUpdate = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bms",
					"abc");
					PreparedStatement ps = connection
							.prepareStatement("update emp_tbl set eno=?,name=?,salary=? where eno=?");) {
				ps.setInt(1, gs.getEno());
				ps.setString(2, gs.getName());
				ps.setDouble(3, gs.getSalary());
				ps.setInt(4, Integer.parseInt(eno));
				executeUpdate = ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return executeUpdate;
	}
}
