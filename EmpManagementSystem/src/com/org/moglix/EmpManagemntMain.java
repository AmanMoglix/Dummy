package com.org.moglix;

import com.org.moglix.controller.CatelogController;
import com.org.moglix.domain.Catalog;

public class EmpManagemntMain {
	public static void main(String[] args) {
//		EmployeeController employeeController =new EmployeeController();
//
//       Employee emp=new Employee();
//       emp.setEmp_id("EMP001");
//       emp.setEmp_firstName("John");
//       emp.setEmpLastName("vick");
//       emp.setEmpAddress("Georgia");
//       emp.setEmpSalary(1000.00);
//       
//       Employee emp2=new Employee();
//       emp2.setEmp_id("EMP002");
//       emp2.setEmp_firstName("Valkayrie");
//       emp2.setEmpLastName("Masand");
//       emp2.setEmpAddress("Japan");
//       emp2.setEmpSalary(1111.00);
//       
//     String persistentMessage= employeeController.addEmployee(emp);
//   employeeController.addEmployee(emp2);
//
//     System.out.println(persistentMessage);
//     System.out.println(employeeController.getById("EMP001"));

//     Employee emp1=new Employee();
//     emp1.setEmp_firstName("John1");
//     emp1.setEmpLastName("vick1");
//     emp1.setEmpAddress("Georgia1");
//     emp1.setEmpSalary(99999.00);
//     String updateEmployee=employeeController.updateEmployeeById(emp1, "EMP001");
//     System.out.println(updateEmployee);
//     System.out.println(employeeController.getById("EMP001"));

//     Employee[] employeeList=employeeController.getList();
//    for (Employee employee : employeeList) {
//		if(employee!=null) {
//			System.out.println(employee);
//		}
//	}

//    String deletedEntity=employeeController.deleteEmployeeById("Emp002");
//    System.out.println(deletedEntity);
//    Employee[] employeeList1=employeeController.getList();
//    for (Employee employee : employeeList1) {
//		if(employee!=null) {
//			System.out.println(employee);
//		}
//	}

		/// catalog service start here
		CatelogController catagoryController = new CatelogController();
		Catalog catalog = new Catalog();
		catalog.setProductId(1L);
		catalog.setProductName("Book");
		catalog.setProductDescription("All about the books");
		catalog.setCategoryId(1L);
		String persistedCatalog = catagoryController.saveOrUpdate(catalog);
		System.out.println(persistedCatalog);
		

		Catalog catalog1 = new Catalog();
		catalog1.setProductId(2L);
		catalog1.setProductName("Hindi Book");
		catalog1.setProductDescription("All about the Hindid books");
		catalog1.setCategoryId(1L);
		String updateCatelog = catagoryController.saveOrUpdate(catalog1);
		System.out.println(updateCatelog);
		 //get catalog by id
		 System.out.println(catagoryController.getById(2L));
		 
		 //getting all Catalog 
		 System.out.println("getting all catalog");
		 for (Catalog cat:catagoryController.list()) {
			 if(cat!=null) {
				 System.out.println(cat);
			 }
		 }

		// deleting
		 System.out.println("Deleted catalog by productId");
		String deletingCatalog=catagoryController.delete(1L);
		System.out.println(deletingCatalog);
//		
//
		System.out.println("get Catalog by produt Id");
		System.out.println(catagoryController.getById(2L));
		
//		
//		String persistedCatalog2 = catagoryController.saveOrUpdate(catalog);
//		System.out.println(persistedCatalog2);
	
		//System.out.println(employe.calculateSalary(1800.00, 11.00, 12.00, 15.00));
		//Employee manager = new Manager();
		//System.out.println(manager.calculateSalary(1800.00, 11.00, 12.00, 15.00));
		//manager.calculateSalary(basicSalary, ta, da, hra)
		//Employee m = new Manager("EMP001", "John", "vick", 10.00, "USA", "Dummy", 2000.00);
		//System.out.println(m .calculateSalary(1800.00, 11.00, 12.00, 15.00));
		//System.out.println(m);
		//System.out.println(m.calculateSalary(1800.00, 11.00, 12.00, 15.00));
	}

}
