public class Customer{

    
    private String email; 
    private String name; 
    private Order order; 
    

    public Customer(String email, String name, Order order){
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
    public void setOrder( Order order){
        this.order=order; 
      //  if (order)
       // return true 
    }
    public String getEmail(){
        return email; 
    }
    public String getName(){
        return name;
    }
    public Order getOrder(){
        return order; 
    }
    public String toString(){
        return name; 
    }

    
}