package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = departmentDao.findById(1);
		System.out.println("=== TEST 1: department findById ===");
		System.out.println(dep);
		
		System.out.println("\n=== TEST 4: depatment inset ===");
		Department newDepartmnet = new Department(12,"D12");
		departmentDao.inset(newDepartmnet);
		System.out.println("Inserted! New id = "+ newDepartmnet.getId());
	

		
		
//		sc.close();
	}

}
