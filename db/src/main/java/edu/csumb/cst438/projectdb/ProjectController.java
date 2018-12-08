package edu.csumb.cst438.projectdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.cst438.projectdb.entities.Product;
import edu.csumb.cst438.projectdb.entities.User;

@RestController
public class ProjectController {
    @Autowired
    IProductRepository productRepository;
    @Autowired
    IUserRepository userRepository;

    @CrossOrigin(origin = "*")
    @GetMapping ("/allProducts")
    public List<Product> getAll () {
        List<Product> result = productRepository.findAll();
        return result;
    }

    @CrossOrigin(origin = "*")	
    @GetMapping("/id/{id}")
    public Product getProductById (@PathVariable String id) {
        Product result = productRepository.findByRepoId(id);
        return result;
    }

    @CrossOrigin(origin = "*")
    @GetMapping("/users")
    public List<User> getAllUsers () {
        List<User> result = userRepository.findAll();
        return result;
    }

    @CrossOrigin(origin = "*")
    @PostMapping("/users")
    public User createUser(String username, String password) {
        User user = new User(username, password);
        return userRepository.save(user);
    }

    @CrossOrigin(origin = "*")
    @GetMapping("/username/{username}")
    public User getUsername(String username) {
        User result = userRepository.findByUsername(username);
        return result;
    }

    @CrossOrigin(origin = "*")	
    @GetMapping("/users/{id}")
    public User getUserById (@PathVariable String id) {
        User result = userRepository.findByRepoId(id);
        return result;
    }
}