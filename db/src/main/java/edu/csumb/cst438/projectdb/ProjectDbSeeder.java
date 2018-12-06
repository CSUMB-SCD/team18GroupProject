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
        Product sweater = new Product("Otter Sweater", "You otter warm up in the deep blue sea with this faux fur sweater.", 30.00, "/src/assets/productPics/withAnimals/OtterSweater.png", 25, "Made with the highest quality fabrics found only in the waters of the Red Sea");
        Product hoodie = new Product("Otter Hoodie", "Stay looking cool with your otter pals and keep your fur warm in this swaged out cat hoodie.", 20.00, "/src/assets/productPics/withAnimals/OtterHoodie.png", 25, "Made with the finest fabrics from Asia");
        Product blueRSweater = new Product("Otter Sweater(Blue & Red)", "Warm up and look smoking in the deep blue sea with this navy blue and red sweater.", 35.00, "/src/assets/productPics/withAnimals/OtterBRSweater.png", 25, "Warm and cozy wool");
        Product cardigan= new Product("Otter Cardigan", "A formal yet colorful cardigan that will keep your pelt looking fresh at any event.", 40.00, "/src/assets/productPics/withAnimals/OtterCardigan.png", 25, "A cheap yet luxirious cashmere garment");
        
        Product fluffyJacket = new Product("Otter Puffer Jacket", "Be the coolest otter in the sea with this hip-hop inspired puffer jacket.", 5000.00, "/src/assets/productPics/withAnimals/OtterFluffyJacket.png", 25, "From the Monté Vuitton collection");
        Product beanie = new Product("Otter Beanie", "Keep your cute little ears warm with this specially designed beanie, for otters.", 5.00, "/src/assets/productPics/withAnimals/OtterHat.png", 25, "Wool beanie");
        Product redSweater = new Product("Otter Sweater(Red)", "You otter warm up with this faux fur Christmas edition sweater.", 35.00, "/src/assets/productPics/withAnimals/OtterRSweatter.png", 25, "Just in times for the holidays");
        Product redHat = new Product("Otter Beanie (Red)", "Keep your cute little ears warm with this Christmas beanie.", 10.00, "/src/assets/productPics/withAnimals/OtterRedHat.png", 25, "Wooly Christmas theme head hear");

        Product trucker = new Product("Otter Trucker Hat", "Swim around protecting your pelt with this water proof trucker hat.", 6.00, "/src/assets/productPics/withAnimals/OtterTHat.png", 25, "Lets getting clappin'");
        Product scarf = new Product("Otter Scarf", "A warm scarf designed to keep you swimming in the coldest of waters.", 35.00, "/src/assets/productPics/withAnimals/OtterScarf.png", 25, "Warm cashmere for your neck");

        //delete db data
        productRepo.deleteAll();
        //add db seeds
        List<Product> products = Arrays.asList(sweater, fluffyJacket, redSweater, cardigan, hoodie, beanie, trucker, scarf, redHat, blueRSweater);
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