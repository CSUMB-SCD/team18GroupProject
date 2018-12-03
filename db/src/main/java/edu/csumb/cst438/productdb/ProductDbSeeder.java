package edu.csumb.cst438.productdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import edu.csumb.cst438.productdb.entities.Product;
import edu.csumb.cst438.productdb.entities.Users;

@Component
public class ProductDbSeeder implements CommandLineRunner {
    @Autowired
    IProductRepository productRepo;

    @Autowired
    IUsersRepository usersRepo;

    public void run(String... args) throws Exception {
        Product sweater = new Product("Otter Sweater", "You otter warm up with this faux fur sweater!", 30.00);
        Product shorts = new Product("Otter Swimmers", "Swim around with the otters, in fashion, with these lightweight designed shorts!", 10.59);
        Product shoes = new Product("Otter Walkers", "Paddle your way through the sea of otters with these flippers!", 50.00);
   
        //delete db data
        productRepo.deleteAll();
        //add db seeds
        List<Product> products = Arrays.asList(sweater, shorts, shoes);
        productRepo.saveAll(products);



        Users one = new Users("Eros", "password");
        Users two = new Users("Mark", "password");
        Users three = new Users("Faith", "password");
        Users four = new Users("Andrew", "password");
   
        //delete db data
        usersRepo.deleteAll();;
        //add db seeds
        List<Users> users = Arrays.asList(one, two, three, four);
        usersRepo.saveAll(users);
    }
}