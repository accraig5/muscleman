package com.example.muscleman.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MuscleGroupTest {

    @Test
    public void getId() {
        MuscleGroup group = new MuscleGroup();
        group.setId(12345);
        assertEquals((long)12345, (long)group.getId());
    }

    @Test
    public void setId() {
        MuscleGroup group = new MuscleGroup();
        group.setId(12345);
        assertEquals((long)12345, (long)group.getId());
    }

    @Test
    public void getName() {
        MuscleGroup group = new MuscleGroup();
        group.setName("John");
        assertEquals("John", group.getName());
    }

    @Test
    public void setName() {
        MuscleGroup group = new MuscleGroup();
        group.setName("John");
        assertEquals("John", group.getName());
    }
}