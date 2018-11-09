package com.example.muscleman.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_rep_workout")
public class UserRepWorkout {


    @Id
    Integer user_id;

    Integer workout_id;

    ArrayList<Integer> repsComplete;
    
    Integer setsComplete;
    
    ArrayList<Integer> weight;
    
    String date;
}
