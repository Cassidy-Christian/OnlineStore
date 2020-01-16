public class OnlineStoreTester{

    public static void main(String[] args){

        Customer customer1= new Customer("cat@aol.com","Cassidy", null ); 

        Item[] items = new Item[7];
        Order order= new Order(items, customer1); 
        
        items[0] = new Item("Toothpaste", "ABC123", 1200); 
        items[1]= new Item("Rocks","xyz456", 1400);
        items[2]= new Item("Used Floss", "efg789", 200); 
        items[3] = new Item("Knuckle Sandwich", "asd890", 500); 
        items[4] = new Item("Shrek 2 DVD", "jklol999", 10000);
        items[5] = new Item("A box of angry bees", "mno543", 900); 
        items[6] = new Item("Stinky socks", "kdi938", 300);


        order.displayTable();

    }


}

 