package com.example.muscleman.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepWorkoutTest {

    @Test
    public void getId() {
        RepWorkout reps = new RepWorkout();
        reps.setId(12345);
        assertEquals((long)12345, (long)reps.getId());
    }

    @Test
    public void setId() {
        RepWorkout reps = new RepWorkout();
        reps.setId(12345);
        assertEquals((long)12345, (long)reps.getId());
    }

    @Test
    public void getName() {
        RepWorkout reps = new RepWorkout();
        reps.setName("Deadlift");
        assertEquals("Deadlift", reps.getName());
    }

    @Test
    public void setName() {
        RepWorkout reps = new RepWorkout();
        reps.setName("Deadlift");
        assertEquals("Deadlift", reps.getName());
    }

    @Test
    public void getText() {
        RepWorkout reps = new RepWorkout();
        reps.setText("Deadlift");
        assertEquals("Deadlift", reps.getText());
    }

    @Test
    public void setText() {
        RepWorkout reps = new RepWorkout();
        reps.setText("Deadlift");
        assertEquals("Deadlift", reps.getText());
    }

    @Test
    public void getRecReps() {
        RepWorkout reps = new RepWorkout();
        reps.setRecReps(10);
        assertEquals(10, (long)reps.getRecReps());
    }

    @Test
    public void setRecReps() {
        RepWorkout reps = new RepWorkout();
        reps.setRecReps(10);
        assertEquals(10, (long)reps.getRecReps());
    }

    @Test
    public void getRecSets() {
        RepWorkout reps = new RepWorkout();
        reps.setRecSets(10);
        assertEquals(10, (long)reps.getRecSets());
    }

    @Test
    public void setRecSets() {
        RepWorkout reps = new RepWorkout();
        reps.setRecSets(10);
        assertEquals(10, (long)reps.getRecSets());
    }
}