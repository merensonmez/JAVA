import java.util.List;

public interface CustomerRepository {
    List<Customer> getAllCustomers();
    Customer getCustomerById(int id);
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
}
