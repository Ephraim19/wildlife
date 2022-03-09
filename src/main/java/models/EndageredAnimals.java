package models;

import org.sql2o.Connection;

public class EndageredAnimals extends AnimalsInherit{
    private String health;
    private String age;
    public static final String healthy="healthy";
    public static final String ill="ill";
    public static final String okay ="okay";
    public static final String newborn="newborn";
    public static final String young="young";
    public static final String adult="adult";

    public EndageredAnimals( String name, String health, String age) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.age = age;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }
    //save to database
    @Override
    public void save() {

        try (Connection con=DB.sql2o.open()){


            String sql ="INSERT INTO animals (name,type,health,age) VALUES (:name,:type,:health,:age)";

            this.id=(int) con.createQuery(sql,true)
                    .addParameter("name",this.name)
                    .addParameter("health",this.health)
                    .addParameter("age",this.age)
                    .executeUpdate()
                    .getKey();
        }

    }
}










