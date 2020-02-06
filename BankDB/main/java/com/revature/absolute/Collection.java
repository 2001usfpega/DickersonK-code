package com.kaelin.absolute;

import java.io.Serializable;
import java.util.Scanner;

import com.revature.customer.Account;
public class Collection implements Serializable{
	
	private static String url = System.getenv("Bankdb_url");
	
	private static String username = System.getenv("Bankdb_user");
	
	private static String password = System.getenv("Bankdb_passwd");
	
	public static void main(String[] args) {

		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a number ");
//		Account act = new Account();
//		act.Menu();
//		//int c = input.nextInt();
//		System.out.println("value = " + input);
//		char c = input.next().charAt(0);
//		System.out.println("Value = " +input);
		System.out.println(url);
		System.out.println(password);
		System.out.println(username);
		
	}

}