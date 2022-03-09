package models;

public class Sightings {
    private int id;
    private int rangerName;
    private int animal_id;
    private int location;

    public Sightings( int rangerName, int animal_id, int location) {
        this.id = id;
        this.rangerName = rangerName;
        this.animal_id = animal_id;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRangerName() {
        return rangerName;
    }

    public void setRangerName(int rangerName) {
        this.rangerName = rangerName;
    }

    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
