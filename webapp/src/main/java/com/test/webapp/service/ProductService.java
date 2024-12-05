package com.test.webapp.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.test.webapp.model.Product;
import com.test.webapp.repository.ProductRepo;

@Service
public class ProductService {

   @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
      return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
      product.setImageName(imageFile.getOriginalFilename());
      product.setImageType(imageFile.getContentType());
      product.setImageDate(imageFile.getBytes());
      return repo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
      product.setImageName(imageFile.getOriginalFilename());
      product.setImageType(imageFile.getContentType());
      product.setImageDate(imageFile.getBytes());
     return repo.save(product);
    }

    public void deleteProduct(int id) {
      repo.deleteById(id);
    }



}