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
     * Constructor for the Room object
     * @param name          - name of the room
     * @param description   - description of the room
     */
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
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
}