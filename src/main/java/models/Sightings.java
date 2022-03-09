package models;

import org.sql2o.Connection;

import java.util.Date;
import java.sql.Timestamp;
public class Sightings implements WildlifeInterface {
    private int id;
    private String ranger;
    private String animal_id;
    private String location;
    private Timestamp time;

    public Sightings(String animal_id,  String location, String ranger) {
        this.id = id;
        this.animal_id = animal_id;
        this.location = location;
        this.ranger = ranger;
        this.time = new Timestamp(new Date().getTime());
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
            String sql = "INSERT INTO sights (animal_id,location,ranger,time) VALUES (:animal_id,:location,:ranger,:time)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("animal_id", this.animal_id)
                    .addParameter("location",this.location)
                    .addParameter("ranger",this.ranger)
                    .addParameter("time",this.time)
                    .executeUpdate()
                    .getKey();
        }
    }
}
