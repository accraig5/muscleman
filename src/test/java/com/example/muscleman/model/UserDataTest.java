package com.example.muscleman.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserDataTest {

    @Test
    public void getId() {
        UserData data = new UserData();
        data.setId(12345);
        assertEquals(12345, (long)data.getId());
    }

    @Test
    public void setId() {
        UserData data = new UserData();
        data.setId(12345);
        assertEquals(12345, (long)data.getId());
    }

    @Test
    public void getAge() {
        UserData data = new UserData();
        data.setAge(12);
        assertEquals(12, (long)data.getAge());

    }

    @Test
    public void setAge() {
        UserData data = new UserData();
        data.setAge(12);
        assertEquals(12, (long)data.getAge());
    }

    @Test
    public void getHeight() {
        UserData data = new UserData();
        data.setHeight(12.0);
        assertEquals(12.0, (Object)data.getHeight());
    }

    @Test
    public void setHeight() {
        UserData data = new UserData();
        data.setHeight(12.0);
        assertEquals(12.0, (Object)data.getHeight());
    }

    @Test
    public void getWeight() {
        UserData data = new UserData();
        data.setWeight(12.0);
        assertEquals(12.0, (Object)data.getWeight());
    }

    @Test
    public void setWeight() {
        UserData data = new UserData();
        data.setWeight(12.0);
        assertEquals(12.0, (Object)data.getWeight());
    }
}