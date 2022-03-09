package models;

public abstract class AnimalsInherit {
    public Integer id;
    public String name;

    //save to database
    public abstract void save();
}
