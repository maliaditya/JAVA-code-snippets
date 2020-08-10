/* Write a Java Program with a class of name dominos with two instance
variable 'price' and 'quantity', declare one static variable named 'total' and static
method bill() . Create two objects of class named as pizza and fires assign some value
for instance variable of class and calculate the total bill & print the total cost. */


class Dominos{
    int price  = 0;
    int quantity = 0;
    static int total = 0;

    static void bill(int price,int quantity){
        System.out.println("Price = " + price);
        System.out.println("Quantity = " + quantity);
        System.out.println();
        
        total = total + price * quantity;
        

    }


    public static void main(String[] args){
        Dominos pizza = new Dominos();
        Dominos fries = new Dominos();

        System.out.println("Pizza");
        pizza.price = 249;
        pizza.quantity = 2;
        Dominos.bill(pizza.price,pizza.quantity);

        System.out.println("Fries");
        fries.price = 100;
        fries.quantity = 2;
        Dominos.bill(fries.price,fries.quantity);
        System.out.println("Total cost= "+ Dominos.total);
        
    }
}