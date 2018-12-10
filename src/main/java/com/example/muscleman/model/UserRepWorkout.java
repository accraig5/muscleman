package com.example.muscleman.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "user_rep_workout")
public class UserRepWorkout {

    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "workout_id")
    private Integer workoutId;

    private String name;

    private ArrayList<Integer> repsComplete;

    private Integer setsComplete;

    private ArrayList<Integer> weight;

    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getRepsComplete() {
        return repsComplete;
    }

    public void setRepsComplete(ArrayList<Integer> repsComplete) {
        this.repsComplete = repsComplete;
    }

    public Integer getSetsComplete() {
        return setsComplete;
    }

    public void setSetsComplete(Integer setsComplete) {
        this.setsComplete = setsComplete;
    }

    public ArrayList<Integer> getWeight() {
        return weight;
    }

    public void setWeight(ArrayList<Integer> weight) {
        this.weight = weight;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
