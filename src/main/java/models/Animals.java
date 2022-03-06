package models;

public class Animals extends AnimalsInherit {
    public Animals(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
