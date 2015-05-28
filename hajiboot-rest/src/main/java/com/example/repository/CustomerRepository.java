/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repository;

import com.example.domain.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
/**
 *
 * @author k-narita
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
//    private static final RowMapper<Customer> customerRowMapper = (rs, i) -> {
//        Integer id = rs.getInt("id");
//        String firstName = rs.getString("first_name");
//        String lastName = rs.getString("last_name");
//        return new Customer(id, firstName, lastName);
//    };
//    
//    public List<Customer> findAll() {
//        List<Customer> customers = jdbcTemplate.query(
//                "SELECT id,first_name,last_name FROM customers ORDER BY ID", customerRowMapper);
//        return customers;
//    }
//    
//    public Customer findOne(Integer customerId) {
//        SqlParameterSource param = new MapSqlParameterSource().addValue("id", customerId);
//        return jdbcTemplate.queryForObject("SELECT id,first_name,last_name FROM customers WHERE id=:id", param, customerRowMapper);
//    }
//    
//    public Customer save(Customer customer) {
//        SqlParameterSource param = new BeanPropertySqlParameterSource(customer);
//        if(customer.getId() == null) {
//            Number key = insert.executeAndReturnKey(param);
//            customer.setId(key.intValue());
//            jdbcTemplate.update("INSERT into customers(first_name,last_name) values(:firstName, :lastName)", param);
//        } else {
//            jdbcTemplate.update("UPDATE customers SET first_name=:firstName, last_name=:lastName WHERE id=:id", param);
//        }
//        return customer;
//    }
//    
//    public void delete(Integer customerId) {
//        SqlParameterSource param = new MapSqlParameterSource().addValue("id", customerId);
//        jdbcTemplate.update("DELETE FROM customers WHERE id=:id", param);
//    }
}
