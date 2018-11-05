package com.example.muscleman.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_time_workout")
public class UserTimeWorkout {


    @Id
    Integer user_id;
    @Id
    Integer workout_id;

    String timeComplete;
    Integer calories;
    String date;
}