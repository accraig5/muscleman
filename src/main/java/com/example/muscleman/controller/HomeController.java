package com.example.muscleman.controller;

import com.example.muscleman.dto.RepWorkoutDto;
import com.example.muscleman.dto.UserDto;
import com.example.muscleman.dto.UserRepWorkoutDto;
import com.example.muscleman.model.RepWorkout;
import com.example.muscleman.model.UserRepWorkout;
import com.example.muscleman.repository.RepWorkoutRepository;
import com.example.muscleman.repository.UserRepWorkoutRepository;
import com.example.muscleman.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;
import java.util.Random;

@Controller
public class HomeController {

    @Autowired
    private RepWorkoutRepository repWorkoutRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRepWorkoutRepository userRepWorkoutRepository;

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

    @GetMapping("/users/profile")
    public String userProfile() {
        return "users/profile";
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
    public String editWorkoutRep(WebRequest request, Model model, @ModelAttribute("workoutId") Integer id) {
        RepWorkoutDto repWorkoutDto = new RepWorkoutDto();
        if (id != null) {
            repWorkoutDto.setId(id);
            RepWorkout repWorkout = repWorkoutRepository.findById(id).orElse(null);
            repWorkoutDto.setUserId(repWorkout.getUserId());
            repWorkoutDto.setName(repWorkout.getName());
            repWorkoutDto.setText(repWorkout.getText());
            repWorkoutDto.setRecSets(repWorkout.getRecSets());
            repWorkoutDto.setName(repWorkout.getName());
            repWorkoutDto.setMuscleGroup(repWorkout.getMuscleGroup());
            String list = "";
            for (int i = 0; i < repWorkout.getRecReps().size() - 1; i++)
                list += repWorkout.getRecReps().get(i) + ", ";
            list += repWorkout.getRecReps().get(repWorkout.getRecReps().size() - 1);
            repWorkoutDto.setRecRepsList(list);
        }
        model.addAttribute("workout", repWorkoutDto);
        return "workouts/edit";
    }

    @RequestMapping(value = "/workouts/view", method = RequestMethod.GET)
    public String viewWorkouts(Model model) {
        List<RepWorkout> repWorkouts = repWorkoutRepository.findAll();
        String username = null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            username = authentication.getName();
        }
        Integer userId = userRepository.findByUsername(username).getUserId();
        repWorkouts.removeIf(r -> r.getUserId() != userId && r.getUserId() != -1);

        model.addAttribute("workouts", repWorkouts);
        return "workouts/view";
    }

    @RequestMapping(value = "/users/completed", method = RequestMethod.GET)
    public String viewCompleted(Model model) {
        List<UserRepWorkout> userRepWorkouts = userRepWorkoutRepository.findAll();
        model.addAttribute("workouts", userRepWorkouts);
        return "users/completed";
    }

    @RequestMapping(value = "/workouts/start", method = RequestMethod.GET)
    public String startWorkout(Model model) {
        List<RepWorkout> repWorkouts = repWorkoutRepository.findAll();
        Random random = new Random();
        Integer rand = random.nextInt(repWorkouts.size());
        model.addAttribute("workout", repWorkouts.get(rand));
        model.addAttribute("userWorkout", new UserRepWorkoutDto());

        return "workouts/start";
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound() {
        return "error";
    }
}
