package models;
import org.sql2o.*;

public class DB {
    //postgres://pkepmndwwvtrfq:aa31dea09eaa08225976f17f56e155d8cbc341ef18815a9e26391455f67d3a31@ec2-52-70-186-184.compute-1.amazonaws.com:5432/d38hdio77qgcrh
    //public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "eph1717", "eph1717");
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-52-70-186-184.compute-1.amazonaws.com:5432/d38hdio77qgcrh", "pkepmndwwvtrfq", "aa31dea09eaa08225976f17f56e155d8cbc341ef18815a9e26391455f67d3a31");

}

