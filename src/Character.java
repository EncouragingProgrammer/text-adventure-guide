/**
 * title: Character.java
 * description: This class represents the base parent class of the in-game characters.
 * date: May 26, 2022
 * @author Ryan Gustafson
 * @version 1.0
 * @copyright Ryan Gustafson
 * Code Sources:
 */
import java.util.ArrayList;

public class Character extends GameObeject {

    // In addition to name and description, we would like the character to have a location.
    Room location;
    ArrayList<Item> inventory = new ArrayList<Item>[];

    /**
     * Constructor for the Character object
     * @param name          - name of the character
     * @param description   - description of the character
     */
    public Character(String name, String description) {
        super(name, description);
    }

    public Character(String name, String description, String location) {
        super(name, description);
        this.location = location;
    }

    // Getter and Setter
    public Room getLocation() {return location; }
    public void setLocation(Room location) { this.location = location; }

    public void getItem(Item thing) { inventory.add(thing); }

    /**
     * Check if the character has the item, remove it from their inventory and return the item.
     * @param thing - of type item
     * @return thing - of type item
     */
    public Item removeItem(Item thing) {
        if (inventory.contains(thing)) {
            inventory.remove(thing);
        }
        return thing;
    }

}