import java.util.*;

public class StockItem {

    String description;
    int id;
    double price;
    int quantity;

    public static void main(String[] args) {

        StockItem milk = new StockItem("1 Gallon of Milk",1, 3.60,15);
        StockItem bread = new StockItem("1 Loaf of Bread",2,1.98, 30)    ;


        Scanner scan = new Scanner(System.in);
        int selection;

        do {
            System.out.print("1. Sold One Milk\n" +
                    "2. Sold One Bread\n" +
                    "3. Change price of Milk\n" +
                    "4. Change price of Bread\n" +
                    "5. Add Milk to Inventory\n" +
                    "6. Add Bread to Inventory\n" +
                    "7. See inventory\n" +
                    "8. Quit\n");
            selection = scan.nextInt();

            if(selection == 1){
                milk.lowerQuantity(milk.quantity);
            }
            else if(selection == 2){
                bread.lowerQuantity(bread.quantity);
;            }
            else if(selection == 3){
                System.out.println("Please enter new price");
                milk.price = inputPrice();
            }
            else if(selection == 4){
                System.out.println("Please enter new price");
                bread.price = inputPrice();
            }
            else if(selection == 5){
                System.out.println("Please enter new quantity");
                milk.quantity = inputQuantity();
            }
            else if(selection == 6){
                System.out.println("Please enter new quantity");
                bread.quantity = inputQuantity();
            }
            else if(selection == 7){
                System.out.println("Milk: Item number: " + milk.id + " is " + milk.description + " has price " + milk.price + " we currently have " + milk.quantity + " in stock");
                System.out.println("Bread: Item number: " + bread.id + " is " + bread.description + " has price " + bread.price + " we currently have " + bread.quantity + " in stock");
            }
        }
        //keep looping while the selection is not 8 and the selection is greater than 0 and the selection is less than 9
        while(selection != 8 && selection > 0 && selection < 9);
    }

    //constructor
    StockItem()
    {
        description = "none";
        id = 0;
        price = 0.00;
        quantity = 0;
    }

    //overloaded constructor
    StockItem(String description, int id, double price, int quantity){
        this.description = description;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    //lower quantity methods
    public void lowerQuantity(int quantity){
        if(quantity - 1 < 0){
            System.out.println("Error, negative quantity");
            this.quantity=0;
        }
        else{
            this.quantity = quantity-1;
        }
    }

    public void raiseQuantity(int quantity){
        this.quantity = quantity+1;
    }

    //getters
    //returns the value of specific variables of the class
    public String getDescription(){
        return this.description;
    }

    public int getId(){
        return this.id;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    //setters
    //changes the value in the variables of the class
    public void setDescription(String description){
        this.description = description;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public static String inputDescription(){
        Scanner scan= new Scanner(System.in);
        String description = scan.nextLine();
        return description;
    }

    public static int inputId(){
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        return id;
    }

    public static double inputPrice(){
        Scanner scan = new Scanner(System.in);
        double price = scan.nextDouble();
        return price;
    }

    public static int inputQuantity(){
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();
        return quantity;
    }


}
