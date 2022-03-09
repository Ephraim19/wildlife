package models;

import org.sql2o.Connection;

public class Sightings implements WildlifeInterface {
    private int id;
    private String ranger;
    private String animal_id;
    private String location;

    public Sightings(String animal_id,  String location, String ranger) {
        this.id = id;
        this.animal_id = animal_id;
        this.location = location;
        this.ranger = ranger;
    }

    public int getId() {
        return id;
    }


    public String getRanger() {
        return ranger;
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
            String sql = "INSERT INTO sights (animal_id,location,ranger) VALUES (:animal_id,:location,:ranger)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("animal_id", this.animal_id)
                    .addParameter("location",this.location)
                    .addParameter("ranger",this.ranger)
                    .executeUpdate()
                    .getKey();
        }
    }
}
