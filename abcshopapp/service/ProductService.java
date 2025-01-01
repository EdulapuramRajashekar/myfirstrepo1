package service;

import java.util.List;

import dto.Invoice;
import dto.Product;

public interface ProductService {
	double calcualeOrderAmount(int customerId,int productId, int qty);
	
	void addProduct(Product product);
	
	List<Product> getAllProducts();

	// implementing for invoice...
	

	Invoice generateInvoice(int customerId, int productId, int qty);
}
