package com.example;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
    @Autowired
    CustomerRepository customerRepository;
    
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    @Override
    public void run(String... strings) throws Exception {
        customerRepository.save(new Customer(1, "test", "taro"));
        customerRepository.findAll();
    }
    
}
