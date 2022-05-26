# text-adventure-guide
A how-to guide on creating a text adventure game in Java.
## Author
Ryan Gustafson

## Introduction
I am currently (while writing this) a student. The introductory Java course at my school requires students to create a text adventure game "Alice", based on "Alice in Wonderland" by Lewis Carrol, which can be frustrating for new students in an introductory programming course. The scope of the project can feel overwhelming. I have had the opportunity to tutor two of my fellow classmates and help them to get started on the project and work through some of the major problem solving involved. Other classmates have asked for help as well as this can be a very intimidating project. 

It is my desire to create a text adventure guide. It is my intention to present an easy to understand object-oriented text adventure game. My code may not be the best or most optimal method. It may not follow best practices as I am still learning myself. However, I am hopefully that others may find it useful, and that it may also be a good learning experience for me to write this guide and explain my problem solving thought process. 

I do not intend to explain the absolute basics of the Java programming language and assume that the reader has a basic understanding of Java syntax, classes, objects, encapsulation, inheritance and polymorphism. It is my intention to use these concepts and help guide others to using those concepts to create a simple text-adventure project.

You are welcome to use my code as you see fit. I would appreciate it however if you would reference me, if you happen to use my code! 

Thank you!

## Getting started
When beginning a project like this, it is beneficial to think about the structure of your game, before jumping in and writing code. How can I use object-oriented principles for this project? What are the "things" in my game that I will need to use? Some important objects may include:
- characters, players, npcs
- rooms, locations, places
- items, weapons, loot

When considering these objects, what properties do they have in common? Most "things" will have a name and description, so I like to start there. We can now create a basic "GameObject" to be the parent class of all other subclasses of game objects with a basic constructor, and getter and setter methods.

```java
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
```


