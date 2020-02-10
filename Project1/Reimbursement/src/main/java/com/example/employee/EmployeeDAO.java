package com.example.employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.EmployeeModel;

public class EmployeeDAO {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static String url = "BANKDB_URL";
	private static String username = "BANKDB_USER";
	private static String password = "BANKDB_PASS";
	private static String user;

	private static String username2;
	private static String password2;

	public static int ticketid;
	public double amount;
	public String date_submitted;;
	public int expense_type;

	public int getExpense_type() {
		return expense_type;
	}

	public void setExpense_type(int expense_type) {
		this.expense_type = expense_type;
	}

	public int getTicketid() {
		return ticketid;
	}

	@SuppressWarnings("static-access")
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate_submitted() {
		return date_submitted;
	}

	public void setDate_submitted(String date_submitted) {
		this.date_submitted = date_submitted;
	}

	// private static String pass;

	public void Employee(int amount, String date_submitted, int expense_type) {

		this.amount = amount;
		this.date_submitted = date_submitted;
		this.ticketid = 0;
		this.expense_type = expense_type;
	}

	public static void intExp1(Double amount2, String date, int expense_type) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			String sql = "INSERT INTO expense_ticket (amount, date_submitted, expense_type)" + "Values (?,?,?)";
			PreparedStatement expense = conn.prepareStatement(sql);

			expense.setDouble(1, amount2);
			expense.setDate(2, new Date(System.currentTimeMillis()));
			expense.setInt(3, expense_type);

			expense.executeUpdate();

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public EmployeeModel emp_login(String username2, String password2, int rank) {

		EmployeeModel yeah = null;

		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			String sql = "SELECT * FROM employee_reimbursement WHERE username= ? AND password=?";
			PreparedStatement employee = conn.prepareStatement(sql);

			employee.setString(1, username2);
			employee.setString(2, password2);

			ResultSet rs = employee.executeQuery();

			if (rs.next()) {
				yeah = new EmployeeModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5),rs.getInt(6));

			}else {
				System.out.println("not");
			}
			// System.out.println(Uname+Pass);

		} catch (SQLException e) {
			e.printStackTrace();
		}System.out.println(yeah);
		return yeah;
	}

	public static String getUsername2() {
		return username2;
	}

	public static void setUsername2(String username2) {
		EmployeeDAO.username2 = username2;
	}

	public static String getPassword2() {
		return password2;
	}

	public static void setPassword2(String password2) {
		EmployeeDAO.password2 = password2;
	}

	@Override
	public String toString() {
		return "EmployeeDAO [ticketid=" + ticketid + ", amount=" + amount + ", date_submitted=" + date_submitted + "]";
	}

	public void intExp(int amount2, String string) {
		// TODO Auto-generated method stub

	}

	public void expense() {
		// TODO Auto-generated method stub

	}
}
