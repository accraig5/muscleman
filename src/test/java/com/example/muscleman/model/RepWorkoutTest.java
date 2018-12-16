package com.example.muscleman.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        reps.setRecReps(arrayList);
        assertEquals(arrayList, reps.getRecReps());
    }

    @Test
    public void setRecReps() {
        RepWorkout reps = new RepWorkout();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        reps.setRecReps(arrayList);
        assertEquals(arrayList, reps.getRecReps());
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

    @Test
    public void getMuscleGroup() {
        RepWorkout reps = new RepWorkout();
        reps.setMuscleGroup(10);
        assertEquals(10, (long)reps.getMuscleGroup());
    }

    @Test
    public void setMuscleGroup() {
        RepWorkout reps = new RepWorkout();
        reps.setMuscleGroup(10);
        assertEquals(10, (long)reps.getMuscleGroup());
    }

    @Test
    public void getUserId() {
        RepWorkout reps = new RepWorkout();
        reps.setUserId(1);
        assertEquals(1, (long)reps.getUserId());
    }

    @Test
    public void setUserId() {
        RepWorkout reps = new RepWorkout();
        reps.setUserId(1);
        assertEquals(1, (long)reps.getUserId());
    }
}