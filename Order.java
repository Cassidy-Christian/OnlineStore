public class Order
{
    private int sum;

    private int[] quantity = new int[10];
    quantity[0] = 5;
    quantity[3] = 1;

    public int getQuantity(int i){
        return quantity[i];
    }

    public double totalPrice(){
        for( i=0; i<10; i++ ){
            sum += Item[i].getPrice() * quantity[i]; 
        }
        return (1.08*sum); 
    }

}