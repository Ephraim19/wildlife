package models;
import org.sql2o.*;

import java.util.List;

public class Animals extends AnimalsInherit {
    public Animals( String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    //returns all objects in database
    public static List<Animals> all() {
        String sql = "SELECT * FROM animals";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Animals.class);
        }
    }

    //saving to the database
    public void save() {
        try(Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name) VALUES (:name)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .executeUpdate()
                    .getKey();
        }
    }

    //deleting from database
    public void delete(){
        try (Connection con=DB.sql2o.open()){
            String sql = "DELETE FROM animals WHERE id=:id";
            con.createQuery(sql)
                    .addParameter("id",this.id)
                    .executeUpdate();

        }
    }

}













