package com.example.muscleman.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getUserId() {
        User user = new User();
        user.setUserId(123456);
        assertEquals((long)123456, (long)user.getUserId());
    }

    @Test
    public void setUserId() {
        User user = new User();
        user.setUserId(123456);
        assertEquals((long)123456, (long)user.getUserId());
    }

    @Test
    public void getFirstName() {
        User user = new User();
        user.setFirstName("John");
        assertEquals("John", user.getFirstName());
    }

    @Test
    public void setFirstName() {
        User user = new User();
        user.setFirstName("John");
        assertEquals("John", user.getFirstName());
    }

    @Test
    public void getLastName() {
        User user = new User();
        user.setLastName("Fillings");
        assertEquals("Fillings", user.getLastName());

    }

    @Test
    public void setLastName() {
        User user = new User();
        user.setLastName("Fillings");
        assertEquals("Fillings", user.getLastName());

    }

    @Test
    public void getUsername() {
        User user = new User();
        user.setUsername("JFills69");
        assertEquals("JFills69", user.getUsername());
    }

    @Test
    public void setUsername() {
        User user = new User();
        user.setUsername("JFills69");
        assertEquals("JFills69", user.getUsername());

    }

    @Test
    public void getEmail() {
        User user = new User();
        user.setEmail("John.Fillings@gmail.com");
        assertEquals("John.Fillings@gmail.com", user.getEmail());
    }

    @Test
    public void setEmail() {
        User user = new User();
        user.setEmail("John.Fillings@gmail.com");
        assertEquals("John.Fillings@gmail.com", user.getEmail());
    }

    @Test
    public void getPassword() {
        User user = new User();
        user.setPassword("Johniscool");
        assertEquals("Johniscool", user.getPassword());
    }

    @Test
    public void setPassword() {
        User user = new User();
        user.setPassword("Johniscool");
        assertEquals("Johniscool", user.getPassword());
    }

    @Test
    public void getId() {
        User user = new User();
        user.setId(123456);
        assertEquals((long)123456, (long)user.getId());
    }

    @Test
    public void setId() {
        User user = new User();
        user.setId(123456);
        assertEquals((long)123456, (long)user.getId());
    }
}