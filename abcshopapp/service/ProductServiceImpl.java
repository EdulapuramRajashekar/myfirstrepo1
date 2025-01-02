package service;

import java.util.List;

import dao.ProductDao;
import dao.ProductDaoImpl;
import dto.Invoice;
import dto.Product;

public class ProductServiceImpl implements ProductService  {

	@Override
	public double calcualeOrderAmount(int customerId, int productId, int qty) {
		
		ProductDao productDao = new ProductDaoImpl();
		
		Product product = productDao.findById(productId);
		
		double totalPrice = product.getProductPrice() * qty;
		
		//System.out.println("Total Price = "+totalPrice);
		
		double orderAmount = totalPrice + (totalPrice* 0.05);
		
		return orderAmount;
	}

	@Override
	public void addProduct(Product product) {
		ProductDao productDao = new ProductDaoImpl();
		productDao.save(product);
		
	}

	@Override
	public List<Product> getAllProducts() {
		ProductDao productDao = new ProductDaoImpl();
		List<Product> products = productDao.findAll();
		return products;
	}


	public Invoice generateInvoice(int customerId, int productId, int qty) {
		

		return null;
	}
}


