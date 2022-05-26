/**
 * title: Item.java
 * description: This class represents the base parent class of the in-game items.
 * date: May 26, 2022
 * @author Ryan Gustafson
 * @version 1.0
 * @copyright Ryan Gustafson
 * Code Sources:
 */

public class Item extends GameObeject {

    /**
     * Constructor for the Item object
     * @param name          - name of the item
     * @param description   - description of the item
     */
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

}