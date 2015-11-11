import com.roytuts.spring.hsqldb.model.Customer.Customer;
import com.roytuts.spring.hsqldb.model.Customer.CustomerService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by TTTDEMIRCI on 11/11/2015.
 */
public class TestSpringHsqldb {

    private CustomerService customerService;

    @Before
    public void setUp() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        customerService = applicationContext.getBean("customerService",
                CustomerService.class);
    }

    @Test
    public void testCRUD() {
        System.out.println("Customer information with Customer Id = 2");
        Customer findCustomer = customerService.findByCustomerId(2);
        System.out.println(findCustomer);

        System.out.println();
        System.out.println("List all Customers");

        List<Customer> customers = customerService.findAllCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        System.out.println();
        System.out.println("Add new Customer");
        Customer customer = new Customer();
        customer.setCustomerName("Soumitra Roy");
        customer.setCustomerCity("Chennai");
        customer.setCustomerState("Tamil Nadu");
        customer.setCustomerZip("600020");
        customerService.saveCustomer(customer);

        System.out.println();
        System.out.println("New customer information");

        Customer cust = customerService.findByCustomerId(6);
        System.out.println(cust);

        System.out.println();
        System.out.println("After creating a new Customer, list all Customers");

        List<Customer> customersAfterAddition = customerService
                .findAllCustomers();
        for (Customer customerAdd : customersAfterAddition) {
            System.out.println(customerAdd);
        }

        System.out.println();
        System.out.println("Update customer information for Customer Id = 6");

        Customer customerUpdate = customerService.findByCustomerId(6);
        customerUpdate.setCustomerCity("Kolkata");
        customerUpdate.setCustomerState("West Bengal");
        customerUpdate.setCustomerZip("700105");
        customerService.updateCustomer(customerUpdate);

        System.out.println();
        System.out
                .println("After updating customer information for Customer Id = 6");

        Customer custUpdate = customerService.findByCustomerId(6);
        System.out.println(custUpdate);

        System.out.println();
        System.out.println("Delete customer information for Customer Id = 6");
        customerService.deleteCustomer(6);

        System.out.println();
        System.out
                .println("After deleting a Customer for Customer Id = 6, list all Customers");

        List<Customer> customersAfterDeletion = customerService
                .findAllCustomers();
        for (Customer customerDel : customersAfterDeletion) {
            System.out.println(customerDel);
        }
    }
}
