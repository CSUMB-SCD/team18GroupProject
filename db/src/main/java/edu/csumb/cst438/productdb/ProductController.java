package edu.csumb.cst438.productdb;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.cst438.productdb.entities.Product;
import edu.csumb.cst438.productdb.entities.Users;

@RestController
public class ProductController {
    @Autowired
    IProductRepository productRepository;
    @Autowired
    IUsersRepository usersRepository;

    @GetMapping ("/allProducts")
    public List<Product> getAll () {
        List<Product> result = productRepository.findAll();
        return result;
    }
    	
    @GetMapping("/id/{id}")
    public Product getProductById (@PathVariable String id) {
        Product result = productRepository.findByRepoId(id);
        return result;
    }

    @GetMapping ("/allUsers")
    public List<Users> getAllUsers () {
        List<Users> result = usersRepository.findAll();
        return result;
    }
    	
    @GetMapping("/userid/{id}")
    public Users getUserById (@PathVariable String id) {
        Users result = usersRepository.findByRepoId(id);
        return result;
    }

}