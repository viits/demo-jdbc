package application;

import java.sql.Connection;

import db.DB;
import model.entities.Department;

public class Application {

	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		
		Department obj = new Department(1,"books");
		System.out.println(obj);
		DB.closeConnection();
	}

}
