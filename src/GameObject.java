/**
 * title: GameObject.java
 * description: This class sets the foundation for all game objects. All game objects will be a subclass of this parent.
 * date: May 26, 2022
 * @author Ryan Gustafson
 * @version 1.0
 * @copyright Ryan Gustafson
 * Code Sources:
 */

public class GameObject {
    private String name;
    private String description;

    // Game Object Constructor
    public GameObject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters and Setters for GameObject, these methods are inherited by GameObject's children.
    public String getDescription() { return description; }
    public String getName() { return name; }
    public void setDescription(String description) { this.description = description; }
    public void setName(String name) { this.name = name; }
}