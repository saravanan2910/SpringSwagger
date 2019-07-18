package com.pack.springswagger.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.springswagger.dao.ProductDAO;
import com.pack.springswagger.model.Product;

@Service(value = "employeeService")
public class ProductServiceImpl implements ProductService {

	private ProductDAO employeeDAO;

	public ProductServiceImpl(ProductDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public int saveProduct(Product product) {
		System.out.println("Save Product Service method");
		return employeeDAO.save(product);
	}

	public List<Product> listAllProducts() {
		System.out.println("Save Product Service method");
		return employeeDAO.listAll();
	}


	public Product findByIdProduct(int id) {
		System.out.println("Save Product Service method");
		return employeeDAO.findById(id);
	}


	public int updateProduct(int id, Product product) {
		System.out.println("Save Product Service method");
		return employeeDAO.update(id, product);
	}

	public int deleteProduct(int id) {
		System.out.println("Save Product Service method");
		return employeeDAO.delete(id);
	}

}
