package com.example.muscleman.dto;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserDtoTest {

    @Test
    public void getFirstName() {
        UserDto dto = new UserDto();
        dto.setFirstName("John");
        assertEquals("John", dto.getFirstName());
    }

    @Test
    public void setFirstName() {
        UserDto dto = new UserDto();
        dto.setFirstName("John");
        assertEquals("John", dto.getFirstName());
    }

    @Test
    public void getLastName() {
        UserDto dto = new UserDto();
        dto.setLastName("Fillings");
        assertEquals("Fillings", dto.getLastName());
    }

    @Test
    public void setLastName() {
        UserDto dto = new UserDto();
        dto.setLastName("Fillings");
        assertEquals("Fillings", dto.getLastName());
    }

    @Test
    public void getPassword() {
        UserDto dto = new UserDto();
        dto.setPassword("Johniscool");
        assertEquals("Johniscool", dto.getPassword());
    }

    @Test
    public void setPassword() {
        UserDto dto = new UserDto();
        dto.setPassword("Johniscool");
        assertEquals("Johniscool", dto.getPassword());
    }

    @Test
    public void getMatchingPassword() {
        UserDto dto = new UserDto();
        dto.setMatchingPassword("johnisnotcool");
        assertEquals("johnisnotcool", dto.getMatchingPassword());
    }

    @Test
    public void setMatchingPassword() {
        UserDto dto = new UserDto();
        dto.setMatchingPassword("johnisnotcool");
        assertEquals("johnisnotcool", dto.getMatchingPassword());
    }

    @Test
    public void getEmail() {
        UserDto dto = new UserDto();
        dto.setEmail("John.Fillings@gmail.com");
        assertEquals("John.Fillings@gmail.com", dto.getEmail());
    }

    @Test
    public void setEmail() {
        UserDto dto = new UserDto();
        dto.setEmail("John.Fillings@gmail.com");
        assertEquals("John.Fillings@gmail.com", dto.getEmail());
    }

    @Test
    public void getUsername() {
        UserDto dto = new UserDto();
        dto.setUsername("JFills69");
        assertEquals("JFills69", dto.getUsername());
    }

    @Test
    public void setUsername() {
        UserDto dto = new UserDto();
        dto.setUsername("JFills69");
        assertEquals("JFills69", dto.getUsername());
    }
}