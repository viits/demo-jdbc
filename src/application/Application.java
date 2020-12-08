package application;

import java.sql.Connection;
import java.util.Date;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

public class Application {

	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		
		Department obj = new Department(1,"books");
	
		Seller seller = new Seller(21,"Bob", "bob@gmail.com", new Date(),3000.0,obj);
		
		System.out.println(seller);
		
		DB.closeConnection();
	}

}
