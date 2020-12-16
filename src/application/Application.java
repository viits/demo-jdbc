package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Application {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== Test 1: seller findById ======");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println("\n === Test 2: seller findByDepartment ======");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === Test 3: seller findAll ======");
		
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === Test 4: seller Insert ======");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com", new Date(),4000.0,dep);
		sellerDao.insert(newSeller);
		System.out.println("Insert! new Id = " + newSeller.getId());
		
		
		System.out.println("\n === Test 5: seller Update ======");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		System.out.println("Update complete!");
		
		System.out.println("\n === Test 6: seller Delete ======");
		seller = sellerDao.findById(1);
		sellerDao.deleteById(seller.getId());
		System.out.println("Delete complete! ");
		
		System.out.println("============================================DEPARTMENT=========================");
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		System.out.println("\n === Test 7: Department FindById ======");
		
		Department department = depDao.findById(4);
		System.out.println(department);
		
		System.out.println("\n === Test 8: Department FindAll ======");
		List<Department> departments = depDao.findAll();
		for(Department deps : departments) {
			System.out.println(deps);
		}
		
		System.out.println("\n === Test 9: Department Insert ======");
		Department newDepartment = new Department(null,"Academy");
		depDao.insert(newDepartment);
		System.out.println("Inserted department!" + newDepartment.getId());
	
		System.out.println("\n === Test 10: Department Update ======");
		department = depDao.findById(6);
		department.setName("Eletric Domestic");
		depDao.update(department);
		System.out.println("Updated Complete!");
		
		System.out.println("\n === Test 11: Department DELETE ======");
		department = depDao.findById(8);
		depDao.deleteById(department.getId());
		System.out.println("Deleted complete! ");
		
	}

}
