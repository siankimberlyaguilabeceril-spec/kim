/**
 * Represents a toy item in the inventory
 * <p>
 * Each toy has a name, brand, price, quality in stock, 
 * and a size classufucation.
 * </p>
 * <ul>
 *      <li><b>name</b> - Name of the toy (e.g., "Gundam")</li>
 *      <li><b>brand</b> - Manufacturer or brand (e.g, "Lego")</li>
 *      <li><b>price</b> - Selling price of the toy</li>
 *      <li><b>quantity</b> - Number of units available</li>
 *      <li><b>size</b> - Size category (e.g., 'S','M','L')</li>
 *  </ul>
 * @author Marc Yim
 * @version 1.0
 * @since 1.0
 */

//javadoc Toy.java - to generate javadoc html files
public class Toy { 
    /** Name of the toy */
    public String name;

    /** Manufacturer or brand */
    public String brand;

    /** Selling price of the Toy */
    double price;

    /** Number of units available */
    int quantity;

    /** Size category (e.g., 'S','M','L') */
    char size;
    /**
     * Set the toy object price;
     * 
     * @param price the new price of the toy
     */
    public void setPrice(double price) {
        this.price = price;
        Fruit4 f4;
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Rage Pink";
        toy1.brand = "Lab Vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;
        toy1.setPrice(toy1.price*0.5);
        System.out.println(toy1.price);
        System.out.println("end of program");

    }

}
