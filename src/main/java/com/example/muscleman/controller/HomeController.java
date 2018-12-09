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

import java.util.ArrayList;
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

    @GetMapping("/userIndex")
    public String userIndex() {
        return "userIndex";
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
        return "test";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(WebRequest request, Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }

    @RequestMapping(value = "/addWorkoutRep", method = RequestMethod.GET)
    public String addWorkoutRep(WebRequest request, Model model) {
        RepWorkoutDto repWorkoutDto = new RepWorkoutDto();
        model.addAttribute("workout", repWorkoutDto);
        return "addWorkoutRep";
    }

    @RequestMapping(value = "/editWorkoutRep", method = RequestMethod.GET)
    public String editWorkoutRep(WebRequest request, Model model) {
        RepWorkoutDto repWorkoutDto = new RepWorkoutDto();
        model.addAttribute("workout", repWorkoutDto);
        return "editWorkoutRep";
    }

    @RequestMapping(value = "/viewWorkouts", method = RequestMethod.GET)
    public String viewWorkouts(Model model) {
        List<RepWorkout> repWorkouts = repWorkoutRepository.findAll();
        ArrayList<RepWorkoutDto> repWorkoutDtos = new ArrayList<>();
        for (RepWorkout r : repWorkouts) {
            RepWorkoutDto repWorkoutDto = new RepWorkoutDto();
            repWorkoutDto.setId(r.getId());
            repWorkoutDto.setMuscleGroup(r.getMuscleGroup());
            repWorkoutDto.setName(r.getName());
            repWorkoutDto.setRecReps(r.getRecReps());
            repWorkoutDto.setRecSets(r.getRecSets());
            repWorkoutDto.setText(r.getText());
            repWorkoutDto.setUserId(r.getUserId());
            repWorkoutDtos.add(repWorkoutDto);
        }
        model.addAttribute("workouts", repWorkoutDtos);

        return "viewWorkouts";
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound() {
        return "error";
    }
}
