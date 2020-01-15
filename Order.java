public class Order
{
    private int sum;

    private int[] quantities = new int[10];
    quantities[0] = 5;
    quantities[3] = 1;

    Order(Item[] items){
        this.items = items;
    }

    public double totalPrice(){
        for( i=0; i<10; i++ ){
            sum += Item[i].getPrice() * quantities[i]; 
        }
        return (1.08*sum); 
    }

    public String toString(int i){
        String str;
        for (j = 0; j < 10; j++)
            str += quantities[i] + "\t" + items.toStringItems();
        return str;
    }

}