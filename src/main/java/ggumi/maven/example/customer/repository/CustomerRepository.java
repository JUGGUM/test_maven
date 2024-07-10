package ggumi.maven.example.customer.repository;

import ggumi.maven.example.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public List<Customer> findByName(String name);
    public List<Customer> findByPhone(String phone);
    //like검색도 가능
    public List<Customer> findByNameLike(String keyword);
}
