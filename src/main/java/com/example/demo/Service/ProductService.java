package com.example.demo.Service;

import com.example.demo.Entity.Product;
import com.example.demo.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private Productrepository repository;

    public Product saveProduct(Product product)
    {
        return repository.save(product);
    }

    public List<Product> saveProduct(List<Product> product)
    {
        return repository.saveAll(product);

    }

    public List<Product>  getProducts(){
        return repository.findAll();
    }

    public Product getProductbyId(int id){
        return repository.findById(id).orElse(null);
    }
    public Product getProductbyName(String name){
        return repository.findByName(name);
    }

    public String deleteProduct(int id)
    {
        repository.deleteById(id);
        return "product is Deleted"+id;
    }

    public Product updateProduct(Product product)
    {
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return repository.save(existingProduct);
    }


}
