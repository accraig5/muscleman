package com.example.muscleman.model;

import org.junit.Test;
import org.springframework.security.core.authority.mapping.Attributes2GrantedAuthoritiesMapper;

import static org.junit.Assert.*;

public class TimeWorkoutTest {

    @Test
    public void getId() {
        TimeWorkout time = new TimeWorkout();
        time.setId(12345);
        assertEquals(12345, (long)time.getId());
    }

    @Test
    public void setId() {
        TimeWorkout time = new TimeWorkout();
        time.setId(12345);
        assertEquals(12345, (long)time.getId());
    }

    @Test
    public void getName() {
        TimeWorkout time = new TimeWorkout();
        time.setName("Treadmill");
        assertEquals("Treadmill", time.getName());
    }

    @Test
    public void setName() {
        TimeWorkout time = new TimeWorkout();
        time.setName("Treadmill");
        assertEquals("Treadmill", time.getName());
    }

    @Test
    public void getDescription() {
        TimeWorkout time = new TimeWorkout();
        time.setDescription("Treadmill");
        assertEquals("Treadmill", time.getDescription());
    }

    @Test
    public void setDescription() {
        TimeWorkout time = new TimeWorkout();
        time.setDescription("Treadmill");
        assertEquals("Treadmill", time.getDescription());
    }

    @Test
    public void getRecTime() {
        TimeWorkout time = new TimeWorkout();
        time.setRecTime("10 mins");
        assertEquals("10 mins", time.getRecTime());

    }

    @Test
    public void setRecTime() {
        TimeWorkout time = new TimeWorkout();
        time.setRecTime("10 mins");
        assertEquals("10 mins", time.getRecTime());
    }
}