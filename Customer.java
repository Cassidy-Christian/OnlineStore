public class Customer{

    Customer cust1 = new Customer(String name, String email, Order order);
    private String email; 
    private String name; 
    private boolean order; 
    

    public Customer(String email, String name, boolean order);{
        this.email= email; 
        this.name=name;
        this.order=order; 
    }
    public void setEmail(String email){
        this.email=email; 
    }
    public void setName(String name){
        this.name=name; 
    }
    public void setOrder( boolean order){
        if (order)
        return true 
    }
    public String getEmail(){
        return email; 
    }
    public String getName(){
        return name;
    }
    public boolean getOrder(){
        return order; 
    }

    
}