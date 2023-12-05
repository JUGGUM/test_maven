package ggumi.maven.example.demo.controller;

import ggumi.maven.example.demo.entity.Customer;
import ggumi.maven.example.demo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    private final CustomerRepository customerRepository;

    @PostMapping("/")
    public @ResponseBody List<Customer> createCustomer(@RequestBody Map<String,String> param){
        String name = param.get("name");
        String phone = param.get("phone");
        Customer customer = Customer.builder().name(name).phone(phone).build();
        customerRepository.save(customer);

        return customerRepository.findAll();
    }
}