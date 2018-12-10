package com.example.muscleman.controller;

import com.example.muscleman.dto.RepWorkoutDto;
import com.example.muscleman.dto.UserRepWorkoutDto;
import com.example.muscleman.model.UserRepWorkout;
import com.example.muscleman.repository.UserRepWorkoutRepository;
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

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class StartWorkoutController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRepWorkoutRepository userRepWorkoutRepository;

    @RequestMapping(value = "/workouts/start", method = RequestMethod.POST)
    public ModelAndView startWorkoutRep(
            @ModelAttribute("userWorkout") UserRepWorkoutDto userRepWorkoutDto,
            @ModelAttribute("workout") RepWorkoutDto repWorkoutDto,
            BindingResult result,
            WebRequest request,
            Errors errors) {
        UserRepWorkout userRepWorkout = new UserRepWorkout();
        Integer max = -1;
        ArrayList<UserRepWorkout> userRepWorkouts = new ArrayList<>(userRepWorkoutRepository.findAll());
        for (UserRepWorkout r : userRepWorkouts) {
            if (r.getId() > max)
                max = r.getId();
        }
        max = max + 1;
        userRepWorkout.setId(max);
        //userRepWorkout.setWorkoutId(repWorkoutDto.getId());
        userRepWorkout.setName(userRepWorkoutDto.getName());
        userRepWorkout.setSetsComplete(userRepWorkoutDto.getSetsComplete());
        ArrayList<Integer> repsComplete = new ArrayList<>();
        ArrayList<String> repsCompleteStr = new ArrayList<>(Arrays.asList(userRepWorkoutDto.getRepsComplete().replaceAll("\\s+","").split(",")));
        for (String s : repsCompleteStr) {
            repsComplete.add(Integer.parseInt(s));
        }
        ArrayList<Integer> weight = new ArrayList<>();
        ArrayList<String> weightStr = new ArrayList<>(Arrays.asList(userRepWorkoutDto.getWeight().replaceAll("\\s+","").split(",")));
        for (String s : weightStr) {
            weight.add(Integer.parseInt(s));
        }

        userRepWorkout.setRepsComplete(repsComplete);
        userRepWorkout.setWeight(weight);

        String username = null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            username = authentication.getName();
        }
        userRepWorkout.setUserId(username == null ? -1 : userRepository.findByUsername(username).getUserId());

        userRepWorkout.setDate(Date.from(Instant.now()).toString());

        userRepWorkoutRepository.save(userRepWorkout);
        return new ModelAndView("redirect:" + "/workouts/start");
    }
}
