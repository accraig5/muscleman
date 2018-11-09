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
    @Column(name = "user_id")
    Integer userId;

    @Column(name = "workout_id")
    Integer workoutId;

    ArrayList<Integer> repsComplete;
    
    Integer setsComplete;
    
    ArrayList<Integer> weight;
    
    String date;

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
