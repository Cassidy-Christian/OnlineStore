public class Item{
    private String itemName;
    private String sku; 
    private int price;  

    Item( String itemName, String sku, int price){
        this.itemName=itemName; 
        this.sku=sku;
        this.price=price;  
    }
    public void setItemName(String itemName){
        this.itemName=itemName; 
    }
    public void setSku(String sku){
        this.sku=sku; 
    }
    public void setPrice(int price){
        this.price=price; 
    }
    public String getItemName(){
        return itemName; 
    }
    public String getSku(){
        return sku; 
    }
    public int getPrice(){
        return price; 
    }

    public String toString(){
        
        return String.format("%20s%10s      $%.2f",itemName, sku, (price/100.0)); 
           
    }

}