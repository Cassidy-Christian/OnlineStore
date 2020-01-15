public class OnlineStoreTester{

    public static void main(String[] args){

        tableHeader();

        Item[] order = new Item[10];
        order[0] = new Item("Toothpaste", "ABC123", 1200); 
        order[1]= new Item("Rocks","xyz456", 1400);
        order[2]= new Item("Used Floss", "efg789", 200); 
        order[3] = new Item("Knuckle Sandwich", "asd890", 500); 
        order[4] = new Item("Shrek 2 DVD", "jklol999", 10000);
        order[5] = new Item("A box of angry bees", "mno543", 900); 
        order[6] = new Item("Stinky socks", "kdi938", 300);

        for (int i = 0; i < 10; i++)
        System.out.println(order[i].toString(i));

        tableSum();
    }

    private static void tableHeader(){
        System.out.println("\nQuantity\tItem\tSKU\tPrice");
        System.out.println("=====================================");
    }
    private static void tableSum(){
        System.out.println("TOTAL PRICE: " + totalPrice());
    
    }
}

 