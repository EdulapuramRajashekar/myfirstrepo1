package dao;

import java.util.List;

import dto.Product;

public interface ProductDao {
	void save(Product product);
	
    Product findById(int productId);
	
	List<Product> findAll();
	
}
