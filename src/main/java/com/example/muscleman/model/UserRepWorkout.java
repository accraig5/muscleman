package com.example.muscleman.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_rep_workout")
public class UserRepWorkout {


    @Id
    Integer user_id;
    @Id
    Integer workout_id;

    Integer repsComplete[];
    Integer setsComplete;
    Integer weight[];
    String date;
}
