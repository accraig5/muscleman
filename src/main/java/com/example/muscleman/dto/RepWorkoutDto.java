package com.example.muscleman.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class RepWorkoutDto {

    @NotNull
    private Integer id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String text;

    @NotNull
    @NotEmpty
    private String recRepsList;

    @NotNull
    private Integer recSets;

    @NotNull
    private Integer muscleGroup;

    @NotNull
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

    public String getRecRepsList() {
        return recRepsList;
    }

    public void setRecRepsList(String recRepsList) {
        this.recRepsList = recRepsList;
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
