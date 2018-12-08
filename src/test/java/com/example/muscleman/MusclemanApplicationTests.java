package com.example.muscleman;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.muscleman.dto.UserDto;
import com.example.muscleman.model.User;
import com.example.muscleman.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MusclemanApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void UserModelTest() {
        User user = new User();

        user.setFirstName("John");
        assertEquals("John", user.getFirstName());

        user.setLastName("Fillings");
        assertEquals("Fillings", user.getLastName());

        user.setEmail("John.Fillings@gmail.com");
        assertEquals("John.Fillings@gmail.com", user.getEmail());

        user.setUsername("JFills69");
        assertEquals("JFills69", user.getUsername());

        user.setPassword("Johniscool");
        assertEquals("Johniscool", user.getPassword());

        user.setId(123456);
        assertEquals((long)123456, (long)user.getId());

        user.setUserId(123456);
        assertEquals((long)123456, (long)user.getUserId());
    }


}
