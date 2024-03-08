import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customers;

    public CustomerRepositoryImpl() {
        this.customers = new HashMap<>();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer getCustomerById(int id) {
        return customers.get(id);
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customers.remove(id);
    }
}
