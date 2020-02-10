package com.example.dao;

import java.util.List;
import java.util.ListIterator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.example.model.AdminModel;

public class AdminDAO implements List {
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
	
	
	public List <AdminModel> getAllExpenses(){
		  List<AdminModel> expenses = new ArrayList<>();

		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			String sql = "SELECT * FROM expense_ticket";
			PreparedStatement admin = conn.prepareStatement(sql);
			
			
			ResultSet rs = admin.executeQuery();

			while (rs.next()) {
				expenses.add(new AdminModel(rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5)));

			}
			// System.out.println(Uname+Pass);

		} catch (SQLException e) {
			e.printStackTrace();
		}System.out.println(expenses);
		return expenses;
	}



	public AdminModel admin_login(String uname, String pass, int i) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}


}



	


