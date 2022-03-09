package models;

import org.sql2o.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
public class DatabaseRule {

    @BeforeEach
    protected void before() {
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "eph1717", "eph1717");  //Those with linux or windows use two strings for username and password
    }

    @AfterEach
    protected void after() {
        try(Connection con = DB.sql2o.open()) {
            String deletePersonsQuery = "DELETE FROM persons *;";
            con.createQuery(deletePersonsQuery).executeUpdate();
        }
    }

}
