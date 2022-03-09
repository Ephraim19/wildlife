package models;

import org.sql2o.Connection;

import java.util.List;

public class EndageredAnimals extends AnimalsInherit{
    private String health;
    private String age;
    public static final String healthy="healthy";
    public static final String ill="ill";
    public static final String okay ="okay";
    public static final String newborn="newborn";
    public static final String young="young";
    public static final String adult="adult";

    public EndageredAnimals(String name, String age, String health) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.health = health;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    //returns all objects in database
    public static List<EndageredAnimals> all() {
        String sql = "SELECT * FROM endangered";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(EndageredAnimals.class);
        }
    }


    //saving to database
    @Override
    public void save() {

        try (Connection con=DB.sql2o.open()){


            String sql ="INSERT INTO endangered (name,age,health) VALUES (:name,:age,:health)";

            this.id=(int) con.createQuery(sql,true)
                    .addParameter("name",this.name)
                    .addParameter("age",this.age)
                    .addParameter("health",this.health)
                    .executeUpdate()
                    .getKey();
        }

    }
}










