package edu.csumb.cst438.projectdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.cst438.projectdb.entities.Product;
import edu.csumb.cst438.projectdb.entities.User;

@RestController
public class ProjectController {
    @Autowired
    IProductRepository productRepository;
    @Autowired
    IUserRepository userRepository;

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

    @GetMapping ("/users")
    public List<User> getAllUsers () {
        List<User> result = userRepository.findAll();
        return result;
    }
    	
    @GetMapping("/user/{id}")
    public User getUserById (@PathVariable String id) {
        User result = userRepository.findByRepoId(id);
        return result;
    }

}