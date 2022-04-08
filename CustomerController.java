@RestController
public class CustomerController{

  @Autowired
  private CustomerService customerService;
  public List<Customer> getAllCustomers(){
  
    return customerService.getAll();
  }
}
