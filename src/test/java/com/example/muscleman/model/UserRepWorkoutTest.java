package com.example.muscleman.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class UserRepWorkoutTest {

    @Test
    public void getId() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setId(12345);
        assertEquals((long)12345, (long)reps.getId());
    }

    @Test
    public void setId() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setId(12345);
        assertEquals((long)12345, (long)reps.getId());
    }

    @Test
    public void getUserId() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setUserId(12345);
        assertEquals((long)12345, (long)reps.getUserId());
    }

    @Test
    public void setUserId() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setUserId(12345);
        assertEquals((long)12345, (long)reps.getUserId());
    }

    @Test
    public void getWorkoutId() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setWorkoutId(12345);
        assertEquals((long)12345, (long)reps.getWorkoutId());
    }

    @Test
    public void setWorkoutId() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setWorkoutId(12345);
        assertEquals((long)12345, (long)reps.getWorkoutId());
    }


    @Test
    public void getName() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setName("name");
        assertEquals("name", reps.getName());
    }

    @Test
    public void setName() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setName("name");
        assertEquals("name", reps.getName());
    }

    @Test
    public void getRepsComplete() {
        UserRepWorkout reps = new UserRepWorkout();
        ArrayList<Integer> rep = new ArrayList<Integer>();
        rep.add(12);
        rep.add(10);
        reps.setRepsComplete(rep);
        assertEquals(true, reps.getRepsComplete().contains(12));
        assertEquals(true, reps.getRepsComplete().contains(10));
    }

    @Test
    public void setRepsComplete() {
        UserRepWorkout reps = new UserRepWorkout();
        ArrayList<Integer> rep = new ArrayList<Integer>();
        rep.add(12);
        rep.add(10);
        reps.setRepsComplete(rep);
        assertEquals(true, reps.getRepsComplete().contains(12));
        assertEquals(true, reps.getRepsComplete().contains(10));
    }

    @Test
    public void getSetsComplete() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setSetsComplete(12345);
        assertEquals(12345, (long)reps.getSetsComplete());
    }

    @Test
    public void setSetsComplete() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setSetsComplete(12345);
        assertEquals(12345, (long)reps.getSetsComplete());
    }

    @Test
    public void getWeight() {
        UserRepWorkout reps = new UserRepWorkout();
        ArrayList<Integer> weight = new ArrayList<Integer>();
        weight.add(12);
        weight.add(10);
        reps.setWeight(weight);
        assertEquals(true, reps.getWeight().contains(12));
        assertEquals(true, reps.getWeight().contains(10));
    }

    @Test
    public void setWeight() {
        UserRepWorkout reps = new UserRepWorkout();
        ArrayList<Integer> weight = new ArrayList<Integer>();
        weight.add(12);
        weight.add(10);
        reps.setWeight(weight);
        assertEquals(true, reps.getWeight().contains(12));
        assertEquals(true, reps.getWeight().contains(10));
    }

    @Test
    public void getDate() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setDate("October");
        assertEquals("October", reps.getDate());
    }

    @Test
    public void setDate() {
        UserRepWorkout reps = new UserRepWorkout();
        reps.setDate("October");
        assertEquals("October", reps.getDate());
    }
}