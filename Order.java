public class Order
{
    private Item[] items; 
    private Customer customer; 

    // private int[] quantities = new int[10];
    // quantities[0] = 5;
    // quantities[3] = 1;

    Order(Item[] items, Customer customer){
        this.items = items;
        this.customer=customer; 
        customer.setOrder(this); 
    }

    public double totalPrice(){
        int sum=0; 
        for(int i=0; i<items.length; i++ ){
            sum += items[i].getPrice(); 
        } 
        return (1.08*(sum/100.00)); 
    }

    public String toString(int i){
        String str=""; 
        for (int j = 0; j < items.length; j++)
            str += items[j].toString();
        return str;
    }

    public void displayTable(){
        System.out.println(String.format("%20s%10s      %s", "Name of Item", "SKU", "Price"));
        System.out.println("===============================================");
        for (int i = 0; i < items.length; i++)
        System.out.println(items[i].toString());
        System.out.println(String.format("TOTAL PRICE:$%.2f ",  this.totalPrice()));
        System.out.println("Thank you "+customer.toString()); 
    }

}