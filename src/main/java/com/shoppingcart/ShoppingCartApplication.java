package com.shoppingcart;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shoppingcart.model.Product;
import com.shoppingcart.service.ShoppingCartService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ShoppingCartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ShoppingCartService shoppingCartService){
        return args -> {
            // read JSON and load json
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Product>> typeReference = new TypeReference<List<Product>>(){};
            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/items.json");
            try {
                List<Product> products = mapper.readValue(inputStream,typeReference);
                shoppingCartService.save(products);
                System.out.println("Products Saved!");
            } catch (IOException e){
                System.out.println("Unable to save products: " + e.getMessage());
            }
        };
    }
}
