package com.example.muscleman.controller;

import com.example.muscleman.dto.RepWorkoutDto;
import com.example.muscleman.model.RepWorkout;
import com.example.muscleman.repository.RepWorkoutRepository;
import com.example.muscleman.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class AddWorkoutController {

    @Autowired
    private RepWorkoutRepository repWorkoutRepository;

    @Autowired
    private UserRepository userRepository;


    @RequestMapping(value = "/workouts/add", method = RequestMethod.POST)
    public ModelAndView addWorkoutRep(
            @ModelAttribute("workout") @Valid RepWorkoutDto repWorkoutDto,
            BindingResult result,
            WebRequest request,
            Errors errors) {
        RepWorkout repWorkout = new RepWorkout();
        repWorkout.setId(repWorkoutRepository.findAll().get(repWorkoutRepository.findAll().size()).getId() + 1);
        repWorkout.setName(repWorkoutDto.getName());
        ArrayList<String> recRepsStr = new ArrayList<>(Arrays.asList(repWorkoutDto.getRecRepsList().replaceAll("\\s+","").split(",")));
        ArrayList<Integer> recReps = new ArrayList<>();
        recRepsStr.forEach(x -> recReps.add(Integer.parseInt(x)));
        repWorkout.setRecReps(recReps);
        repWorkout.setRecSets(repWorkoutDto.getRecSets());
        repWorkout.setText(repWorkoutDto.getText());

        String username = null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            username = authentication.getName();
        }
        repWorkout.setUserId(username == null ? -1 : userRepository.findByUsername(username).getUserId());

        repWorkout.setMuscleGroup(repWorkoutDto.getMuscleGroup());
        repWorkoutRepository.save(repWorkout);
        return new ModelAndView("redirect:" + "/workouts/view");
    }
}
