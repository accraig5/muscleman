package com.example.muscleman.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserRepWorkoutDto {

    @NotNull
    private Integer userId;

    @NotNull
    private Integer workoutId;

    @NotNull
    @NotEmpty
    private String repsComplete;

    @NotNull
    private Integer setsComplete;

    @NotNull
    @NotEmpty
    private String weight;

    @NotNull
    @NotEmpty
    private String date;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(Integer workoutId) {
        this.workoutId = workoutId;
    }

    public String getRepsComplete() {
        return repsComplete;
    }

    public void setRepsComplete(String repsComplete) {
        this.repsComplete = repsComplete;
    }

    public Integer getSetsComplete() {
        return setsComplete;
    }

    public void setSetsComplete(Integer setsComplete) {
        this.setsComplete = setsComplete;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
