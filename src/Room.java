/**
 * title: Room.java
 * description: This class represents all the in-game rooms.
 * date: May 26, 2022
 * @author Ryan Gustafson
 * @version 1.0
 * @copyright Ryan Gustafson
 * Code Sources:
 */

public class Room extends GameObeject {

    // These variables are pointers to other rooms, allowing you to link rooms together.
    private Room north, south, east, west;

    /**
     * I am currently considering if I want to create a subclass to contain gameobjects that are able to have
     * inventories. Currently I have some repetition in my Character / Room classes as they can both contain
     * inventories, and I am debating how I want to handle the situation.
     *
     * I could also create a separate inventory class to handle inventories.
     *
     * Additionally, I want Room to have an "inventory" of Characters.
     */
    ArrayList<Item> inventory = new ArrayList<Item>[];


    /**
     * Constructor for the Room object
     * @param name          - name of the room
     * @param description   - description of the room
     */
    public Room(String name, String description) {
        super(name, description);
    }

    // Getters and Setters for directional pointers
    public Room getEast() { return east; }
    public Room getNorth() { return north; }
    public Room getSouth() { return south; }
    public Room getWest() { return west; }
    public void setEast(Room east) { this.east = east; }
    public void setNorth(Room north) { this.north = north; }
    public void setSouth(Room south) { this.south = south; }
    public void setWest(Room west) { this.west = west; }

    public setDirections(Room north, Room west, Room south, Room west) {
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

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