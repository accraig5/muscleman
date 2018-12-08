package com.example.muscleman.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTimeWorkoutTest {

    @Test
    public void getUserId() {
        UserTimeWorkout reps = new UserTimeWorkout();
        reps.setUserId(12345);
        assertEquals((long)12345, (long)reps.getUserId());
    }

    @Test
    public void setUserId() {
        UserTimeWorkout reps = new UserTimeWorkout();
        reps.setUserId(12345);
        assertEquals((long)12345, (long)reps.getUserId());
    }

    @Test
    public void getWorkoutId() {
        UserTimeWorkout reps = new UserTimeWorkout();
        reps.setWorkoutId(12345);
        assertEquals((long)12345, (long)reps.getWorkoutId());
    }

    @Test
    public void setWorkoutId() {
        UserTimeWorkout reps = new UserTimeWorkout();
        reps.setWorkoutId(12345);
        assertEquals((long)12345, (long)reps.getWorkoutId());
    }

    @Test
    public void getTimeComplete() {
        UserTimeWorkout reps = new UserTimeWorkout();
        reps.setTimeComplete("1 hour");
        assertEquals("1 hour", reps.getTimeComplete());
    }

    @Test
    public void setTimeComplete() {
        UserTimeWorkout reps = new UserTimeWorkout();
        reps.setTimeComplete("1 hour");
        assertEquals("1 hour", reps.getTimeComplete());
    }

    @Test
    public void getCalories() {
        UserTimeWorkout reps = new UserTimeWorkout();
        reps.setCalories(1234);
        assertEquals(1234, (long)reps.getCalories());
    }

    @Test
    public void setCalories() {
        UserTimeWorkout reps = new UserTimeWorkout();
        reps.setCalories(1234);
        assertEquals(1234, (long)reps.getCalories());
    }

    @Test
    public void getDate() {
        UserTimeWorkout reps = new UserTimeWorkout();
        reps.setDate("October 5th");
        assertEquals("October 5th", reps.getDate());
    }

    @Test
    public void setDate() {
        UserTimeWorkout reps = new UserTimeWorkout();
        reps.setDate("October 5th");
        assertEquals("October 5th", reps.getDate());
    }
}