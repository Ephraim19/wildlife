package models;

public class EndageredAnimals extends AnimalsInherit{
    private final String health = "healthy";
    private final String age = "newborn";

    public EndageredAnimals(Integer id, String name, String health, String age) {
        this.id = id;
        this.name = name;
    }
}
