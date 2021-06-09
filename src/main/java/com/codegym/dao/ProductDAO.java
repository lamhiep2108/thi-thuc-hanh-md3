package com.codegym.dao;

import com.codegym.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {
    public void insertProduct(Product product) throws SQLException;

    public Product selectProduct(int id);

    public List<Product> selectAllProduct();

    public boolean deleteProduct(int id) throws SQLException;

    public boolean updateProduct(Product product) throws SQLException;
}

