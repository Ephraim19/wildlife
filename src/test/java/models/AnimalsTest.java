package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {

    public DatabaseRule database = new DatabaseRule();

    @Test
    void AnimalInstantiatesCorrectly() {
        Animals animal = new Animals("cow");
        assertEquals(true,animal instanceof Animals);
    }
//
//    @Test
//    void getIdreturnsId() {
//        Animals animal = new Animals("cow");
//        assertEquals(1,animal.getId());
//    }

    @Test
    void getNameReturnsName() {
        Animals animal = new Animals("cow");
        assertEquals("cow",animal.getName());
    }

    @Test
    public void InstancesAreSaved() {
        Animals animal=new Animals("cow");
        animal.save();
        assertEquals(Animals.all().get(0), animal);
    }
    @Test
    public void save_assignsIdToObject() {
        Animals animal = new Animals("cow");
        animal.save();
        Animals savedAnimal = Animals.all().get(0);
        assertEquals(animal.getId(), savedAnimal.getId());
    }
}








