package com.shoppingCart.Controller;

import javax.servlet.annotation.WebServlet;

import org.springframework.beans.factory.annotation.Autowired;

import com.transaction.service.TransactionService;

@WebServlet("/product")
public class ProductsController{
	
@Autowired
TransactionService transactionservice;
	
	//protected void doget(HttpRequest request , HttpServletResponse response) {
		
		//List<Product> productList =transactionservice.getProducts();
		
		
		
		
		
	//}
}
