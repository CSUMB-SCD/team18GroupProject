package main.java.edu.csumb.cst438.productdb;

@RestController
public class ProductController {
    @Autowired
    IProductRepository productRepository;
}