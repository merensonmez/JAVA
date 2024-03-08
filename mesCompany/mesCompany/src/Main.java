import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();


        Customer customer1 = new Customer(1, "Eren", "erencpt11@gmail.com");

        customerRepository.addCustomer(customer1);


        List<Customer> allCustomers = customerRepository.getAllCustomers();
        System.out.println("Tüm müşteriler:");
        for (Customer customer : allCustomers) {
            System.out.println(customer);
        }


        Customer customerToUpdate = customerRepository.getCustomerById(1);
        customerToUpdate.setName("Mehmet");
        customerRepository.updateCustomer(customerToUpdate);


        customerRepository.deleteCustomer(1);

        System.out.println("Müşteri silindikten sonra tüm müşteriler:");
        allCustomers = customerRepository.getAllCustomers();
        for (Customer customer : allCustomers) {
            System.out.println(customer);
        }
    }
}