package com.example.muscleman.controller;

import com.example.muscleman.dto.RepWorkoutDto;
import com.example.muscleman.model.RepWorkout;
import com.example.muscleman.repository.RepWorkoutRepository;
import com.example.muscleman.repository.TimeWorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.validation.Valid;

@Controller
public class AddWorkoutController {

    @Autowired
    private RepWorkoutRepository repWorkoutRepository;

    @Autowired
    private TimeWorkoutRepository timeWorkoutRepository;

    @RequestMapping(value = "/workouts/add", method = RequestMethod.POST)
    public String addWorkoutRep(
            @ModelAttribute("workout") @Valid RepWorkoutDto repWorkoutDto,
            BindingResult result,
            WebRequest request,
            Errors errors) {
        RepWorkout repWorkout = new RepWorkout();
        repWorkout.setId(repWorkoutDto.getId());
        repWorkout.setName(repWorkoutDto.getName());
        repWorkout.setRecReps(repWorkoutDto.getRecReps());
        repWorkout.setRecSets(repWorkoutDto.getRecSets());
        repWorkout.setText(repWorkoutDto.getText());
        repWorkout.setUserId(repWorkout.getUserId() == null ? -1 : repWorkout.getUserId());
        repWorkout.setMuscleGroup(repWorkout.getMuscleGroup());
        repWorkoutRepository.save(repWorkout);
        return "addWorkoutRep";
    }
}
