package com.example.muscleman.controller;

import com.example.muscleman.dto.UserDto;
import com.example.muscleman.model.User;
import com.example.muscleman.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Bean
    private PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registerUser(
            @ModelAttribute("user") @Valid UserDto userDto,
            BindingResult result,
            WebRequest request,
            Errors errors) {
        User user = new User();
        user.setPassword(passwordEncoder().encode(userDto.getPassword()));
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setUsername(userDto.getUsername());
        Integer size = userRepository.findAll().size();
        user.setUserId(size);
        user.setId(size);
        userRepository.save(user);
        return "login";
    }
}
