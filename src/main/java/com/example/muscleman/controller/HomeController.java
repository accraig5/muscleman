package com.example.muscleman.controller;

import com.example.muscleman.dto.RepWorkoutDto;
import com.example.muscleman.dto.UserDto;
import com.example.muscleman.model.RepWorkout;
import com.example.muscleman.repository.RepWorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private RepWorkoutRepository repWorkoutRepository;

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/users/index")
    public String userIndex() {
        return "users/index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @GetMapping("/test")
    public String test() {
        return "test/test";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(WebRequest request, Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }

    @RequestMapping(value = "/workouts/add", method = RequestMethod.GET)
    public String addWorkoutRep(WebRequest request, Model model) {
        RepWorkoutDto repWorkoutDto = new RepWorkoutDto();
        model.addAttribute("workout", repWorkoutDto);
        return "workouts/add";
    }

    @RequestMapping(value = "/workouts/edit", method = RequestMethod.GET)
    public String editWorkoutRep(WebRequest request, Model model, @ModelAttribute("workoutName") String name) {
        RepWorkoutDto repWorkoutDto = new RepWorkoutDto();
        repWorkoutDto.setName(name);
        model.addAttribute("workout", repWorkoutDto);
        return "workouts/edit";
    }

    @RequestMapping(value = "/workouts/view", method = RequestMethod.GET)
    public String viewWorkouts(Model model) {
        List<RepWorkout> repWorkouts = repWorkoutRepository.findAll();
        model.addAttribute("workouts", repWorkouts);

        return "workouts/view";
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound() {
        return "error";
    }
}
