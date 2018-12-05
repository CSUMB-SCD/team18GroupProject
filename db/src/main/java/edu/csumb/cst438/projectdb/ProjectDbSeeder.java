package edu.csumb.cst438.projectdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import edu.csumb.cst438.projectdb.entities.Product;
import edu.csumb.cst438.projectdb.entities.User;

@Component
public class ProjectDbSeeder implements CommandLineRunner {
    @Autowired
    IProductRepository productRepo;

    @Autowired
    IUserRepository usersRepo;

    public void run(String... args) throws Exception {
        Product sweater = new Product("Otter Sweater", "You otter warm up with this faux fur sweater!", 30.00, "/src/assets/productPics/withAnimals/OtterSweater.png", 25);
        Product shorts = new Product("Otter Swimmers", "Swim around with the otters, in fashion, with these lightweight designed shorts!", 10.59, "/src/assets/productPics/withAnimals/OtterCardigan.png", 25);
        Product shoes = new Product("Otter Walkers", "Paddle your way through the sea of otters with these flippers!", 50.00, "/src/assets/productPics/withAnimals/OtterScarf.png", 25);
        Product sweater2 = new Product("Otter Sweater", "You otter warm up with this faux fur sweater!", 30.00, "/src/assets/productPics/withAnimals/OtterSweater.png", 25);

        //delete db data
        productRepo.deleteAll();
        //add db seeds
        List<Product> products = Arrays.asList(sweater, sweater2, shorts, shoes);
        productRepo.saveAll(products);

        User one = new User("Eros", "password");
        User two = new User("Mark", "password");
        User three = new User("Faith", "password");
        User four = new User("Andrew", "password");
   
        //delete db data
        usersRepo.deleteAll();;
        //add db seeds
        List<User> User = Arrays.asList(one, two, three, four);
        usersRepo.saveAll(User);
    }
}