/**
 * Represents a toy item in the inventory
 * <p>
 * Each toy has a name, brand, price, quality in stock, 
 * and a size classufucation.
 * </p>
 * 
 */
public class Toy { 
    String name;
    String brand;
    double price;
    int quantity;
    char size;
    
    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy()
        toy1.name = "Rage Pink";
        toy1.brand = "Lab Vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;
        toy1.setPrice(toy1.price*0.5);
        System.out.println(toy1.price);
        System.out.println("end of program");

    }

}
