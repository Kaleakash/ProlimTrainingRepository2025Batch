package com.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DemoTest {

	public static void main(String[] args) {
	
	// Load the Driver and establish the connection 
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");
	
	//System.out.println("Persistence Unit loaded...");
	// creating statement or prepared statement 
	EntityManager manager = emf.createEntityManager();
	
	Product p1 = new Product();
	p1.setPid(102);
	p1.setPname("Laptop");
	p1.setPrice(98000);
	
	EntityTransaction tran = manager.getTransaction();
	// insert query 
//		tran.begin();
//		manager.persist(p1);       // save or insert record. 
//		tran.commit();
//		System.out.println("Record saved...");
	
	
	// Delete the Record 
	
//		Product p = manager.find(Product.class, 100);
//		if(p==null) {
//			System.out.println("Record not present so didn't delete");
//		}else {
//			tran.begin();
//				manager.remove(p);			// like delete query 
//			tran.commit();
//			System.out.println("Record deleted");
//		}
	
	// update query 
//	Product p = manager.find(Product.class, 101);
//	if(p==null) {
//		System.out.println("Record not present so didn't update");
//	}else {
//		tran.begin();
//			p.setPrice(55000);
//			manager.merge(p);		// update query 	
//		tran.commit();
//		System.out.println("Record updated");
//	}
	
	// retrieve only one record using primary key 
//	Product p = manager.find(Product.class, 102);
//	if(p==null) {
//		System.out.println("Record not present");
//	}else {
//		System.out.println(p);     // it call toString method to display output 
//	}
	
	// retrieve all records using JPQL 
//	Query qry = manager.createQuery("select p from Product p");
//	List<Product> listOfProduct= qry.getResultList();
//	System.out.println("number of records are "+listOfProduct.size());
//	for(Product p : listOfProduct) {
//		System.out.println(p);
//	}

	// retrieve all records using JPQL with conditions 
	//Query qry = manager.createQuery("select p from Product p where p.pid=101");
	//Query qry = manager.createQuery("select p from Product p where p.pname like 'Laptop'");
//	Query qry = manager.createQuery("select p from Product p where p.pid=?1"); // ? parameter query 
//	qry.setParameter(1, 101);
	
//	Query qry = manager.createQuery("select p from Product p where p.pid=:product_id"); // label parameter query 
//	qry.setParameter("product_id", 101);
//
//	List<Product> listOfProduct= qry.getResultList();
//	System.out.println("number of records are "+listOfProduct.size());
//	for(Product p : listOfProduct) {
//		System.out.println(p);
//	}
	
	
//	// retrieve only product id using JPQL partial object retrieve 
//		Query qry = manager.createQuery("select p.pid from Product p");
//		List<Integer> allProductIds= qry.getResultList();
//		
//		for(int  pid : allProductIds) {
//			System.out.println(pid);
//		}
//	
//	// retrieve only product name using JPQL partial object retrieve 
//			Query qry = manager.createQuery("select p.pname from Product p");
//			List<String> allProductNames= qry.getResultList();
//			
//			for(String  pname : allProductNames) {
//				System.out.println(pname);
//			}
	
	
	// retrieve only product pname and price using JPQL partial object retrieve 
	// same code for join concept. 
			Query qry = manager.createQuery("select p.pname,p.price from Product p");
			List<Object[]> allProductNameAndPrice= qry.getResultList();
			
			for(Object   row[] : allProductNameAndPrice) {
				System.out.println("Name is "+row[0]+" Price "+row[1]);
			}
			
	}

}



