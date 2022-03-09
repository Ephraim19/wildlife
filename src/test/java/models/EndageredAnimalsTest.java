package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndageredAnimalsTest {
    public DatabaseRule database = new DatabaseRule();

    @Test
    void TestIfGetHealthReturnsHealth() {
        EndageredAnimals animals = new EndageredAnimals("goat","newborn",EndageredAnimals.healthy);
        assertEquals("healthy",animals.getHealth());
    }
    @Test
    void TestIfGetAgeReturnsHealth() {
        EndageredAnimals animals = new EndageredAnimals("goat",EndageredAnimals.adult,EndageredAnimals.healthy);
        assertEquals("adult",animals.getAge());
    }
    @Test
    public void InstancesAreSaved() {
        EndageredAnimals animal=new EndageredAnimals("goat",EndageredAnimals.adult,EndageredAnimals.healthy);
        animal.save();
        assertEquals(EndageredAnimals.all().get(0), animal);
    }
}