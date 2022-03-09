package models;

import org.sql2o.Connection;

public class Sightings implements WildlifeInterface {
    private int id;
    private String rangerName;
    private String animal_id;
    private String location;

    public Sightings(String animal_id,  String location, String rangerName) {
        this.id = id;
        this.rangerName = rangerName;
        this.animal_id = animal_id;
        this.location = location;
    }

    public int getId() {
        return id;
    }


    public String getRangerName() {
        return rangerName;
    }


    public String getAnimal_id() {
        return animal_id;
    }

    public String getLocation() {
        return location;
    }
    //saving to the database
    @Override
    public void save() {
        try(Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO sightings (animal,location,ranger) VALUES (:animal_id,:location,:rangerName)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("animal", this.animal_id)
                    .addParameter("location",this.location)
                    .addParameter("ranger",this.rangerName)
                    .executeUpdate()
                    .getKey();
        }
    }
}
