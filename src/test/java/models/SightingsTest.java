package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SightingsTest {
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void InstancesAreSaved() {
        Animals animal=new Animals("cow");
        animal.save();
        assertEquals(Animals.all().get(0), animal);
    }

}