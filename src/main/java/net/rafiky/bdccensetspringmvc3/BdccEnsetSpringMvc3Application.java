package net.rafiky.bdccensetspringmvc3;

import net.rafiky.bdccensetspringmvc3.entities.Product;
import net.rafiky.bdccensetspringmvc3.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BdccEnsetSpringMvc3Application {

    public static void main(String[] args) {

        SpringApplication.run(BdccEnsetSpringMvc3Application.class, args);
    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .name("Computer")
                    .price(5400)
                    .quantity(10)
                    .build());
            productRepository.save(Product.builder()
                    .name("Smart phone")
                    .price(5660)
                    .quantity(20)
                    .build());
            productRepository.save(Product.builder()
                    .name("Printer")
                    .price(1200)
                    .quantity(10)
                    .build());
            productRepository.findAll().forEach(p -> {
                System.out.println(p.toString());
            });
        };
    }
}
