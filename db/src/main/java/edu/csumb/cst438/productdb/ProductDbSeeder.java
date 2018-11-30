package edu.csumb.cst438.productdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import edu.csumb.cst438.productdb.entities.Product;

@Component
public class ProductDbSeeder implements CommandLineRunner {
    @Autowired
    IProductRepository productRepo;

    public void run(String... args) throws Exception {
        Product sweater = new Product("Otter Sweater", "You otter warm up with this faux fur sweater!", 30.00);
        Product shorts = new Product("Otter Swimmers", "Swim around with the otters, in fashion, with these lightweight designed shorts!", 10.59);
        Product shoes = new Product("Otter Walkers", "Paddle your way through the sea of otters with these flippers!", 50.00);
   
        //delete db data
        productRepo.deleteAll();
        //add db seeds
        List<Product> products = Arrays.asList(sweater, shorts, shoes);
        productRepo.saveAll(products);
    }
}