package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * Created by abc on 2017/9/10.
 */
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);


    public List<Customer> getCustomerList() {
        Connection connection = DatabaseHelper.getConnection();
        String sql = "SELECT * FROM customer";
        LOGGER.info(sql);
        return DatabaseHelper.queryEntityList(Customer.class, connection, sql);
    }

    public Customer getCustomer(long id) {
        return DatabaseHelper.queryEntity(Customer.class, "SELECT * FROM customer WHERE id = " + id);
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
