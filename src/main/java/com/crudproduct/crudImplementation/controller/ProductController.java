package com.crudproduct.crudImplementation.controller;

import com.crudproduct.crudImplementation.entity.Product;
import com.crudproduct.crudImplementation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/addproduct")
    public Product saveproduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addproducts")
    public List<Product> addproducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/list")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }

    @RequestMapping(value = "/id/{pt_id}", method = RequestMethod.GET)
    public Product findProductById(@PathVariable int pt_id){
        return service.getProductById(pt_id);
    }

//    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
//    public Product findProductByName(@PathVariable String name){
//        return service.getProductByName(name);
//    }

    @PutMapping("/update")
    public Product UpdateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
}
