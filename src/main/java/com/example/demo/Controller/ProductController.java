
package com.example.demo.Controller;

import com.example.demo.Entity.Product;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController{
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product)
    {
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> product)
    {
        return service.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> findAllProductcs(){
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductbyId( @PathVariable int id){
        return service.getProductbyId(id);
    }
    @GetMapping("/productByName/{name}")
    public Product findProductbyName(@PathVariable String name){
        return service.getProductbyName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product)
    {
        return service.saveProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@RequestBody int id)
    {
        return service.deleteProduct(id);
    }

}
