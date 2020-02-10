package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller =sellerDao.findById(3); 
		System.out.println("=== TEST 1: seller findById ===");
		System.out.println(seller);

	}

}
