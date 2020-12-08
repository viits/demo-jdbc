package application;

import java.sql.Connection;

import db.DB;

public class Application {

	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		
		System.out.println("Hello world");
		System.out.println("My name is Esdras.");
		DB.closeConnection();
	}

}
