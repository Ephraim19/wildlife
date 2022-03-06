package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {
    @Test
    void AnimalInstatiatesCorrectly() {
        Animals animal = new Animals(1,"cow");
        assertTrue(animal.equals(animal));
    }

    @Test
    void getIdreturnsId() {
        Animals animal = new Animals(1,"cow");
        assertEquals(1,animal.getId());
    }

    @Test
    void getNamereturnsName() {
        Animals animal = new Animals(1,"cow");
        assertEquals("cow",animal.getName());
    }
}