package com.example.muscleman.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "rep_workouts")
public class RepWorkout {

    @Id
    private Integer id;

    private String name;

    private String text;

    @Column(name = "recommended_reps")
    private ArrayList<Integer> recReps;

    @Column(name = "recommended_sets")
    private Integer recSets;

    @Column(name = "muscle_group")
    private Integer muscleGroup;

    @Column(name = "user_id")
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Integer> getRecReps() {
        return recReps;
    }

    public void setRecReps(ArrayList<Integer> recReps) {
        this.recReps = recReps;
    }

    public Integer getRecSets() {
        return recSets;
    }

    public void setRecSets(Integer recSets) {
        this.recSets = recSets;
    }

    public Integer getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(Integer muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
