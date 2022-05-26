/**
 * title: Character.java
 * description: This class represents the base parent class of the in-game characters.
 * date: May 26, 2022
 * @author Ryan Gustafson
 * @version 1.0
 * @copyright Ryan Gustafson
 * Code Sources:
 */

public class Character extends GameObeject {

    /**
     * Constructor for the Character object
     * @param name          - name of the character
     * @param description   - description of the character
     */
    public Character(String name, String description) {
        super(name, description);
    }

}