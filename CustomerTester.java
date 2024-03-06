class CustomerTester{
public static void main(String[] args){
Customer customer=new Customer();
customer.setCustomerId(1);
customer.setFirstName("Sharan");
System.out.println(customer.getCustomerId()+"   "+customer.getFirstName());
}
}