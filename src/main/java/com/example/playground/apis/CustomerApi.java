package com.example.playground.apis;

import com.example.playground.models.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerApi {

    @GetMapping
    public List<Customer> getAllCustomers() {
        return List.of(
                new Customer(1234, "Ramesh", "TS", "Ramesh@gmail.com"),
                new Customer(345, "Rajesh", "K", "rajesh@gmail.com")
        );
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable int id) {
        return new Customer(id, "Ramesh", "TS", "Ramesh@gmail.com");
    }

    @PostMapping
    public Customer create(@RequestBody Customer value) {
        return value;
    }

    @PutMapping("{id}")
    public Customer update(@RequestBody Customer value, @PathVariable int id) {
        return value;
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id) {

    }
}
